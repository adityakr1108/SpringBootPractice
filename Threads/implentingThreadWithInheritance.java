
class A extends C implements Runnable {
    public void run() {
        try{
            for (int i = 0; i <= 5; i++) {
                System.out.println("HI");
                Thread.sleep(100); // sleep() method is used to pause the execution of the thread for a specified amount of time. It takes an integer value in milliseconds as an argument. It throws InterruptedException if the thread is interrupted while sleeping.
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class B extends C implements Runnable {
    public void run() {
        try{
            for (int i = 0; i <= 5; i++) {
                System.out.println("HELLO");
                Thread.sleep(100); // sleep() method is used to pause the execution of the thread for a specified amount of time. It takes an integer value in milliseconds as an argument. It throws InterruptedException if the thread is interrupted while sleeping.
            } 
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class C{
        public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am class C: " + i);
        }
    }
}

public class implentingThreadWithInheritance {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();

        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);
        System.out.println(t1.getPriority()); // getPriority() method is used to get the priority of the thread. It returns an integer value between 1 and 10. The default priority of a thread is 5.
        System.out.println(t2.getPriority());
        t2.setPriority(10);

        t1.start();
        try{
            t1.sleep(5);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        threadA.show();
        t2.start();
        threadB.show();
    }
}
