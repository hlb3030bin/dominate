package avengers.spiderman.pattern.mepa.ex;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2020/3/20 13:54
 */
//定义一个策略接口
public interface Strategy {
    void strategyImplementation();
}

//具体的策略实现(可以定义多个具体的策略实现)
class StrategyA implements Strategy {
    @Override
    public void strategyImplementation() {
        System.out.println("正在执行策略A");
    }
}

//封装策略，屏蔽高层模块对策略、算法的直接访问，屏蔽可能存在的策略变化
 class StrategyContext {
    private Strategy strategy = null;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy() {
        strategy.strategyImplementation();
    }
}
