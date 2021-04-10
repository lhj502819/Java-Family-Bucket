package com.basis.java.gof23.observer.demo;

/**
 * 具体战队控制中心类：具体目标类
 *
 * @author lihongjian
 * @since 2020/4/28
 */
public class ConcreteAllyControllerCenter extends AllyConterCenter {

    public ConcreteAllyControllerCenter(String name) {
        System.out.println("战队"+name+"创建成功");
        this.allyName = name;
    }

    @Override
    public void notyfyAllPlayers(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        for (Observer player : players) {
            player.help();
        }
    }
}
