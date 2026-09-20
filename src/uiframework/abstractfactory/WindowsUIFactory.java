package uiframework.abstractfactory;

import uiframework.products.Button;
import uiframework.products.Checkbox;
import uiframework.products.WindowsButton;
import uiframework.products.WindowsCheckbox;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}