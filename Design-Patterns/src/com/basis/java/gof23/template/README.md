# 模板方法模式

## 基本方法
(1)抽象方法：一个抽象方法由抽象类声明、由其具体子类实现。

(2)具体方法：一个具体方法由抽象类或者具体子类实现，其子类可以直接副高或者继承

(3)钩子方法：钩子方法由抽象类或者子类声明并实现，而其子类可加以扩展。
   第一类钩子方法：与具体步骤挂钩，用来实现不同条件下执行模板方法中的不同的步骤，也可以控制步骤是否执行，这类钩子方法的返回值一般是boolean类型
   第二类钩子方法：实现体为空的具体方法，子类可以根据需要选择覆盖或者继承这些钩子方法，与抽象方法相比，这类钩子方法的好处在于，子类如果没有覆盖父类定义的钩子方法，编译可以正常通过，但是如果没有覆盖父类中声明的抽象方法，编译将报错

### demo包：
某软件公司欲为某银行的业务支撑系统开发一个利息计算模块，利息计算流程如下：

(1) 系统根据账号和密码验证用户信息，如果用户信息错误，系统显示出错提示；

(2) 如果用户信息正确，则根据用户类型的不同使用不同的利息计算公式计算利息（如活期账户和定期账户具有不同的利息计算公式）；

(3) 系统显示利息。

试使用模板方法模式设计该利息计算模块。

#### UML类图：

![Image](https://cdn.nlark.com/yuque/0/2020/png/1171730/1588126042489-5174d27b-5c96-4f4c-a3f9-55cb034d6978.png)


### 文档链接：https://www.yuque.com/lihongjian/codingrecord/xe9r4t#udJPB