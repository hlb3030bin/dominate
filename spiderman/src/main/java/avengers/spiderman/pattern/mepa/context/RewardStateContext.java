package avengers.spiderman.pattern.mepa.context;

import avengers.spiderman.pattern.mepa.Request;
import avengers.spiderman.pattern.mepa.RewardState;

/**
 * @description: TODO 返奖状态执行的上下文
 * @author: huanglb
 * @date 2020/3/20 14:07
 */
public class RewardStateContext {

    private RewardState rewardState;

    public void setRewardState(RewardState currentState) {
        this.rewardState = currentState;
    }

    public RewardState getRewardState() {
        return rewardState;
    }

    public void echo(RewardStateContext context, Request request) {
        rewardState.doReward(context, request);
    }

    public boolean isResultFlag() {
        return true;
    }

}