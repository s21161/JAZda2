package pl.pjatk.core;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration

public class AppConfig {
    @Bean
    public MySimplePojo mySimplePojo(){
        System.out.println("Hello simplepojo");
        return new MySimplePojo("pojo", 10);

    }



    @Bean
    @ConditionalOnProperty(value="praca-domowa.property", havingValue = "true")
    public String pracadomowaBean()
    {
        return "true";
    }
}
