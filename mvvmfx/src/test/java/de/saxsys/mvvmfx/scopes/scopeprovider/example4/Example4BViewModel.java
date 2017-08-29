package de.saxsys.mvvmfx.scopes.scopeprovider.example4;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ViewModel;

public class Example4BViewModel implements ViewModel {


	@InjectScope
	public Example4ScopeA scopeA;

	@InjectScope
	public Example4ScopeB scopeB;

	public static Example4BViewModel instance;

	public Example4BViewModel(){
		instance = this;
	}


}
