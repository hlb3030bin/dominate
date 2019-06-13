package avengers.spiderman.pattern.factory.simple;

import avengers.spiderman.pattern.factory.base.AmdCpu;
import avengers.spiderman.pattern.factory.base.Cpu;
import avengers.spiderman.pattern.factory.base.IntelCpu;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 19:25
 */
public class CpuFactory {
    public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}