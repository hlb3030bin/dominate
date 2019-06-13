package avengers.spiderman.pattern.factory.abstr;

import avengers.spiderman.pattern.factory.base.Cpu;
import avengers.spiderman.pattern.factory.base.IntelCpu;
import avengers.spiderman.pattern.factory.base.IntelMainboard;
import avengers.spiderman.pattern.factory.base.Mainboard;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 19:28
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(938);
    }

}