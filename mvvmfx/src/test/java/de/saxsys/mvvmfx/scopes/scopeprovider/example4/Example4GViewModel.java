package de.saxsys.mvvmfx.scopes.scopeprovider.example4;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ViewModel;

public class Example4GViewModel implements ViewModel{

	@InjectScope
	public Example4ScopeA scopeA;

	public static Example4GViewModel instance;

	public Example4GViewModel(){
		instance = this;
	}


}
