package avengers.spiderman.pattern.mepa.factoy;

import avengers.spiderman.pattern.mepa.RewardStrategy;

/**
 * @description: TODO 具体工厂创建具体的策略
 * @author: huanglb
 * @date 2020/3/20 13:37
 */
public class FactorRewardStrategyFactory extends StrategyFactory  {
    @Override
    public RewardStrategy createStrategy(Class c) {
        RewardStrategy product = null;
        try {
            product = (RewardStrategy) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {}
        return product;
    }
}
