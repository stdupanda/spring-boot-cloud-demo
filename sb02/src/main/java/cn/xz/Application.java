package cn.xz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Application {
    // 创建事务管理器1
    // @Bean(name = "txManager1")
    // public PlatformTransactionManager txManager(DataSource dataSource) {
    // return new DataSourceTransactionManager(dataSource);
    // }

    // 创建事务管理器2
    // @Bean(name = "txManager2")
    // public PlatformTransactionManager txManager2(EntityManagerFactory factory) {
    // return new JpaTransactionManager(factory);
    // }

    // 实现接口 TransactionManagementConfigurer 方法，其返回值代表在拥有多个事务管理器的情况下默认使用的事务管理器
    // @Override
    // public PlatformTransactionManager annotationDrivenTransactionManager() {
    // return txManager2;
    // }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
