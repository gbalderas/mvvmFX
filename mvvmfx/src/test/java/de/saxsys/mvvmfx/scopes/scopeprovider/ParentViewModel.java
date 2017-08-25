package de.saxsys.mvvmfx.scopes.scopeprovider;

import de.saxsys.mvvmfx.ScopeProvider;
import de.saxsys.mvvmfx.ViewModel;
import org.junit.Test;

@ScopeProvider(scopes= {MyScope.class})
public class ParentViewModel implements ViewModel {
}