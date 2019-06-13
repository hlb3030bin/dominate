package avengers.spiderman.pattern.singleton;

/**
 * @description: TODO Holder
 * @author: huanglb
 * @date 2019/6/13 17:32
 */
// Holder模式
// ThreadSafe
public class Singleton3 {
    private static class SingletonHolder {
        private static final Singleton3 singleton = new Singleton3();
        private SingletonHolder() {
        }
    }
    private Singleton3() {
    }
    public synchronized static Singleton3 getInstance() {
        return SingletonHolder.singleton;
    }
}
