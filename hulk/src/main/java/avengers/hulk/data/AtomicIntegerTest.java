package avengers.hulk.data;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/14 9:51
 */
public class AtomicIntegerTest {
    private static final int THREADS_CONUT = 20;
    public static AtomicInteger count = new AtomicInteger(0);

    public static void increase() {
        AtomicReference dd= new AtomicReference();
        count.incrementAndGet();

    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_CONUT];
        for (int i = 0; i < THREADS_CONUT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(count);
    }

}
