public class DaemonThread extends Thread {

   public void run(){
	  if(Thread.currentThread().isDaemon()){ 
	      System.out.println("Daemon thread executing");  
	  }  
	  else{  
	      	System.out.println("user(normal) thread executing");  
          }  
   }  
	public static void main(String[] args){  
		DaemonThread t1 = new DaemonThread();
		t1.setDaemon(true);
		t1.start();
		new DaemonThread().start();
   }
}