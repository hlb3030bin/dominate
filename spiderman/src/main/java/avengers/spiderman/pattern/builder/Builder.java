package avengers.spiderman.pattern.builder;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/13 19:38
 */
public interface Builder {
    public void buildPart1();

    public void buildPart2();

    public Product retrieveResult();
}