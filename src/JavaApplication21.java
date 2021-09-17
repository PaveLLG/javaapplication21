public class JavaApplication21 {

    static int x;

    public static void main(String[] args) throws InterruptedException {

        Runnable runner = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++ ){
                    x++;
                }
            }
        };

        Thread[] threads = new Thread[5];

        for(int i = 0; i < threads.length; i++ ){
            threads[i] = new Thread(runner);
            threads

        }

        for(Thread thread: threads){
            thread = new Thread(runner);
            thread.start();
            thread.join();
        }




        System.out.println("x = " + x);
    }

}
