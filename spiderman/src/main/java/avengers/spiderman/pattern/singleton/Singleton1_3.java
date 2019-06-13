package avengers.spiderman.pattern.singleton;

/**
 * @description: TODO 饱汉
 * @author: huanglb
 * @date 2019/6/13 17:29
 */
public class Singleton1_3 {

    private static volatile  Singleton1_3 singleton = null;

    private Singleton1_3() {
    }

    public static Singleton1_3 getInstance() {
        // may get half object
        if (singleton == null) {
            synchronized (Singleton1_3.class) {
                if (singleton == null) {
                    singleton = new Singleton1_3();
                }
            }
        }
        return singleton;
    }
}
