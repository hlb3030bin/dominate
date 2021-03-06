package avengers.spiderman;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/20 15:09
 */
public class MyQueue {

    // 1、需要一个承装元素的集合
    private final LinkedList<Object> list = new LinkedList<>();
    // 2、需要一个计数器
    private final AtomicInteger count = new AtomicInteger(0);
    // 3、需要指定上限和下限
    private final int maxSize = 5;
    private final int minSize = 0;

    // 5、初始化锁对象
    private final Object lock = new Object();

    /**
     * put方法
     */
    public void put(Object obj) {
        synchronized (lock) {
            // 达到最大无法添加，进入等到
            while (count.get() == maxSize) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(obj); // 加入元素
            count.getAndIncrement(); // 计数器增加
            System.out.println(" 元素 " + obj + " 被添加 ");
            lock.notify(); // 通知另外一个阻塞的线程方法
        }
    }

    /**
     * get方法
     */
    public Object get() {
        Object temp;
        synchronized (lock) {
            // 达到最小，没有元素无法消费，进入等到
            while (count.get() == minSize) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count.getAndDecrement();
            temp = list.removeFirst();
            System.out.println(" 元素 " + temp + " 被消费 ");
            lock.notify();
        }
        return temp;
    }

    public int size() {
        return count.get();
    }

}
