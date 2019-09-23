package com.yeluo.head.first.state.dp;

/**
 * Created by yeluo on 2019/9/23.
 */
public class ClaimedState extends AbstractState {
    @Override
    public void check(Task task) {
        System.out.println("初审已被认领的任务：" + task.getTaskInfo());
        task.setState(Task.checkedState);
    }
}
