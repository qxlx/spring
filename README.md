 #高频面试题
1.spring 为什么不采用new的方式，而是通过反射创建。
灵活，运行时创建  Class类信息可以获取

2.实例化 vs 初始化
实例话-堆中开辟一块空间，对象属性值都是默认值
初始化：给属性设置值，1.填充属性 2.执行初始化方法 init-method 3.aop

3.aware接口到底是干什么的
当spring容器创建的bean对象在进行具体操作的时候，如果需要容器的其他对象，此时可以将对象实现aware接口。
来满足当前需要

4.springbean包含两个
普通对象：我们自定义需要的对象
容器对象：内置对象Spring需要的对象

5.重要的接口
beanfactory、Aware、BeanDefinition、BeanDefinitionReader、BeanFactoryPostProcessor
BeanPostProcessor
Environment: 环境 -standardEnviroment

6.FactoryBean vs beanFactory 区别
作用都是用来创建对象的，beanFactory必须遵循完整的创建过程，spring来管理控制
factoryBean只需要调用getObject()返回具体的对象，整个对象的创建过程用户自定义完成。更加灵活

7.为什么使用三级缓存？
关键点在于

8.熟悉主流程，核心点


9.lookup-method 标签来解决单例解决原型对象
通过拦截器的方式每次需要的时候创建最新的对象,而不会把原型对象缓存起来

一个单利对象是否可以引用原型对象,不会获取最新的

111.拓展点
1.


12. 在spring中 为什么大量使用cglib ??? 🤔

13. 创建对象的几种方式
    a.反射 b.BPF 创建 c.factoryMethod创建 d.factortBean e.supplier