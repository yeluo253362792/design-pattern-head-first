package com.yeluo.head.first.state.dp;

/**
 * Created by yeluo on 2019/9/23.
 */
public class AbstractState implements State {

    @Override
    public void claim(Task task) {
        System.out.println("非初始化状态的任务不能被认领！");
    }

    @Override
    public void check(Task task) {
        System.out.println("非已认领状态的任务不能被初审！");
    }

    @Override
    public void recheck(Task task) {
        System.out.println("非初审完成的任务不能被复审！");
    }
}
