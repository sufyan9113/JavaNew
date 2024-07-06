package MultiThreading;

public class ThreadName 
{
    public static void main(String[] args) 
    {
        System.out.println("main thread");

        System.out.println("before");
        String threadName=Thread.currentThread().getName();
        System.out.println("current thread name: "+threadName);
        System.out.println("current thread priority: "+Thread.currentThread().getPriority());

        Thread t=Thread.currentThread();

        t.setName("custom thread");
        Thread.currentThread().setPriority(1);

        System.out.println("after");
        String threadName2= t.currentThread().getName();
        System.out.println("current thread name: "+threadName2);
        System.out.println("current thread priority: "+Thread.currentThread().getPriority());


        
    }
}
