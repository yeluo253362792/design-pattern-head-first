package com.yeluo.head.first.state.dp;

/**
 * Created by yeluo on 2019/9/23.
 */
public class RecheckedState extends AbstractState {
    @Override
    public void claim(Task task) {
        System.out.println("任务已处理完毕！");
    }

    @Override
    public void check(Task task) {
        System.out.println("任务已处理完毕！");
    }

    @Override
    public void recheck(Task task) {
        System.out.println("任务已处理完毕！");
    }
}
