package uiframework.products;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("[macOS Button] A button in the style of macOS.");
    }

    @Override
    public void onClick() {
        System.out.println("[macOS Button] An action in the standard of macOS.");
    }
}