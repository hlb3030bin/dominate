package avengers.spiderman.pattern.factory.base;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 19:25
 */
public class AmdMainboard implements Mainboard {
    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;
    /**
     * 构造方法，传入CPU插槽的孔数
     * @param cpuHoles
     */
    public AmdMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        // TODO Auto-generated method stub
        System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
    }
}