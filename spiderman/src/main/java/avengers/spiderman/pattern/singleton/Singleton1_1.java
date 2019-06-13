package avengers.spiderman.pattern.singleton;

/**
 * @description: TODO 饱汉
 * @author: huanglb
 * @date 2019/6/13 17:25
 */
public class Singleton1_1 {
    private static Singleton1_1 singleton = null;
    private Singleton1_1() {
    }
    public synchronized static Singleton1_1 getInstance() {
        if (singleton == null) {
            singleton = new Singleton1_1();
        }
        return singleton;
    }
}