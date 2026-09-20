## Clean Code Principles Applied

### Principle 1: Program to Interfaces, Not Implementations (DIP)
Client code and creators depend strictly on `Button`, `Checkbox`, and `UIFactory` interfaces instead of concrete classes like `WindowsButton` or `MacUIFactory`.

* **Before:**

  ```java
  public void renderUI() {
    WindowsButton btn = new WindowsButton();
    WindowsCheckbox chk = new WindowsCheckbox();
    btn.render();
    chk.render();
  }

* **After:**

   ```java
  public void renderUI(UIFactory factory) {
    Button btn = factory.createButton();
    Checkbox chk = factory.createCheckbox();
    btn.render();
    chk.render();
  } 
### Principle 2: Meaningful, Intention-Revealing Names
All interfaces, factory classes, and methods clearly describe their responsibility without vague abbreviations.

* **Before:**
 
   ```java
  public interface Fac {
    Button makeB();
    Checkbox makeC();
  }

* **After:**

   ```java
  public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
  }