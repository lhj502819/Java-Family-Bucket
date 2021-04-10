package com.basis.java.gof23.builder;

/**
 * 套餐类 --Product角色
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class Meal {
    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
