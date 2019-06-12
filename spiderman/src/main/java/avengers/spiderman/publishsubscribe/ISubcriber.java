package avengers.spiderman.publishsubscribe;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/12 13:52
 */
public interface ISubcriber<M> {
    public void subcribe(SubscribePublish subscribePublish);

    public void unSubcribe(SubscribePublish subscribePublish);

    public void update(String publisher, M message);
}