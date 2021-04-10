package com.basis.java.gof23.builder;

/**
 * @author lihongjian
 * @since 2020/4/25
 */
public class Consumer {

    public static void main(String[] args) {
        //通过kfcwaiter指挥者去间接的构建事物
        KFCWaiter kfcWaiter = new KFCWaiter(new MealABuilder());
        Meal meal = kfcWaiter.getMeal();
        System.out.println(meal);

        //自己指定要哪些组件，不要指挥者参与
        MealBuilder mealBuilder = new MealABuilder();
        Meal meal1 = mealBuilder.buildDrink("冰红茶").buildFood("三个鸡腿").getMeal();
        System.out.println(meal1);
    }
}
