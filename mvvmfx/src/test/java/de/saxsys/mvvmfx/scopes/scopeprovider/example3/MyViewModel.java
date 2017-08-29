package de.saxsys.mvvmfx.scopes.scopeprovider.example3;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ViewModel;

public class MyViewModel implements ViewModel {

	@InjectScope
	public MyScope3 scope;

}
