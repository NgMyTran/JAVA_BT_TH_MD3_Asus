package session21.test;

//public class Counter implements Runnable {
//    private int count;
//
//    public Counter() {
//        this.count = 1;
//    }
//
//    public synchronized void increment() {
//        if (count <= 10) {
//            System.out.println(Thread.currentThread().getName() + ": " + count);
//            count++;
//        }
//    }
//
//    @Override
//    public void run() {
//        while (count <= 10) {
//            increment();
//            try {
//                Thread.sleep(100); // Small delay to simulate processing time
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
// Counter class
public class Counter implements Runnable {
    private boolean flag;

    public Counter() {
        this.flag = false;
    }

    public void setFlag(boolean value) {
        this.flag = value;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100); // Small delay to simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setFlag(true); // Set flag to true after counting completes
    }

    public boolean getFlag() {
        return flag;
    }
}
