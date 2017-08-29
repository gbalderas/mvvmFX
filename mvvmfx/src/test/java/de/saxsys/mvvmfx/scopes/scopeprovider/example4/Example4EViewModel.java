package de.saxsys.mvvmfx.scopes.scopeprovider.example4;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ScopeProvider;
import de.saxsys.mvvmfx.ViewModel;

@ScopeProvider(scopes = { Example4ScopeC.class})
public class Example4EViewModel implements ViewModel {

	@InjectScope
	public Example4ScopeA scopeA;

	public static Example4EViewModel instance;

	public Example4EViewModel(){
		instance = this;
	}

}
