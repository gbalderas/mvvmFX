package de.saxsys.mvvmfx.scopes.scopeprovider;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import de.saxsys.mvvmfx.scopes.scopeprovider.example1.ChildViewModel;
import de.saxsys.mvvmfx.scopes.scopeprovider.example1.ParentView;
import de.saxsys.mvvmfx.scopes.scopeprovider.example1.ParentViewModel;
import de.saxsys.mvvmfx.scopes.scopeprovider.example2.*;
import de.saxsys.mvvmfx.scopes.scopeprovider.example3.MyScope3;
import de.saxsys.mvvmfx.scopes.scopeprovider.example3.MyView;
import de.saxsys.mvvmfx.scopes.scopeprovider.example3.MyViewModel;
import de.saxsys.mvvmfx.scopes.scopeprovider.example4.*;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NoViewModelInjectionTest {


	@Test
	public void parentViewModelNotInjectedTest() {
		ViewTuple<ParentView, ParentViewModel> load = FluentViewLoader.fxmlView(ParentView.class).load();

		assertThat(load.getView()).isNotNull();
		assertThat(load.getCodeBehind()).isNotNull();
		assertThat(load.getViewModel()).isNotNull();

		ChildViewModel childViewModel = ChildViewModel.instance;
		assertThat(childViewModel).isNotNull();
		assertThat(childViewModel.getScope()).isNotNull();

		assertThat(childViewModel.getScope().i).isEqualTo(1);

	}

	@Test
	public void viewModelNotInjectedTest() {

		// 		    Parent
		//		A(SP)       D
		//	  B   C	    E(SP)  G
		//			    F

		FluentViewLoader.fxmlView(de.saxsys.mvvmfx.scopes.scopeprovider.example2.ParentView.class).load();

		BViewModel bViewModel = BViewModel.instance;
		assertNotNull(bViewModel);
		assertNotNull(bViewModel.scope);
		assertEquals(bViewModel.scope.number, 1);

		CViewModel cViewModel = CViewModel.instance;
		assertNotNull(cViewModel);
		assertNotNull(cViewModel.scope);
		assertEquals(cViewModel.scope.number, 1);


		//with private fields
		FViewModel fViewModel = FViewModel.instance;
		assertNotNull(fViewModel);
		assertNotNull(fViewModel.getScope1());
		assertNotNull(fViewModel.getScope2());

		assertEquals(fViewModel.getScope1().number, 1);
		assertEquals(fViewModel.getScope2().number, 2);

	}

	/*	parallels example5test
		If the ViewModel is ScopeProvider or has a scope injection a new instance will be made.
		As a scope provider or scope reciever, the scopes will be instantiated and injected to the ViewModels instances
		correctly.
		Because the FluentViewLoader cannot find ViewModel instance in the View, it creates a new one to give back
		through the ViewTuple. This new instance does not inject scopes in its ViewModel and is not the same as the
		one that provided the Scopes.*/
	@Test
	@Ignore
	public void providedScopesTest() {
		MyScope3 myScope = new MyScope3();
	//	MyViewModel myViewModel = new MyViewModel();
		ViewTuple<MyView, MyViewModel> viewTuple = FluentViewLoader.fxmlView(MyView.class)
	//			.viewModel(myViewModel)
				.providedScopes(myScope)
				.load();

		assertThat(viewTuple.getViewModel().scope).isSameAs(myScope);

	}


	@Test
	public void multipleScopeProvidersTest(){

		// 		    Parent(SP)
		//		A(SP)       D
		//	  B   C	    E(SP)  G
		//			    F

		FluentViewLoader.fxmlView(Example4ParentView.class).load();

		Example4BViewModel bViewModel = Example4BViewModel.instance;
		Example4CViewModel cViewModel = Example4CViewModel.instance;
		Example4EViewModel eViewModel = Example4EViewModel.instance;
		Example4FViewModel fViewModel = Example4FViewModel.instance;
		Example4GViewModel gViewModel = Example4GViewModel.instance;


		assertThat(bViewModel.scopeA.name).isEqualTo("Example4ScopeA");
		assertThat(bViewModel.scopeB.name).isEqualTo("Example4ScopeB");

		assertThat(cViewModel.scopeA.name).isEqualTo("Example4ScopeA");

		assertThat(eViewModel.scopeA.name).isEqualTo("Example4ScopeA");

		assertThat(fViewModel.scopeA().name).isEqualTo("Example4ScopeA");
		assertThat(fViewModel.scopeC().name).isEqualTo("Example4ScopeC");

		assertThat(gViewModel.scopeA.name).isEqualTo("Example4ScopeA");



		Example4ScopeA scopeA = bViewModel.scopeA;
		assertThat(cViewModel.scopeA).isEqualTo(scopeA).isSameAs(scopeA);
		assertThat(eViewModel.scopeA).isEqualTo(scopeA).isSameAs(scopeA);
		assertThat(fViewModel.scopeA()).isEqualTo(scopeA).isSameAs(scopeA);
		assertThat(gViewModel.scopeA).isEqualTo(scopeA).isSameAs(scopeA);
	}

}
