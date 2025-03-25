import org.junit.jupiter.api.Test;

class ThreadTest {

    @Test
    void threadStart() {
        Thread thread = new MyThread();

        thread.start();
        System.out.println("Hello: " + Thread.currentThread().getName());
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("Thread: " + Thread.currentThread().getName());
        }
    }
}
