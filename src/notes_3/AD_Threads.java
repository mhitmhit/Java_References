package notes_3;

public class AD_Threads {

}
/**
fundamental part of the multithreading capabilities provided by the language. It represents a separate thread of 
execution, allowing concurrent 
execution of multiple tasks within a single Java program
    getters for id, name, and priority
    setters for name and priority
    interrupt() to explicitly interrupt the thread
    isAlive(), isInterrupted() and isDaemon() to test the state of the thread
    join() to wait for the thread to finish execution
    start() to actually begin thread execution after instantiation
    Thread.currentThread() which returns the thread that is currently executing
    Thread.sleep(long millis) which causes the currently executing thread to temporarily stop for a specified number of 
    milliseconds

Thread Priorities
Priorities signify which order threads are to be run. The Thread class contains a few static variables for priority:
    MIN_PRIORITY = 1
    NORM_PRIORITY = 5, default
    MAX_PRIORITY = 10


You can create a new thread by subclassing Thread and overriding its run() method, or by providing a Runnable object or 
lambda to the Thread constructor:

class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("Inside the MyThread thread");
  }
}

public class Main {
  public static void main(String[] args) throws Exception {
	// create threads
    Thread myRunnable = new Thread(() -> {
      System.out.println("Inside the Runnable thread");
    });
    Thread myThread = new MyThread();

	// start threads
    myRunnable.start();
    myThread.start();
  }
}

In the above example, we created two threads and started them. The first thread was created by providing a 
lambda that satisfied Runnable's run() method to a Thread() constructor. The second thread was created by 
instantiating a class we created, MyThread, that extended the Thread class.

The output is as follows:
Inside the Runnable thread
Inside the MyThread thread










public class Employee extends Thread {
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " is working...");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				*
				 * InterruptedException is thrown when the Employee's interrupt()
				 * method is called. We will break out if this occurs.
				 *
				e.printStackTrace();
				break;
			}
		}
	}
}








public class ThreadDriver {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(); // Thread state: NEW
		emp1.setPriority(1);
//		emp1.run();	// does not actually create a new thread
		emp1.start(); // Thread state: RUNNABLE
		
		Employee emp2 = new Employee();
		emp2.setPriority(2);
		emp2.start();
		
		*
		 * join() method
		 * 
		 * Using join(), we tell our thread to wait until the specified thread completes
		 * its execution. There are overloaded versions of the join() method, which allows
		 * us to specify the time for which you want to wait for the specified thread to
		 * terminate.
		 *
		try {
			emp1.join(); // Waiting for emp1 to finish its execution
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Display the priority of threads. The default priority is 5.
		System.out.println(emp1.getPriority());
		System.out.println(emp2.getPriority());
		
		// Check to see if a given thread is alive or dead
		System.out.println(emp1.isAlive());
		System.out.println(emp2.isAlive());
		
		
	}
}











Runnable Interface

In Java, multithreading is achieved via the Thread class and/or the Runnable interface. java.lang.Runnable is an interface 
that is to be implemented by a class whose instances are intended to be executed by a thread.
Creating Threads using Runnable Interface
    Create a class that implements the Runnable functional interface
        implement the run() method
        pass an instance of your class to a Thread constructor
        call the start() method on the thread

Example:
	public class MyRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("Inside the MyRunnable class");
		}
	}

Runnable and Lambda Expressions

Because Runnable is a functional interface, we can use a lambda expression to define thread behavior inline 
instead of implementing the interface in a separate class. We pass a lambda expression as the Runnable type 
required in the Thread constructor.

Example:
public class ThreadLambda {
  public static void main(String[] args) {
    Thread willRun = new Thread(() -> {
	  System.out.println("Running!");
	});
	willRun.start();
  }
}






Thread 									vs 				Runable
subclass of thread class								an implemented interface
cannot inherit another class							can inherit any other class

Thread Class vs Runnable Interface
    If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple 
    inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.
    We can achieve basic functionality of a thread by extending the Thread class because it provides some built-in methods 
    like yield(), interrupt() etc. that are not available in Runnable interface.
    Using Runnable will give you an object that can be shared amongst multiple threads.













NEW: newly created thread that has not started executing
RUNNABLE: either running or ready for execution but waiting for its resource allocation
BLOCKED: waiting to acquire a monitor lock to enter or re-enter a synchronized block/method
WAITING: waiting for some other thread to perform an action without any time limit
TIMED_WAITING: waiting for some other thread to perform a specific action for a specified time period
TERMINATED: has completed its execution




// Java program to demonstrate thread states
// Java program to demonstrate thread states
class WorkerThread implements Runnable {
    public void run() {
        // moving thread2 to timed waiting state
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(
            "State of thread1 while it called join() method on thread2 -"
            + ThreadStateDemo.thread1.getState());
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadStateDemo implements Runnable {
    public static Thread thread1;
    public static ThreadStateDemo obj;
    
    public static void main(String[] args) {
        obj = new ThreadStateDemo();
        thread1 = new Thread(obj);
        
        // thread1 created and is currently in the NEW state.
        System.out.println(
            "State of thread1 after creating it - "
            + thread1.getState());
        thread1.start();
        
        // thread1 moved to Runnable state
        System.out.println(
            "State of thread1 after calling .start() method on it - "
            + thread1.getState());
    }
    
    public void run() {
        WorkerThread myThread = new WorkerThread();
        Thread thread2 = new Thread(myThread);
        
        // thread2 created and is currently in the NEW state.
        System.out.println(
            "State of thread2 after creating it - "
            + thread2.getState());
        thread2.start();
        
        // thread2 moved to Runnable state
        System.out.println(
            "State of thread2 after calling .start() method on it - "
            + thread2.getState());
        
        // moving thread1 to timed waiting state
        try {
            // moving thread1 to timed waiting state
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
            "State of thread2 after calling .sleep() method on it - "
            + thread2.getState());
        
        try {
            // waiting for thread2 to die
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
            "State of thread2 when it has finished it's execution - "
            + thread2.getState());
    }
}










*/