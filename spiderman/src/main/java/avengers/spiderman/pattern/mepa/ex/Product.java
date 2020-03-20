package avengers.spiderman.pattern.mepa.ex;

import lombok.SneakyThrows;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2020/3/20 13:59
 */
//抽象的产品
public abstract class Product {
    public abstract void method();
}

//定义一个具体的产品 (可以定义多个具体的产品)
class ProductA extends Product {
    @Override
    public void method() {
    }  //具体的执行逻辑
}

//抽象的工厂
abstract class Factory<T> {
    abstract Product createProduct(Class<T> c) throws ClassNotFoundException;
}

//具体的工厂可以生产出相应的产品
class FactoryA extends Factory {
    @SneakyThrows
    @Override
    Product createProduct(Class c) throws ClassNotFoundException {
        Product product = (Product) Class.forName(c.getName()).newInstance();
        return product;
    }
}