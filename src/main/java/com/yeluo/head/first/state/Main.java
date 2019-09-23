package com.yeluo.head.first.state;

import com.yeluo.head.first.state.dp.Task;

/**
 * Created by yeluo on 2019/9/23.
 */
public class Main {

    public static void main(String[] args) {
        Task task = new Task("Hello world!");
        task.claim();
        task.check();
        task.recheck();

        task.claim();

        task.reset();
        task.recheck();
    }

}
