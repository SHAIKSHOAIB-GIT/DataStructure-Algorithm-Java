package partices;

class Fristc extends Thread {

    public void run() {
        String ct = Thread.currentThread().getName();
        if (ct.equals("thread1")) {
            
            s1();
        } else if (ct.equals("thread2")) {
            s2();
        }
    }

    public void s1() {
        try {
            System.out.println("Thread 1 - Statement 1");
            Thread.sleep(3000);
            System.out.println("Thread 1 - Statement 2");
            Thread.sleep(2000);
            System.out.println("Thread 1 - Statement 3");
            Thread.sleep(3000);
            System.out.println("Thread 1 - Statement 4");
            Thread.sleep(2000);
            System.out.println("Thread 1 - Statement 5");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void s2() {
        try {
            System.out.println("Thread 2 - Statement 1");
            Thread.sleep(2000);
            System.out.println("Thread 2 - Statement 2");
            Thread.sleep(4000);
            System.out.println("Thread 2 - Statement 3");
            Thread.sleep(2000);
            System.out.println("Thread 2 - Statement 4");
            Thread.sleep(4000);
            System.out.println("Thread 2 - Statement 5");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Fristc t1 = new Fristc();
        Fristc t2 = new Fristc();

        t1.setName("thread1");
        t2.setName("thread2");

        t1.start();
       
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();

        System.out.println("Main Thread ended");
    }
}
