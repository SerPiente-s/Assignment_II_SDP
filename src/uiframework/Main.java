package uiframework;

import uiframework.abstractfactory.MacUIFactory;
import uiframework.abstractfactory.UIFactory;
import uiframework.abstractfactory.WindowsUIFactory;
import uiframework.factorymethod.Dialog;
import uiframework.factorymethod.MacDialog;
import uiframework.factorymethod.WindowsDialog;
import uiframework.products.Button;
import uiframework.products.Checkbox;

public class Main {


    public static final String OS_WINDOWS = "WINDOWS";
    public static final String OS_MAC = "MAC";

    public static void main(String[] args) {
        System.out.println("=== PART A: DEMONSTRATING FACTORY METHOD PATTERN ===\n");

        runFactoryMethodDemo(OS_WINDOWS);
        runFactoryMethodDemo(OS_MAC);

        System.out.println("=== PART B: DEMONSTRATING ABSTRACT FACTORY PATTERN ===\n");

        runAbstractFactoryDemo(OS_WINDOWS);
        runAbstractFactoryDemo(OS_MAC);

        System.out.println("=== TESTING VALIDATION & EXCEPTION HANDLING ===\n");

        try {
            configureFactory("LINUX_UNSUPPORTED");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }
    }

    private static void runFactoryMethodDemo(String osType) {
        Dialog dialog;
        if (OS_WINDOWS.equalsIgnoreCase(osType)) {
            dialog = new WindowsDialog();
        } else if (OS_MAC.equalsIgnoreCase(osType)) {
            dialog = new MacDialog();
        } else {
            throw new IllegalArgumentException("Unsupported OS for Dialog: " + osType);
        }

        System.out.println("Rendering dialog for OS: " + osType);
        dialog.renderWindow();
        System.out.println();
    }

    private static void runAbstractFactoryDemo(String osType) {
        UIFactory factory = configureFactory(osType);

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        System.out.println("Rendering full UI family for OS: " + osType);
        button.render();
        checkbox.render();
        checkbox.toggle();
        System.out.println();
    }

    private static UIFactory configureFactory(String osType) {
        if (osType == null || osType.trim().isEmpty()) {
            throw new IllegalArgumentException("OS type cannot be null or empty.");
        }

        if (OS_WINDOWS.equalsIgnoreCase(osType)) {
            return new WindowsUIFactory();
        } else if (OS_MAC.equalsIgnoreCase(osType)) {
            return new MacUIFactory();
        } else {
            throw new IllegalArgumentException("Unknown or unsupported operating system: " + osType);
        }
    }
}