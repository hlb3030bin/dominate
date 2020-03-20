package avengers.spiderman.pattern.mepa.impl;

import avengers.spiderman.pattern.mepa.RewardStrategy;
import avengers.spiderman.pattern.mepa.context.RewardContext;
import avengers.spiderman.pattern.mepa.factoy.FactorRewardStrategyFactory;
import avengers.spiderman.pattern.mepa.newUserRewardStrategyA;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2020/3/20 13:42
 */
public class InviteRewardImpl {
    //返奖主流程
    public void sendReward(long userId) {
        FactorRewardStrategyFactory strategyFactory = new FactorRewardStrategyFactory();  //创建工厂
        //Invitee invitee = getInviteeByUserId(userId);  //根据用户id查询用户信息
        //invitee.userType == UserTypeEnum.NEW_USER
        if (1==1) {  //新用户返奖策略
            RewardStrategy newUserBasicReward = (RewardStrategy) strategyFactory.createStrategy(newUserRewardStrategyA.class);
            RewardContext rewardContext = new RewardContext(newUserBasicReward);
            rewardContext.doStrategy(userId); //执行返奖策略
        }if(2==2){}  //老用户返奖策略，...
        //invitee.userType == UserTypeEnum.OLD_USER

    }
}
