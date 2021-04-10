package com.basis.java.gof23.observer.demo;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/28
 */
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住,"+name+"来救你");
    }

    @Override
    public void beAttacked(AllyConterCenter acc) {
        System.out.println(name+"被攻击了");
        acc.notyfyAllPlayers(name);
    }
}
