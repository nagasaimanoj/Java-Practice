## Multi tasking
## Multi Processing
## Multi Threading

## Life cycle of a Thread (Thread States)

## How to create thread

There are two ways to create a thread:

By extending Thread class - Constructors / Methods
By implementing Runnable interface.

```
class Thread1 extends Thread{
    //@Override
    // public void run() {
    //     System.out.println("Thread is Running ...");
    // }

public static void main(String[] args) {
    Thread1 thread1=new Thread1();
    //thread1.run();
    thread1.start();
}
}

```
## Thread Sleep

```
class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        //thread1.run();
        thread1.start();
        thread2.start();
    }
}

```

## Exception in thread "main" java.lang.IllegalThreadStateException

```
thread1.start();
thread1.start();

```

## call run() method directly instead start() method?

```
class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        //thread1.run();
        
        //thread1.start();
        //thread2.start();

        thread1.run();
        thread2.run();
    }
}

```
## there is no context-switching because here t1 and t2 will be treated as normal object not thread object

```
class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        Thread1 thread3 = new Thread1();
        //thread1.run();

        //thread1.start();
        //thread2.start();

        //thread1.run();
        //thread2.run();

        thread1.start();
        try {
            //thread1.join(); 
            thread1.join(1500); 
            // join(long miliseconds)
            //t1 is completes its task for 1500 miliseconds(3 times) then t2 and t3 starts executing.
        } catch (Exception e) {
            System.out.println(e);
        }
        thread2.start();
        thread3.start();
    }
}

```
## getName(),setName(String) and getId()

```
  System.out.println("Name of thread1:"+thread1.getName());  
  System.out.println("Name of thread2:"+thread2.getName());  
  System.out.println("id of thread:"+thread1.getId());  
  thread1.setName("FileImport"); 
```
## currentThread()
```
public void run(){  
  System.out.println(Thread.currentThread().getName()); 
 }
```
## Thread Priority
```
public static int MIN_PRIORITY
public static int NORM_PRIORITY
public static int MAX_PRIORITY
```
#### Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.

```
  thread1.setPriority(Thread.MIN_PRIORITY);
  thread2.setPriority(Thread.MAX_PRIORITY);  
  thread1.start();  
  thread2.start(); 
```
## Daemon thread
```
thread1.setDaemon(true);//now thread1 is daemon thread  
    
  thread1.start();//starting threads  
  thread2.start();  
  thread3.start();
```
## Daemon thread // exception in thread main: java.lang.IllegalThreadStateException
```   
  thread1.start();//starting threads  
  thread1.setDaemon(true);//now thread1 is daemon thread  
  thread2.start();  
  thread3.start();
```
## Thread Pool
### a group of fixed size threads are created. A thread from the thread pool is pulled out and assigned a job by the service provider. After completion of the job, thread is contained in the thread pool again
#### Better performance It saves time because there is no need to create new thread.
#### It is used in Servlet and JSP where container creates a thread pool to process the request.
```
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName() + " (End)");//prints thread name  
    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```
```
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);//calling execute method of ExecutorService  
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");
    }
}
```
## ThreadGroup in Java
### To group multiple threads in a single object
#### Java thread group is implemented by java.lang.ThreadGroup class.
```
public class ThreadGroupDemo implements Runnable{  
    public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) {  
      ThreadGroupDemo runnable = new ThreadGroupDemo();  
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
            
          Thread t1 = new Thread(tg1, runnable,"one");  
          t1.start();  
          Thread t2 = new Thread(tg1, runnable,"two");  
          t2.start();  
          Thread t3 = new Thread(tg1, runnable,"three");  
          t3.start();  
               
          System.out.println("Thread Group Name: "+tg1.getName());  
         tg1.list();  
  
    }  
   }  
```
## Shutdown Hook
```
class MyThread extends Thread{  
    public void run(){  
        System.out.println("shut down hook task completed..");  
    }  
}  
  
public class TestShutdown1{  
public static void main(String[] args)throws Exception {  
  
Runtime r=Runtime.getRuntime();  
r.addShutdownHook(new MyThread());  
      
System.out.println("Now main sleeping... press ctrl+c to exit");  
try{Thread.sleep(3000);}catch (Exception e) {}  
}  
}  
```
## Garbage Collection
#### By nulling the reference
#### By assigning a reference to another
#### By annonymous object etc.

## Java Runtime class
```
1)	public static Runtime getRuntime()	returns the instance of Runtime class.
2)	public void exit(int status)	terminates the current virtual machine.
3)	public void addShutdownHook(Thread hook)	registers new hook thread.
4)	public Process exec(String command)throws IOException	executes given command in a separate process.
5)	public int availableProcessors()	returns no. of available processors.
6)	public long freeMemory()	returns amount of free memory in JVM.
7)	public long totalMemory()	returns amount of total memory in JVM.
```