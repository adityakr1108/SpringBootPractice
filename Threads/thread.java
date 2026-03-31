class A extends Thread {
    public void run() {
        try{
            for (int i = 0; i <= 100; i++) {
                System.out.println("Thread A: " + i);
                Thread.sleep(100); // sleep() method is used to pause the execution of the thread for a specified amount of time. It takes an integer value in milliseconds as an argument. It throws InterruptedException if the thread is interrupted while sleeping.
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class B extends Thread {
    public void run() {
        try{
            for (int i = 0; i <= 100; i++) {
                System.out.println("Thread B: " + i);
                Thread.sleep(100); // sleep() method is used to pause the execution of the thread for a specified amount of time. It takes an integer value in milliseconds as an argument. It throws InterruptedException if the thread is interrupted while sleeping.
            } 
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class C{
        public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Class c: " + i);
        }
    }
}


class thread{
    public static void main(String[] args) {
        A threadA =new A();
        B threadB = new B();
        C c = new C();


        System.out.println(threadA.getPriority()); // getPriority() method is used to get the priority of the thread. It returns an integer value between 1 and 10. The default priority of a thread is 5.
        System.out.println(threadB.getPriority());

        threadA.setPriority(Thread.MAX_PRIORITY); // setPriority() method is used to set the priority of the thread. It takes an integer value between 1 and 10 as an argument. The higher the priority, the more likely the thread will be executed before other threads with lower priority.
        threadB.setPriority(Thread.MIN_PRIORITY);

        System.out.println(threadA.getPriority()); // getPriority() method is used to get the priority of the thread. It returns an integer value between 1 and 10. The default priority of a thread is 5.
        System.out.println(threadB.getPriority());


        threadA.start();
        threadB.start();
        // c.run(); // run() method is called directly, it will not create a new thread and will execute in the main thread.

    }
}