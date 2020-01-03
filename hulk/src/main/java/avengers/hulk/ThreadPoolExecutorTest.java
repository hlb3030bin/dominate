package avengers.hulk;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/27 19:44
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ThreadPoolExecutor pool =
                new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        //pool.
    }

}
