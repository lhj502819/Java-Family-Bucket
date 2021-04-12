package effctive.java.builder;


import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * Description：
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @Date 2021/4/12
 */
public abstract class Pizza {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    public Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

    abstract class Builder<T extends  Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addToping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();

    }
}
