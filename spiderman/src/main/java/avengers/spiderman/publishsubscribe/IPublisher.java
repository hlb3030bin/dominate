package avengers.spiderman.publishsubscribe;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/12 13:52
 */
public interface IPublisher<M> {
    public void publish(SubscribePublish subscribePublish, M message, boolean isInstantMsg);
}