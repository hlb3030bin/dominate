package avengers.spiderman.publishsubscribe;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/12 13:53
 */
public class PublisherImpOne<M> implements IPublisher<M> {
    private String name;

    public PublisherImpOne(String name) {
        super();
        this.name = name;
    }

    public void publish(SubscribePublish subscribePublish, M message, boolean isInstantMsg) {
        subscribePublish.publish(this.name, message, isInstantMsg);
    }
}