Did u knew we can create a private constructor thereby restricting new object
creation.

```
Unique instance holds our one variable; Remember, it is a static variable
if (uniqueInstance == null) uniqueInstance = new Singleton(); <----------- This part is called Lazy instantiation
                                                              <----------- If we never need it, it never gets created
                                                              
If uniqueInstance is null, then we haven't created the instance yet.
return uniqueInstance;

```

This week's interview: 🙃
Confessions of a Singleton!
Interesting point 1:
HeadFirst: Isn't that sort of waste? Someone took the time to develop a full-blown class
           and now all we can get is one object out of it?
Singleton: Not at all! There is power in ONE. Let's say you have an object that contains
           registry settings. You don't want multiple copies of that object and its values running around.

🔥Refer chocolate Factory example 
Everyone knows that all modern chocolate factories have computer controlled chocolate boilers.
Singleton pattern ensures a class has only one instance, and provides a global point of access to it.


```

The volatile keyword in Java is used to indicate that a variable's value will be modified by different threads. Declaring a variable as volatile ensures that its value is always read from and written to the main memory, rather than being stored in a thread's local cache. This is particularly important in multi-threaded environments where different threads might be accessing and modifying the same variable.

Key Points About volatile:
Visibility: Changes made to a volatile variable by one thread are immediately visible to other threads. Without volatile, threads may cache variables locally, leading to inconsistencies.

Atomicity: The volatile keyword ensures visibility but does not guarantee atomicity. Operations like increment (x++) are not atomic, meaning they can still lead to race conditions even if volatile is used.

Usage: volatile is commonly used in situations where a variable's value is read and written by multiple threads without complex synchronization mechanisms like synchronized blocks.
```

