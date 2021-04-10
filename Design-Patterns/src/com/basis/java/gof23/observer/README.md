# 观察者模式​

### template包：观察者模式代码模板
在有些更加复杂的情况下，具体观察者类ConcreteObserver的update()方法在执行时需要使用到具体目标类ConcreteSubject中的状态（属性），因此在ConcreteObserver与ConcreteSubject之间有时候还存在关联或依赖关系，在ConcreteObserver中定义一个ConcreteSubject实例，通过该实例获取存储在ConcreteSubject中的状态。如果ConcreteObserver的update()方法不需要使用到ConcreteSubject中的状态属性，则可以对观察者模式的标准结构进行简化，在具体观察者ConcreteObserver和具体目标ConcreteSubject之间无须维持对象引用。如果在具体层具有关联关系，系统的扩展性将受到一定的影响，增加新的具体目标类有时候需要修改原有观察者的代码，在一定程度上违反了“开闭原则”，但是如果原有观察者类无须关联新增的具体目标，则系统扩展性不受影响。

### demo包：多人联机游戏设计
![Image](https://cdn.nlark.com/yuque/0/2020/png/1171730/1588085650661-34827ab9-135c-437f-a79b-c2d00240cd0a.png)

在本实例中，实现了两次对象之间的联动，当一个游戏玩家Player对象的beAttacked()方法被调用时，将调用AllyControlCenter的notifyObserver()方法来进行处理，而在notifyObserver()方法中又将调用其他Player对象的help()方法。Player的beAttacked()方法、AllyControlCenter的notifyObserver()方法以及Player的help()方法构成了一个联动触发链，执行顺序如下所示：

Player.beAttacked() --> AllyControlCenter.notifyObserver() -->Player.help()。

### 文档链接：https://www.yuque.com/lihongjian/codingrecord/zl0v3e/edit
