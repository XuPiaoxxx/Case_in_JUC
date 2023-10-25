package JUC.C2Method;

import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;

@Slf4j(topic = "c.runAndStart")
public class Testrunandstart {
    public static void main(String[] args) {
        Thread t1=new Thread("t1"){
            @Override
            public void run() {
                log.debug("running....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
//        t1.run();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        log.debug("main.");
    }
}
