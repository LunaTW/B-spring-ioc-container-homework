## Question 1
#### @Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

Answer: 
1. `@Component` 用来放在类的上面，其中的所有方法都会自动放在bean中。
2. `@Bean`用于自定义的方法。