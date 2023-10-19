package com.example.spring_kpi_sem_5.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    // Приклад налаштування біна з областю видимості "prototype"
    @Bean
    @Scope("prototype")
    public Object prototypeBean() {
        // створення і повернення нового екземпляру об'єкта
        return new Object();
    }

    // Інші методи бінів або налаштування можуть бути додані тут
}
