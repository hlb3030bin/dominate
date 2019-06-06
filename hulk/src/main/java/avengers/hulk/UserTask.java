package avengers.hulk;

import java.util.concurrent.*;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/6 13:06
 */
public class UserTask {
    //队列大小
    private final int QUEUE_LENGTH = 10000 * 10;
    //基于内存的阻塞队列
    private BlockingQueue<String> queue = new LinkedBlockingQueue<String>(QUEUE_LENGTH);
    //创建计划任务执行器
    private ScheduledExecutorService es = Executors.newScheduledThreadPool(1);

    /**
     * 构造函数，执行execute方法
     */
    public UserTask() {
        execute();
    }

    /**
     * 添加信息至队列中
     *
     * @param content
     */
    public void addQueue(String content) {
        queue.add(content);
    }

    /**
     * 初始化执行
     */
    public void execute() {
        //每一分钟执行一次
        es.scheduleWithFixedDelay(new Runnable() {
            public void run() {
                try {
                    String content = queue.take();
                    //处理队列中的信息。。。。。
                    System.out.println(content);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, 0, 1, TimeUnit.MINUTES);
    }


    public static void main(String[] args) {
        UserTask userTask = new UserTask();
        for (int i = 0; i <= 1000; i++) {
            userTask.addQueue(i + "string");
        }
    }
}
