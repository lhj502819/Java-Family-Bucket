package com.basis.java.gof23.builder;

/**
 * 抽象建造者  套餐构造器
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public abstract class MealBuilder {
    Meal meal = new Meal();

    abstract MealBuilder buildFood(String food);

    abstract MealBuilder buildDrink(String drink);
    abstract MealBuilder buildFood();
    abstract MealBuilder buildDrink();

    public Meal getMeal(){
        return meal;
    }
}
