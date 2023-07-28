package threadpoolexecuter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WorkerPool {

    public static void main(String args[]) throws InterruptedException{
        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        ArrayBlockingQueue<Runnable> r=new ArrayBlockingQueue<Runnable>(4);
        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(1, 1, 40, TimeUnit.SECONDS, r, threadFactory, rejectionHandler);
       //ThreadPoolExecutor, we are keeping initial pool size as 2, maximum pool size to 4 and work queue size as 2. So if there are 4 running tasks and more tasks are submitted, the work queue will hold only 2 of them and the rest of them will be handled by RejectedExecutionHandlerImpl.


        for(int i=0; i<10; i++){
            executorPool.execute(new WorkerThread());
        }





        while(executorPool.getActiveCount()!=0||r.size()!=0);
        Thread.sleep(11000);
        executorPool.shutdown();
        System.out.println("Your score out of 5 was: "+WorkerThread.score);

        
    }
}