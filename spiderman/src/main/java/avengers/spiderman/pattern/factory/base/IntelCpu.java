package avengers.spiderman.pattern.factory.base;

import avengers.spiderman.pattern.factory.base.Cpu;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 19:23
 */
public class IntelCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
