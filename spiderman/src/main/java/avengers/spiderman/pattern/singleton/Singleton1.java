package avengers.spiderman.pattern.singleton;

/**
 * @description: TODO   饱汉
 * @author: huanglb
 * @date 2019/6/13 17:24
 */
public class Singleton1 {
    private static Singleton1 singleton = null;
    private Singleton1() {
    }
    public static Singleton1 getInstance() {
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }
}
