package avengers.spiderman.pattern.factory.base;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 19:24
 */
public class AmdCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  AmdCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}