package session21.test;

//
//public class CharacterPrinter implements Runnable {
//    private char currentChar;
//
//    public CharacterPrinter() {
//        this.currentChar = 'a';
//    }
//
//    public synchronized void printNextChar() {
//        if (currentChar <= 'z') {
//            System.out.println(Thread.currentThread().getName() + ": " + currentChar);
//            currentChar++;
//        }
//    }
//
//    @Override
//    public void run() {
//        while (currentChar <= 'z') {
//            printNextChar();
//            try {
//                Thread.sleep(100); // Small delay to simulate processing time
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
// Character printer class
class CharacterPrinter implements Runnable {
    private Counter counter;

    public CharacterPrinter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (!counter.getFlag()) {
            // Wait until flag is set to true
            try {
                Thread.sleep(100); // Small delay to avoid busy-waiting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print characters from 'a' to 'z' after flag is set
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(Thread.currentThread().getName() + ": " + c);
            try {
                Thread.sleep(100); // Small delay to simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
