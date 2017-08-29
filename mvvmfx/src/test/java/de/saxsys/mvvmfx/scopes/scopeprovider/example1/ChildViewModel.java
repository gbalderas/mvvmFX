package de.saxsys.mvvmfx.scopes.scopeprovider.example1;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ViewModel;

public class ChildViewModel implements ViewModel {

    @InjectScope
	private MyScope scope;

    public static ChildViewModel instance;

    public ChildViewModel(){
    	instance = this;
	}

	public MyScope getScope() {
		return scope;
	}
}