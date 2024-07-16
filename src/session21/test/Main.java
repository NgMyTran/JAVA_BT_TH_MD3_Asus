package session21.test;

public class Main {
    public static void main(String[] args) {
//        Thread t1 = new MyThread();
//        t1.start();
//        System.out.println("Line truoc t1");
//        Runnable t2 = new MyRunable();
//        t2.run();
//        Thread t3 = new Thread(t2);
//        t3.start();

//        MyThread t4 = new MyThread();
//        MyResourceThread thread1 = new MyResourceThread(t4, "Thread 1");
//        MyResourceThread thread2 = new MyResourceThread(t4, "Thread 2");
//        thread1.start();
//        thread2.start();

        Counter counter = new Counter();
        CharacterPrinter printer = new CharacterPrinter(counter);

        Thread thread1 = new Thread(counter, "CounterThread");
        Thread thread2 = new Thread(printer, "CharacterPrinterThread");

        thread1.start();
        thread2.start();
    }

}


