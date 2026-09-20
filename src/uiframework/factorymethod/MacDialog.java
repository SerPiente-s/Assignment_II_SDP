package uiframework.factorymethod;

import uiframework.products.Button;
import uiframework.products.MacButton;

public class MacDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}