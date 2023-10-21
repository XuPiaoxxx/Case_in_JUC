package JUC.C1ThreadFound;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.test2")
public class CreateThread02 {
    public static void main(String[] args) {
        Runnable run1=()->log.debug("lambda");
        Runnable target=new MyRunnable();
        Thread t1=new Thread(target,"‘µ…Ò∆Ù∂Ø!");
        t1.start();
        Thread t2=new Thread(run1);
        t2.start();
    }
    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                log.debug("{}",i);
            }
        }
    }
}
