package avengers.spiderman.pattern.mepa;

/**
 * @description: TODO 抽象策略
 * @author: huanglb
 * @date 2020/3/20 13:34
 */
public  abstract class RewardStrategy {
    public abstract int reward(long userId);

    public void insertRewardAndSettlement(long userId, int reward) { } ; //更新用户信息以及结算
}

