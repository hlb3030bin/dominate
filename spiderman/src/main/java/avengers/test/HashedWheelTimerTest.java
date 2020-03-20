package avengers.test;

import io.netty.util.HashedWheelTimer;

import java.io.IOException;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 时间路
 * @author: huanglb
 * @date 2020/1/3 17:15
 */
public class HashedWheelTimerTest {
    public static void main(String[] args) throws IOException {
        //创建Timer, 精度为100毫秒,
        HashedWheelTimer timer = new HashedWheelTimer(100, TimeUnit.MILLISECONDS, 16);

        System.out.println(LocalTime.now());

        timer.newTimeout((timeout) -> {
            System.out.println(LocalTime.now());
            System.out.println(timeout);
        }, 5, TimeUnit.SECONDS);

        timer.newTimeout((timeout) -> {
            System.out.println(LocalTime.now());
            System.out.println("huangda");
            System.out.println(timeout);
        }, 10, TimeUnit.SECONDS);

        //阻塞main线程
        System.in.read();
    }
}
