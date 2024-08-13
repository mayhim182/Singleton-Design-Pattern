package org.example.the_little_singleton;

@FunctionalInterface
public interface Sum {
  public int add(int a, int b);
  default String sayHello() {
    return "Helloooo";
  }

  static String sayBye() {
    return "TATA";
  }
}
