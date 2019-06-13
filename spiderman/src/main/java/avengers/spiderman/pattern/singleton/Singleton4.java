package avengers.spiderman.pattern.singleton;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 17:35
 */
public enum  Singleton4 {

    SINGLETON;
    public void sOut(int i) {
        if(i>100){
            System.out.println("结束");
            return;
        }
        System.out.println(i);
        i++;
        sOut(i);


    }

    public static void main(String[] args) {
        Singleton4.SINGLETON.sOut(1);
    }
}

