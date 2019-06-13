package avengers.spiderman.pattern.builder;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 19:40
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}