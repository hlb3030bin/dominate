package avengers.spiderman.pattern.mepa.context;

import avengers.spiderman.pattern.mepa.RewardStrategy;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2020/3/20 13:39
 */
public class RewardContext {
    private RewardStrategy strategy;

    public RewardContext(RewardStrategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy(long userId) {
        int rewardMoney = strategy.reward(userId);
        strategy.insertRewardAndSettlement(userId,rewardMoney);
    }
}
