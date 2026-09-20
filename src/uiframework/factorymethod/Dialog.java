package uiframework.factorymethod;

import uiframework.products.Button;


public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }

    public abstract Button createButton();
}