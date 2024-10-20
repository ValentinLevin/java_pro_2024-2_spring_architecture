package com.example.lesson2.tasks.task4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Task4Service {
    private final BeanDefinitionRegistry beanDefinitionRegistry;

    public Task4Service(ApplicationContext context) {
        this.beanDefinitionRegistry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
    }

    public void printEmployeesBeanInfo() {
        log.info("");
        log.info("task4--------------------start");
        printBeanInfo("employeeByJava");
        printBeanInfo("employeeByAnnotation");
        printBeanInfo("employeeByXml");
        log.info("task4--------------------finish");
    }

    private void printBeanInfo(String beanName) {
        BeanDefinition beanDefinition = this.beanDefinitionRegistry.getBeanDefinition(beanName);

        log.info("----- Bean name: {} -----", beanName);
        log.info("Class name: {}", beanDefinition.getBeanClassName());

        String[] dependsOn = beanDefinition.getDependsOn();
        if (dependsOn != null) {
            log.info("Depends on: {}", String.join(", ", beanDefinition.getDependsOn()));
        } else {
            log.info("Have no dependencies");
        }
        if (beanDefinition.isSingleton()) {
            log.info("Scope: singleton");
        } else if (beanDefinition.isPrototype()) {
            log.info("Scope: prototype");
        } else {
            log.info("Scope: {}", beanDefinition.getScope());
        }
        log.info("Is lazy init: {}", beanDefinition.isLazyInit());
    }
}
