package cn.onenine.design.patterns.principle;

/**
 * 单一职责
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/19
 */
public class SingleResponsibilityPrinciple {

    /**
     * 如何理解单一指责原则（SRP）？
     *    一个类只负责完成一个职责或者功能。不要设计大而全的类，要设计力度小、功能单一的类。
     *    单一指责原则是为了实现代码高内聚、低耦合，提高代码的复用性、可读性、可维护性。
     *
     * 如何判断类的职责是否足够单一？
     *     不同应用场景、不同阶段的需求背景、不同的业务层面，对同一个类的职责是否单一，可能会有不同的判定结果。
     *     一些侧面的判断指标更具有指导意义和可执行性，比如，出现下面这些情况就有可能说明累的设计不满足单一职责原则：
     *     1、类中的代码行数、函数或者属性过多
     *     2、类依赖的其他类过多，或者依赖的其他类过多
     *     3、私有方法过多
     *     4、比较难给类起一个合适的名字
     *     5、类中大量的方法都是几种操作类中的某几个属性
     *
     * 类的职责是否设计得越单一越好？
     *     单一指责原则通过避免设计大而全的类，避免将不相干的功能耦合在一起，来提高类的内聚性。
     *     同时，类职责单一，类依赖和被依赖的其他类也会变少，减少代码的耦合性，以此来实现代码的高内聚、低耦合。
     *     但是，如果拆分得过细，实际上会适得其反，反倒会降低内聚性，也会影响代码的可维护性
     */



}
