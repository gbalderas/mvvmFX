package de.saxsys.mvvmfx.scopes.scopeprovider;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import javafx.scene.Parent;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScopeProviderInjectionTest {


	@Test
	public void testScopeProvider(){
		ViewTuple<ParentView, ParentViewModel> load = FluentViewLoader.fxmlView(ParentView.class).load();

		assertThat(load.getView()).isNotNull();
		assertThat(load.getCodeBehind()).isNotNull();
		assertThat(load.getViewModel()).isNotNull();

		ChildViewModel childViewModel = ChildViewModel.INSTANCE;
		assertThat(childViewModel).isNotNull();
		assertThat(childViewModel.getScope()).isNotNull();

		assertThat(childViewModel.getScope().i).isEqualTo(1);

	}




}
