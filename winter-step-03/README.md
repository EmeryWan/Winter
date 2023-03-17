## 基于 Cglib 实现类的实例化策略




```
winter-step-02
└── src
    ├── main
    │   └── java
    │       └── cn.bugstack.springframework.beans
    │           ├── factory
    │           │   ├── config
    │           │   │   ├── BeanDefinition.java
    │           │   │   └── SingletonBeanRegistry.java
    │           │   ├── support
    │           │   │   ├── AbstractAutowireCapableBeanFactory.java
    │           │   │   ├── AbstractBeanFactory.java
    │           │   │   ├── BeanDefinitionRegistry.java
    │           │   │   ├── CglibSubclassingInstantiationStrategy.java
    │           │   │   ├── DefaultListableBeanFactory.java
    │           │   │   ├── DefaultSingletonBeanRegistry.java
    │           │   │   ├── InstantiationStrategy.java
    │           │   │   └── SimpleInstantiationStrategy.java
    │           │   └── BeanFactory.java
    │           └── BeansException.java
    └── test
```