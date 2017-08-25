package de.saxsys.mvvmfx.scopes.scopeprovider;

import de.saxsys.mvvmfx.FxmlPath;
import de.saxsys.mvvmfx.FxmlView;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class ParentView implements FxmlView<ParentViewModel> {


	@FXML
	public ChildView childView;
}