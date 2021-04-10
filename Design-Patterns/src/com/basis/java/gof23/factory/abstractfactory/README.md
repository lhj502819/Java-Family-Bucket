# 抽象工厂

依然是披萨店。为了要保证每家加盟店都能够生产高质量的披萨，防止使用劣质的原料，我们打算建造一家生产原料的工厂，并将原料运送到各家加盟店。但是加盟店都位于不同的区域，比如纽约、芝加哥。纽约使用一组原料，芝加哥使用另一种原料。在这里我们可以这样理解，这些不同的区域组成了原料家族，每个区域实现了一个完整的原料家族。
![Image text](http://static.iocoder.cn/images/DegisnPattern/xiaomingge/20130603084013156.png)

其中PizzaIngredientFactory是抽象的披萨原料工厂接口，它定义了如何生产一个相关产品的家族。这个家族包含了所有制作披萨的原料。

NYPizzaIngredientFactory和ChicagoPizzaIngredientFactory是两个具体披萨工厂类，他们负责生产相应的披萨原料。

NYPizzaStore是抽象工厂的客户端。


Pizza的代码利用相关的工厂生产原料。所生产的原料依赖所使用的工厂，Pizza类根本不关心这些原料，它只需要知道如何制作披萨即可。这里，Pizza和区域原料之间被解耦。