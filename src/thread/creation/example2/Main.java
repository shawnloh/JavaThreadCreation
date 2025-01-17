package thread.creation.example2;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from " + Thread.currentThread().getName());
            }
        });
        
        var thread2 = new NewThread();
        thread2.start();
        
    }
    
    private static class NewThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from " + Thread.currentThread().getName());
        }
    }
}
