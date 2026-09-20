package uiframework.products;

public class MacCheckbox implements Checkbox {
    private boolean checked = false;

    @Override
    public void render() {
        System.out.println("[macOS Checkbox] Drawing the macOS checkmark icon (Status: " + checked + ").");
    }

    @Override
    public void toggle() {
        this.checked = !this.checked;
        System.out.println("[macOS Checkbox] The check mark has been changed to: " + checked);
    }
}