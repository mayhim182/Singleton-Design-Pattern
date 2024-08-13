package org.example.the_little_singleton;


//Dissecting the classic Singleton
//pattern implementation
public class SingleTon {
  private static SingleTon uniqueInstance;
  //We have a static variable to hold our one
  //Instance of the class

  private SingleTon() {
    //Our constructor is declared private only singleton class
    //can instantiate it only in this class.

  }

  //The getInstance() method gives us a way to
  //instantiate the class and also to return
  //an instance of it.
  public static SingleTon getInstance() {
    if(uniqueInstance == null) {
      uniqueInstance = new SingleTon();
    }
    return uniqueInstance;
  }

  //Other useful methods here

}
