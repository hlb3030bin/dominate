package avengers.spiderman.publishsubscribe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/12 13:54
 */
public class SubcriberImpOne<M> implements ISubcriber<M> {
    public String name;

    public SubcriberImpOne(String name) {
        super();
        Lock lock= new ReentrantLock();
        this.name = name;
    }

    public void subcribe(SubscribePublish subscribePublish) {
        subscribePublish.subcribe(this);
    }

    public void unSubcribe(SubscribePublish subscribePublish) {
        subscribePublish.unSubcribe(this);
    }

    public void update(String publisher, M message) {
        System.out.println(this.name + "收到" + publisher + "发来的消息:" + message.toString());
    }
}
