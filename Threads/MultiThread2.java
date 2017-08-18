public class MultiThread2 {
    public static void main(String[] args) {

        java.util.ArrayList<Thread> tList = new java.util.ArrayList<Thread>();
        tList.add(new Thread(new SampleX(1)));
        tList.add(new Thread(new SampleX(2)));
        tList.add(new Thread(new SampleX(3)));
        tList.add(new Thread(new SampleX(4)));
        tList.add(new Thread(new SampleX(5)));

		tList.get(0).setPriority(10);

        for (Thread eachItem : tList) {
            eachItem.start();
			try{
				eachItem.sleep(500);
			}catch(Exception e){
			}
		}
    }
}

class SampleX implements Runnable {
    int threadNum;

    SampleX(int temp) {
        threadNum = temp;
    }

    @Override
    public void run() {
        while (true) {
            for (int counter = 1; counter <= threadNum; counter++)
                System.out.print("\t");
            System.out.println(threadNum);
        }
    }
}