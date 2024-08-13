package org.example.the_little_singleton;

public class MyClass {
  //We can create a private constructor;
  private MyClass() {
  }

  //Let us create a static method to generate an
  //instance of MyClasss


  //TODO: Can you complete the code in such a manner for this class
  //TODO: so that the user is only able to create one and only one instance
  public static MyClass getInstance() {
    return new MyClass();
  }
}
