package extra;

public class Test {
    public static void main(String[] args) {
        System.out.println("Java version      : " + Runtime.version());
        System.out.println("Java vendor       : " + System.getProperty("java.vendor"));
        System.out.println("Java home         : " + System.getProperty("java.home"));
        System.out.println("Hello from Java 25!");
    }
}

 class VirtualThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Thread vt = Thread.ofVirtual().start(() -> {
            System.out.println("Running in virtual thread: " + Thread.currentThread());
        });

        vt.join();
        System.out.println("Done!");
    }
}