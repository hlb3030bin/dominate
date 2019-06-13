package avengers.spiderman.pattern.singleton;

/**
 * @description: TODO 恶汉
 * @author: huanglb
 * @date 2019/6/13 17:30
 */
public class Singleton2 {
    private static final Singleton2 singleton = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return singleton;
    }
}
