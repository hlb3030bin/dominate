package avengers.spiderman.pattern.mepa;

import avengers.spiderman.pattern.mepa.context.RewardStateContext;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2020/3/20 14:08
 */
//待校验状态
public class OrderCheckState extends RewardState{
    @Override
    public void doReward(RewardStateContext context, Request request) {
        orderCheck(context, request);  //对进来的订单进行校验，判断是否用券，是否满足优惠条件等等
    }


    private void orderCheck(RewardStateContext context, Request request) {
    }
}
