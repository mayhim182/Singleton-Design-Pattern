package org.example.the_little_singleton;

public enum SingleTonEnum {
  UNIQUE_INSTANCE;

  private boolean empty;
  private boolean boiled;

  // Constructor is called only once, when the enum is initialized
  //Enum constructors are always private
  SingleTonEnum() {
    empty = true;
    boiled = false;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      System.out.println("Filling the boiler with chocolate and milk...");
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      empty = true;
      System.out.println("Draining the boiled chocolate and milk...");
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      boiled = true;
      System.out.println("Boiling the chocolate and milk...");
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }

  public static SingleTonEnum getInstance() {
    return UNIQUE_INSTANCE;
  }

  public void status() {
    System.out.println("ChocoBoiler Status:");
    System.out.println("Empty: " + empty);
    System.out.println("Boiled: " + boiled);
  }
}
