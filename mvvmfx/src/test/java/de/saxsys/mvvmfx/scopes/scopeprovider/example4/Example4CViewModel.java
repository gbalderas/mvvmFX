package de.saxsys.mvvmfx.scopes.scopeprovider.example4;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ViewModel;

public class Example4CViewModel implements ViewModel {

	@InjectScope
	public Example4ScopeA scopeA;

	public static Example4CViewModel instance;

	public Example4CViewModel() {
		instance = this;
	}



}
