public class MultiThread {
    public static void main(String[] args) {
		for(long i=0; i<10; i++)
			new Thread(new SampleY()).start();
    }
}

class SampleY implements Runnable {
    static int i;

    public synchronized void run() {
        System.out.println("" + (++i));
    }
}