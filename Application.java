public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread myThread1 = new MyThread("thread1");
        myThread1.start();
        MyThread myThread2 = new MyThread("thread2");
        myThread2.start();

    }
}

class MyThread implements Runnable {
    Thread thread;
    private String name;

    MyThread(String name) {
        name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread running" + name);
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            System.out.println(name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }
    public void start() {
        System.out.println("Thread started");
        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
        }
    }
}
