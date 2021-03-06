package avengers.spiderman.pattern.singleton;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 17:50
 */
// 枚举
// ThreadSafe
public enum Singleton4_1 {
    SINGLETON("enum is the easiest singleton pattern, but not the most readable") {
        public void testAbsMethod() {
            print();
            System.out.println("enum is ugly, but so flexible to make lots of trick");
        }
    };
    private String comment = null;
    Singleton4_1(String comment) {
        this.comment = comment;
    }
    public void print() {
        System.out.println("comment=" + comment);
    }
    abstract public void testAbsMethod();
    public static Singleton4_1 getInstance() {
        return SINGLETON;
    }
}