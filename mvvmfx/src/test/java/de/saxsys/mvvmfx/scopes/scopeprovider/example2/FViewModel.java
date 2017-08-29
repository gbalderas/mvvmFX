package de.saxsys.mvvmfx.scopes.scopeprovider.example2;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ViewModel;
import de.saxsys.mvvmfx.scopes.scopeprovider.example2.Scope1;
import de.saxsys.mvvmfx.scopes.scopeprovider.example2.Scope2;

public class FViewModel implements ViewModel {


	@InjectScope
	private Scope1 scope1;

	@InjectScope
	private Scope2 scope2;


	public static FViewModel instance;

	public FViewModel() {
		instance = this;
	}

	public Scope1 getScope1() {
		return scope1;
	}

	public Scope2 getScope2() {
		return scope2;
	}
}
