package de.saxsys.mvvmfx.scopes.scopeprovider;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ViewModel;

public class ChildViewModel implements ViewModel {

    @InjectScope
	private MyScope scope;

    public static ChildViewModel INSTANCE;

    public ChildViewModel(){
    	INSTANCE = this;
	}

	public MyScope getScope() {
		return scope;
	}
}