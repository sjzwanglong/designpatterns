# designpatterns
java设计模式复习总结

##设计原则
1. 开闭原则（Open Close Principle）
2. 里氏代换原则（Liskov Substitution Principle）
3. 依赖倒转原则（Dependence Inversion Principle）
4. 接口隔离原则（Interface Segregation Principle）
5. 迪米特法则，又称最少知道原则（Demeter Principle）
6. 合成复用原则（Composite Reuse Principle）
7. 单一职责原则（Single Responsibility Principle，SRP）


##设计模式分类

|类别|设计模式|
:-:|:-
创建型模式|工厂模式（Factory Pattern）<BR/>抽象工厂模式（Abstract Factory Pattern）<BR/>单例模式（Singleton Pattern）<BR/>建造者模式（Builder Pattern）<BR/>原型模式（Prototype Pattern）
结构型模式|适配器模式（Adapter Pattern）<BR/>桥接模式（Bridge Pattern）<BR/>过滤器模式（Filter、Criteria Pattern）<BR/>组合模式（Composite Pattern）<BR/>装饰器模式（Decorator Pattern）<BR/>外观模式（Facade Pattern）<BR/>享元模式（Flyweight Pattern）<BR/>代理模式（Proxy Pattern）
行为型模式|责任链模式（Chain of Responsibility Pattern）<BR/>命令模式（Command Pattern）<BR/>解释器模式（Interpreter Pattern）<BR/>迭代器模式（Iterator Pattern）<BR/>中介者模式（Mediator Pattern）<BR/>备忘录模式（Memento Pattern）<BR/>观察者模式（Observer Pattern）<BR/>状态模式（State Pattern）<BR/>空对象模式（Null Object Pattern）<BR/>策略模式（Strategy Pattern）<BR/>模板模式（Template Pattern）<BR/>访问者模式（Visitor Pattern）
J2EE 模式|MVC 模式（MVC Pattern）<BR/>业务代表模式（Business Delegate Pattern）<BR/>组合实体模式（Composite Entity Pattern）<BR/>数据访问对象模式（Data Access Object Pattern）<BR/>前端控制器模式（Front Controller Pattern）<BR/>拦截过滤器模式（Intercepting Filter Pattern）<BR/>服务定位器模式（Service Locator Pattern）<BR/>传输对象模式（Transfer Object Pattern）


##目录说明

### 设计原则目录说明

目录名|设计原则
:-:|:-
principle/ocp|开闭原则
principle/lsp|里氏代换原则
principle/dip|依赖倒转原则
principle/isp|接口隔离原则
principle/lod|迪米特法则
principle/crp|合成复用原则
principle/srp|单一职责原则

### 设计模式目录说明

目录名|设计模式|描述
:-:|:-|:-
factory|工厂模式|静态工厂、工厂方法、抽象工厂
singleton|单例模式|饿汉式(2种)、懒汉式(3种)、双重检查、内部类、枚举
builder|建造者模式|
prototype|原型模式|浅拷贝、深拷贝
adapter|适配器模式|对象适配、类适配
bridge|桥接模式|
filter|过滤器模式/标准模式|
composite|组合模式|
facade|外观模式|基本方式、进阶方式(增加外观抽象类)
flyweight|享元模式|
proxy|代理模式|基本方式、JDK自带方式、CGlib方式
chainOR|责任链模式|基本方式、优化方式(在类构造器中指定下一责任人)
command|命令模式|
interpreter|解释器模式|
iterator|迭代器模式|
mediator|中介者模式|
memento|备忘录模式|单备份方式、与原型模式组合使用方式
observer|观察者模式|基本方式、JDK自带方式
state|状态模式|基本方式、与享元模式组合使用方式
nullobject|空对象模式|
strategy|策略模式|基本方式、组合方式
template|模板模式|基本方式、增加钩子方式
visitor|访问者模式|
mvc|MVC模式|
businessDelegate|业务代表模式|
compositeEntity|组合实体模式|
dao|数据访问对象模式|
frontController|前端控制器模式|
interceptingFilter|拦截过滤器模式|
serviceLocator|服务定位器模式|
transferObject|传输对象模式|
