package com.yeluo.head.first.state.dp;

/**
 * Created by yeluo on 2019/9/23.
 */
public interface State {
    void claim(Task task);
    void check(Task task);
    void recheck(Task task);
}
