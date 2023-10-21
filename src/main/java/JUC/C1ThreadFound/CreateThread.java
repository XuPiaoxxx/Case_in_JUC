package JUC.C1ThreadFound;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test1")
public class CreateThread {
    public static void main(String[] args) {
        Thread t=new MyThread();
        t.start();
        for (int i = 0; i < 100; i++) {
            log.debug("{}",i);
        }
    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                log.debug("{}",i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
