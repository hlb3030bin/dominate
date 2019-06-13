package avengers.spiderman.pattern.singleton;

/**
 * @description: TODO 饱汉
 * @author: huanglb
 * @date 2019/6/13 17:27
 */
public class Singleton1_2 {
    private static Singleton1_2 singleton = null;

    private Singleton1_2() {
    }

    public static Singleton1_2 getInstance() {
        // may get half object
        if (singleton == null) {
            synchronized (Singleton1_2.class) {
                if (singleton == null) {
                    singleton = new Singleton1_2();
                }
            }
        }
        return singleton;
    }
}

