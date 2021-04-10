package com.basis.java.gof23.observer.demo;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/28
 */
public class Client {
    public static void main(String[] args) {
        Player player1 = new Player("张飞");
        Player player2 = new Player("关羽");
        Player player3 = new Player("刘备");
        Player player4 = new Player("曹操");
        Player player5 = new Player("荀彧");
        AllyConterCenter allyConterCenter = new ConcreteAllyControllerCenter("蜀国联盟");
        allyConterCenter.join(player1);
        allyConterCenter.join(player2);
        allyConterCenter.join(player3);
        AllyConterCenter allyConterCenter2 = new ConcreteAllyControllerCenter("魏国联盟");
        allyConterCenter2.join(player4);
        allyConterCenter2.join(player5);
        player2.beAttacked(allyConterCenter);
        allyConterCenter2.equals(player5);
    }
}
