package de.saxsys.mvvmfx.scopes.scopeprovider.example2;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ViewModel;
import de.saxsys.mvvmfx.scopes.scopeprovider.example2.Scope1;

public class BViewModel implements ViewModel {


	@InjectScope
	public Scope1 scope;

	public static BViewModel instance;

	public BViewModel(){
		instance = this;
	}


}
