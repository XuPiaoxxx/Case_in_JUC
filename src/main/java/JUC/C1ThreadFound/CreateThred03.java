package JUC.C1ThreadFound;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Slf4j(topic = "c.test03")
public class CreateThred03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Callable call=new MyCallable();
//        FutureTask<String> task=new FutureTask<>(call);
//        Thread t1=new Thread(task,"T1");
//        t1.start();
//        System.out.println("Main");
//        Thread.sleep(1000);
//        String s=task.get();
//        log.debug(s);
        FutureTask<String> task =new FutureTask<>(new Callable<String>(){
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName()+"‘µ…Ò∆Ù∂Ø!!!";
            }
        });
        Thread t1=new Thread(task);
        t1.start();
        String str=task.get();
        log.debug("{}",str);
    }
    public static class MyCallable implements Callable<String>{
        @Override
        public String call(){
            return Thread.currentThread().getName()+"->"+"Hello";
        }
    }
}
