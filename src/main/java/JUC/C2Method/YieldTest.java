package JUC.C2Method;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;


@Slf4j(topic = "c.test1")
public class YieldTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                log.debug("enter sleep");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    log.debug("wake up");
                    e.printStackTrace();
                }
            }
        };
        t1.start();
//        Thread.sleep(1000);
        TimeUnit.SECONDS.sleep(1);
        //TODO
        //TODO建议TimeUnit有更好可读性
        log.debug("interrupt....");
        t1.interrupt();
    }
}
