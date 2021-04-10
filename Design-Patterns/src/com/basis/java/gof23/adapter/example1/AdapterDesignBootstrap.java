package com.basis.java.gof23.adapter.example1;

import com.basis.java.gof23.adapter.example1.bird.Bird;
import com.basis.java.gof23.adapter.example1.bird.BirdRobotAdapter;
import com.basis.java.gof23.adapter.example1.dog.Dog;
import com.basis.java.gof23.adapter.example1.dog.DogRobotAdapter;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class AdapterDesignBootstrap {
    public static void main(String[] args) {
        //小狗适配器
        DogRobotAdapter dogRobotAdapter = new DogRobotAdapter(new Dog());
        dogRobotAdapter.cry();
        dogRobotAdapter.run();
        //小鸟适配器
        BirdRobotAdapter birdRobotAdapter = new BirdRobotAdapter(new Bird());
        birdRobotAdapter.cry();
        birdRobotAdapter.run();
    }
}
