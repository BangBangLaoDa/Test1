package concurrency;

public class BasicDeamonThread implements Runnable{


    @Override
    public void run() {
        while (true){
            processing();
        }
    }

    private void processing() {
        System.out.println("Processing daemon thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread dt = new Thread(new BasicDeamonThread(),"dt");
        dt.setDaemon(true);
        dt.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finishing program");
    }
}
