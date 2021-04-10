package com.basis.java.gof23.adapter.example1.bird;

import com.basis.java.gof23.adapter.example1.Robot;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class BirdRobotAdapter implements Robot {
    private Bird bird;

    public BirdRobotAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void cry() {
        bird.jijizhazha();
    }

    @Override
    public void run() {
        bird.fly();
    }
}
