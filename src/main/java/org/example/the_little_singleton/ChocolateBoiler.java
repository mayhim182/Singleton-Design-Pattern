package org.example.the_little_singleton;

public class ChocolateBoiler {

  private static ChocolateBoiler uniqueInstance;

  //Eager creation
  private static ChocolateBoiler betterThreadSafeInstance = new ChocolateBoiler();

  //Double Checked Locking
  //With the double checked locking, we first check to see if an instance is created, and
  //if not then we synchronize
  private volatile static ChocolateBoiler doubleCheckedLock;

  private boolean empty;
  private boolean boiled;

  //By Adding the synchronized keyword to getInstance()
  //we force every thread to wait till its turn before it can enter the method.
  //That is no 2 threads can enter a method at the same time.
  public static synchronized ChocolateBoiler getUniqueInstance() {
    if(uniqueInstance == null) {
      uniqueInstance = new ChocolateBoiler();
      uniqueInstance.empty = true;
      uniqueInstance.boiled = false;
    }
    return uniqueInstance;
  }

  //Here we are relying on JVM to create an instance
  //whenever class is loaded. The JVM guarantees that the thread will
  //be created before any thread accesses the static unique instance.
//  Better for performance
  public static ChocolateBoiler getBetterThreadSafeInstance() {
    return betterThreadSafeInstance;
  }

  //Double checked lock
  //Better for performance
  public static ChocolateBoiler getDoubleCheckedLock() {
    if (doubleCheckedLock == null) {
      synchronized (ChocolateBoiler.class) {
        //Check for an instance and if there ain't one enter
        //a synchronised block.
        if (doubleCheckedLock == null) {
          doubleCheckedLock = new ChocolateBoiler();
        }
      }
    }
    return doubleCheckedLock;
    //The volatile keyword ensures that multiple threads handle the
    //unique instance variables correctly when it is being initialised to
    //the singleton instance.
  }


  //This code is only started when the boiler is empty
  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public void fill() {
    if (isEmpty()) {
      // To fill boiler it must be empty, and, once it's full
      // we set the empty and boiled flags.
      empty = false;
      boiled = false;
      //fill the boiler with a milk/chocolate mixture
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      //Drain the boiled milk and chocolate
      empty = true;
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      //Bring the content to Boil
      boiled = true;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
