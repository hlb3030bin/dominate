package avengers.spiderman.pattern.factory.simple;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 19:27
 */
public class Client {
    public static void main(String[]args){
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1,1);
    }
}