package uiframework.products;

public class WindowsCheckbox implements Checkbox {
    private boolean checked = false;

    @Override
    public void render() {
        System.out.println("[Windows Checkbox] Rendering of the square flag (Status: " + checked + ").");
    }

    @Override
    public void toggle() {
        this.checked = !this.checked;
        System.out.println("[Windows Checkbox] The flag changed to: " + checked);
    }
}