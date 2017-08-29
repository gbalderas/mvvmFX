package de.saxsys.mvvmfx.scopes.scopeprovider.example2;

import de.saxsys.mvvmfx.InjectScope;
import de.saxsys.mvvmfx.ScopeProvider;
import de.saxsys.mvvmfx.ViewModel;
import de.saxsys.mvvmfx.scopes.scopeprovider.example2.Scope1;
import de.saxsys.mvvmfx.scopes.scopeprovider.example2.Scope2;

@ScopeProvider(scopes = { Scope1.class, Scope2.class })
public class EViewModel implements ViewModel {


}
