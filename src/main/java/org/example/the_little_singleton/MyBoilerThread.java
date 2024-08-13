package org.example.the_little_singleton;

public class MyBoilerThread extends Thread{
  private ChocolateBoiler chocolateBoiler;
  @Override
  public void run() {
    System.out.println("here");
    this.chocolateBoiler = ChocolateBoiler.getUniqueInstance();
  }

  public static void main(String[] args) {
//    ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getUniqueInstance();
//    MyBoilerThread thread = new MyBoilerThread();
//    thread.start();


  }

  public ChocolateBoiler getChocolateBoiler() {
    this.chocolateBoiler = ChocolateBoiler.getUniqueInstance();
    return this.chocolateBoiler;
  }


}
