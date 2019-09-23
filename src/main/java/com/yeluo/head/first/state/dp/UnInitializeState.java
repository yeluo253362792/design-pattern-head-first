package com.yeluo.head.first.state.dp;

/**
 * Created by yeluo on 2019/9/23.
 */
public class UnInitializeState extends AbstractState {
    @Override
    public void claim(Task task) {
        System.out.println("认领待初始化任务：" + task.getTaskInfo());
        task.setState(Task.claimedState);
    }
}
