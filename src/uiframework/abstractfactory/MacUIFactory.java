package uiframework.abstractfactory;

import uiframework.products.Button;
import uiframework.products.Checkbox;
import uiframework.products.MacButton;
import uiframework.products.MacCheckbox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
