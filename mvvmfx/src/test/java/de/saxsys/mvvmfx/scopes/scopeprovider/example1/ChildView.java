package de.saxsys.mvvmfx.scopes.scopeprovider.example1;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;

public class ChildView implements FxmlView<ChildViewModel> {

	@InjectViewModel
	public ChildViewModel viewModel;

	public ChildView(){
		System.out.println("child view instance created");
	}
}