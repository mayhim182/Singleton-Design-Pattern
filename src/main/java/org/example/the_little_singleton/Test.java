package org.example.the_little_singleton;

public class Test {
  public static void main(String[] args) {


    Sum sum = (a, b)-> a+b;

    System.out.println(sum.sayHello());

    System.out.println(Sum.sayBye());


    System.out.println("FI");

    for(int i = 0; i<10; i++) {
      ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getUniqueInstance();
      MyBoilerThread thread = new MyBoilerThread();
      thread.start();
      System.out.println(chocolateBoiler1.hashCode());
      System.out.println(thread.getChocolateBoiler().hashCode());
      //Will be trying to access the same object and will get in this case
      //but what if later we get two instances for 1 boiler dikkat🙃
      //To handle issue for multiple instances we can handle it using synchronised
      //which is an implicit locking on thread.
      if(!thread.getChocolateBoiler().equals(chocolateBoiler1)) break;
    }
  }
}
