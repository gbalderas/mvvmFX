package de.saxsys.mvvmfx.scopes.scopeprovider.example4;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ViewModel;

public class Example4FViewModel implements ViewModel {


	@InjectScope
	private Example4ScopeA scopeA;

	@InjectScope
	private Example4ScopeC scopeC;


	public static Example4FViewModel instance;

	public Example4FViewModel() {
		instance = this;
	}

	public Example4ScopeA scopeA() {
		return scopeA;
	}

	public Example4ScopeC scopeC() {
		return scopeC;
	}
}
