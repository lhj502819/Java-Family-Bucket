# 原型设计模式​
通过调用原型对象的克隆方法复制出新的对象

## 深拷贝
    可通过序列化、反序列化实现深拷贝
    可以通过对原型对象中的引用变量进行重新创建对象并赋值来实现深拷贝
![Image text](https://cdn.nlark.com/yuque/0/2020/png/1171730/1587818030364-3703f39f-53c8-4c09-8215-26a3b81694be.png)
       
## 浅拷贝
    Object#clone 为浅拷贝
 ![Image text](https://cdn.nlark.com/yuque/0/2020/png/1171730/1587817833586-a941d7f3-143e-4abb-994c-0eea5e0289e4.png)
    