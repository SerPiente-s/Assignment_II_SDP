package uiframework.factorymethod;

import uiframework.products.Button;
import uiframework.products.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}