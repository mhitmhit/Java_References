package notes_3;

public class AE_Multithreading {

}
/**

Every thread that is created in a program is given its own call stack, where it stores local variables references. 
However, all threads share the same heap, where the objects live in memory. Thus, two threads could have separate 
variable references on two different stacks that 
still point to the same object in the heap.



Thread creation by extending the Thread class
// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class
public class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object
                = new MultithreadingDemo();
            object.start();
        }
    }
}




Thread creation by implementing the Runnable Interface
// Java code for thread creation by implementing
// the Runnable Interface
class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class
class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
}













Description
Synchronization

Synchronization in Java is a crucial concept for ensuring proper access and modification of shared resources in 
a multi-threaded environment. It plays a vital role in preventing race conditions, deadlocks, and other concurrency-
related issues that can lead to data corruption, unpredictable behavior, and system crashes.
Synchronized keyword

In a multithreaded environment, a race condition occurs when 2 or more threads attempt to access the same resource. 
Using the synchronized keyword on a piece of logic enforces that only one thread can access the resource at any given 
time. This keyword is used to mark a block of code or a method as a critical section, ensuring that only one thread 
can execute that code at a time. This is achieved by automatically acquiring an intrinsic lock (also known as a monitor lock) 
associated with the object or class on which the synchronized block or method is defined. When a thread 
encounters a synchronized block or method, it attempts to acquire the lock associated with the object or class. 
If the lock is available, the thread acquires it and proceeds to execute the synchronized code. If the lock is 
already held by another thread, the current thread waits for the lock to be released.

synchronized blocks or methods can be created using the keyword synchronized. Examples:

// synchronized block
synchronized(objectidentifier) {
   // the specified object is now locked and in use
}

// synchronized method
public synchronized void myMethod() {
   // the object using this method is now locked and in use
}







Synchronized blocks:
public void updateValueFiveTimesByAddingOne() throws InterruptedException {
    System.out.println("Print statement before addingOne loop");

    synchronized (this) {
      // iterate 5 times, update value by 1 every time
      for (int i = 1; i <= 5; i++) {
        System.out.println(++value);
        Thread.sleep(500);
      }

    }

    System.out.println("Print statement after addingOne loop");
  }

  public void updateValueFiveTimesByAddingTwo() throws InterruptedException {
    System.out.println("Print statement before addingTwo loop");

    synchronized (this) {
      // iterate 5 times, update value by 2 every time
      for (int i = 1; i <= 5; i++) {
        value += 2;
        System.out.println(value);
        Thread.sleep(500);
      }
    }

    System.out.println("Print statement after addingTwo loop");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  synchronized methods:
  public synchronized void updateValueFiveTimesByAddingOne() throws InterruptedException {
    System.out.println("Print statement before addingOne loop");

    // iterate 5 times, update value by 1 every time
    for (int i = 1; i <= 5; i++) {
      System.out.println(++value);
      Thread.sleep(500);
    }

    System.out.println("Print statement after addingOne loop");
  }

  public synchronized void updateValueFiveTimesByAddingTwo() throws InterruptedException {

    System.out.println("Print statement before addingTwo loop");

    // iterate 5 times, update value by 2 every time
    for (int i = 1; i <= 5; i++) {
      value += 2;
      System.out.println(value);
      Thread.sleep(500);
    }

    System.out.println("Print statement after addingTwo loop");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

Deadlock?
A deadlock occurs when two or more threads are blocked forever, waiting for each other to release resources 
Each thread holds a resource and waits for another resource held by another thread
Four Conditions for Deadlock:
    Mutual Exclusion: Resources cannot be shared simultaneously
    Hold and Wait: Threads hold resources while waiting for others
    No Preemption: Resources cannot be forcibly taken from threads
    Circular Wait: A circular chain of threads waiting for resources

Deadlock Detection:
Use Java's ThreadMXBean to detect deadlocks programmatically The findDeadlockedThreads() method returns thread 
IDs involved in deadlock Thread dumps can also help identify deadlocks

Prevention Strategies:
a) Avoid Nested Locks: Follow a consistent order when acquiring multiple locks Never acquire locks in different 
orders in different threads
b) Lock Timeout: Use tryLock() with timeout instead of synchronized Release locks if unable to acquire all 
necessary resources
c) Resource Ordering: Assign a numerical order to resources Always acquire resources in ascending order
d) Lock Hierarchy: Define a hierarchy for lock acquisition Never acquire a lock at a lower level after acquiring a 
higher-level lock
 
  
  
  
  

public class Deadlock {

    public static void main(String[] args) throws InterruptedException {
        // two friend objects
        Friend alphonse = new Friend("Alphonse");
        Friend gaston = new Friend("Gaston");

        // two threads each using an object
        Thread thread1 = new Thread(() -> {
            alphonse.bow(gaston);
        });

        Thread thread2 = new Thread(() -> {
            gaston.bow(alphonse);
        });

        // start threads
        thread1.start();
        thread2.start();

        // debugging
        // use main thread to check state of other threads periodically
        for (int i = 0; i <= 5; i++) {
            Thread.sleep(1000);
            System.out.println(thread1.getName() + "- State:" + thread1.getState() + " & IsAlive:" + thread1.isAlive());
            System.out.println(thread2.getName() + "- State:" + thread2.getState() + " & IsAlive:" + thread2.isAlive());
        }

    }
}

class Friend {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void bow(Friend bower) {
        System.out.format("%s: %s"
                + "  has bowed to me!%n",
                this.name, bower.getName());

        // debugging statement
        System.out.println(Thread.currentThread().getName() + " holds lock on " + this.name + "? "
                + Thread.holdsLock(this) + "\n" + Thread.currentThread().getName() + " holds lock on " + bower.name
                + "? " + Thread.holdsLock(bower));

        bower.bowBack(bower); // deadlock happens here where this method tries to use another object
    }

    public synchronized void bowBack(Friend bower) {
        System.out.format("%s: %s"
                + " has bowed back to me!%n",
                this.name, bower.getName());
    }
}














Livelock 
is another concurrency problem and is similar to deadlock. In livelock, two or more threads keep on transferring 
states between one another instead of being blocked infinitely as we saw in the deadlock example. Consequently, 
the threads are not able to perform their respective tasks.







Producer-Consumer Problem
The Producer-Consumer problem is a classic example of a multi-process synchronization problem. Here, we have a 
fixed-size buffer and two classes of threads - producers and consumers. Producers produces the data to the queue and 
Consumers consume the data from the queue. Both producer and 
consumer shares the same fixed-size buffer as a queue.


Description
Producer-Consumer Problem

The Producer-Consumer problem is a classic example of a multi-process synchronization problem. Here, we have a 
fixed-size buffer and two classes of threads - producers and consumers. Producers produces the data to the queue and 
Consumers consume the data from the queue. Both producer and consumer shares the same fixed-size buffer as a queue.

Problem - The producer should produce data only when the queue is not full. If the queue is full, then the producer 
shouldn't be allowed to put any data into the queue. The consumer should consume data only when the queue is not empty. 
If the queue is empty, then the consumer shouldn't be allowed to take any data from the queue.

Solution - We can solve the Producer-Consumer problem by using wait() & notify()methods to communicate between producer 
and consumer threads. The wait() method to pause the producer or consumer thread depending on the queue size. The notify() 
method sends a notification to the waiting thread.

    The Producer thread will keep on producing data for Consumer to consume. It will use wait() method when Queue is full 
    and use notify() method to send notification to Consumer thread once data is added to the queue.

    The Consumer thread will consume the data form the queue. It will also use wait() method to wait if queue is empty. It 
    will also use notify() method to send notification to producer thread after consuming data from the queue.










public class Cashier {
    ArrayDeque<Cookie> cookies = Main.cookies;

    public void consume() throws InterruptedException {

        synchronized(cookies) {

            // check if baker can produce
            while (cookies.isEmpty()) {
                // if not, wait
                System.out.println("Cashier waits!");
                cookies.wait();
            }


            // if there is space on shelf, produce
            cookies.remove();
            System.out.println("Cashier sold a cookie!\n" + 
            "Cookies currently ready for sale: " + cookies.size());
            cookies.notify();

        }
    }
}









public class Baker {

    ArrayDeque<Cookie> cookies = Main.cookies;

    public void produce(Cookie cookie) throws InterruptedException {

        synchronized(cookies) {

            // check if baker can produce
            while (cookies.size() == Main.MAX_COOKIES) {
                // if not, wait
                System.out.println("Baker waits!");
                cookies.wait();
            }


            // if there is space on shelf, produce
            cookies.add(cookie);
            System.out.println("Baker baked a cookie!\n" + 
            "Cookies currently ready for sale: " + cookies.size());
            cookies.notify();

        }
    }
}
















*/