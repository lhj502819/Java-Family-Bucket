package com.basis.java.gof23.builder;

/**
 * 具体事务构造者 ​ 套餐A、套餐B。这个两个套餐都是实现抽象套餐类。
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class MealABuilder extends MealBuilder{
    @Override
    MealBuilder buildFood(String food) {
        meal.setFood(food);
        return this;
    }

    @Override
    MealBuilder buildDrink(String drink) {
        meal.setDrink(drink);
        return this;
    }

    @Override
    MealBuilder buildFood() {
        meal.setFood("一个汉堡");
        return  this;
    }

    @Override
    MealBuilder buildDrink() {
        meal.setDrink("一杯可乐");
        return  this;
    }
}
