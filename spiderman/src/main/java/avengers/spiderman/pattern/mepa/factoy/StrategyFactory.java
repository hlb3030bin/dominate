package avengers.spiderman.pattern.mepa.factoy;

import avengers.spiderman.pattern.mepa.RewardStrategy;

/**
 * @description: TODO 抽象工厂
 * @author: huanglb
 * @date 2020/3/20 13:37
 */
public abstract class StrategyFactory<T> {
    abstract RewardStrategy createStrategy(Class<T> c);
}
