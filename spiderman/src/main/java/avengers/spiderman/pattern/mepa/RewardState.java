package avengers.spiderman.pattern.mepa;

import avengers.spiderman.pattern.mepa.context.RewardStateContext;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2020/3/20 14:07
 */
public abstract class RewardState {
    public abstract void doReward(RewardStateContext context, Request request);
}
