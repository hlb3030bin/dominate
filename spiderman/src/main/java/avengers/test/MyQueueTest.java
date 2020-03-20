package avengers.test;

import avengers.spiderman.MyQueue;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/20 15:21
 */
public class MyQueueTest {
    public static void main(String[] args) throws Exception {

        final MyQueue myQueue = new MyQueue();
        initMyQueue(myQueue);

        Thread t1 = new Thread(() -> {
            myQueue.put("f");
            myQueue.put("g");
            myQueue.put("h");
            myQueue.put("i");
        }, "t1");

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                myQueue.get();
                Thread.sleep(1000);
                myQueue.get();
                Thread.sleep(1000);
                myQueue.get();
                Thread.sleep(1000);
                myQueue.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t2");

        t1.start();
        Thread.sleep(1000);
        t2.start();

    }

    private static void initMyQueue(MyQueue myQueue) {
        myQueue.put("a");
        myQueue.put("b");
        myQueue.put("c");
        myQueue.put("d");
        myQueue.put("e");
        System.out.println("当前元素个数：" + myQueue.size());
    }

}
