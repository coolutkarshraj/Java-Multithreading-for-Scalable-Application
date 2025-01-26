public class ThreadTester {
    public static void main(String[] args) {
        // Print a message from the main thread
        System.out.println("Main is starting");// Create a thread instance
        ThreadOne threadOne = new ThreadOne();
        // Start the thread
        threadOne.start();
        // Print a message from the main thread
        System.out.println("Main is exiting");
    }
}