package com.contato.apicontato.profiles;

import com.contato.apicontato.services.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevProfile {

    @Autowired
    private DataBaseService dataBaseService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String dll;

    @Bean
    public boolean instanciaDataBase() {
        if(dll.equals("create-drop")) {
            this.dataBaseService.instanciaDataBase();
        }
        return false;
    }

}
