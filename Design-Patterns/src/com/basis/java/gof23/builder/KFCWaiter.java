package com.basis.java.gof23.builder;

/**
 * 指挥者  KFC服务员
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class KFCWaiter {
    private MealBuilder mealBuilder;

    public KFCWaiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal getMeal(){
        //准备food
        //准备drink
        //返回套餐
        return mealBuilder
                .buildFood()
                .buildDrink()
                .getMeal();
    }
}
