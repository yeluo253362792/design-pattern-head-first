package com.yeluo.head.first.state.dp;

import lombok.Data;

/**
 * Created by yeluo on 2019/9/23.
 */
@Data
public class Task {
    public static final UnInitializeState unInitializedState = new UnInitializeState();
    public static final ClaimedState claimedState = new ClaimedState();
    public static final CheckedState checkedState = new CheckedState();
    public static final RecheckedState recheckedState = new RecheckedState();

    private String taskInfo;
    private State state;

    public Task(String taskInfo) {
        this.taskInfo = taskInfo;
        this.state = unInitializedState;
    }

    public void claim() {
        state.claim(this);
    }

    public void check() {
        state.check(this);
    }

    public void recheck() {
        state.recheck(this);
    }

    public void reset() {
        this.state = new UnInitializeState();
    }
}
