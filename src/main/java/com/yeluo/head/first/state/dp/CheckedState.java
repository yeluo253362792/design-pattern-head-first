package com.yeluo.head.first.state.dp;

/**
 * Created by yeluo on 2019/9/23.
 */
public class CheckedState extends AbstractState {
    @Override
    public void recheck(Task task) {
        System.out.println("复审初审已完成的任务：" + task.getTaskInfo());
        task.setState(Task.recheckedState);
    }
}
