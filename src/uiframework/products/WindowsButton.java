package uiframework.products;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("[Windows Button] A button in the style of Windows OS.");
    }

    @Override
    public void onClick() {
        System.out.println("[Windows Button] An action in the standard of Windows.");
    }
}
