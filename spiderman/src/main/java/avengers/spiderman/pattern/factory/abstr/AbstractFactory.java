package avengers.spiderman.pattern.factory.abstr;

import avengers.spiderman.pattern.factory.base.Cpu;
import avengers.spiderman.pattern.factory.base.Mainboard;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 19:28
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public Mainboard createMainboard();
}