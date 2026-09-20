package uiframework.abstractfactory;

import uiframework.products.Button;
import uiframework.products.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}