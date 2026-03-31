// what is mutation in java
// Mutation in Java refers to the ability of an object to change its state or behavior at runtime
// in simple terms, it means that an object can modify its own properties or methods during the execution of a program. This is a fundamental concept in object-oriented programming and allows for dynamic behavior and flexibility in code design.

class Counter{
    int count = 0;
    synchronized void increment(){ // synchronized keyword is used to ensure that only one thread can access the increment() method at a time. This is important to prevent race conditions.
        count++;
    }
}

public class mutation {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable obj1 = () -> { // lambda expression is used to create a thread that will execute the increment() method of the Counter class. It is a shorthand way of creating a thread without having to implement the Runnable interface or extend the Thread class.
            for(int i = 0; i < 1000; i++){
                c.increment();
            }
        };
        Runnable obj2 = () -> { 
            for(int i = 0; i < 1000; i++){ 
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1); // Thread class is used to create a new thread of execution. It takes a Runnable object as an argument, which defines the code that will be executed in the new thread.
        Thread t2 = new Thread(obj2);
        t1.start(); // start() method is used to start the execution of the thread. It calls the run() method of the thread and executes it in a separate thread of execution.
        t2.start();

        try{
            t1.join(); // join() method is used to wait for the thread to finish its execution before proceeding with the next line of code. It throws InterruptedException if the thread is interrupted while waiting.
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final count: " + c.count);

    }
}
