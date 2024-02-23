package com.contato.apicontato.profiles;

import com.contato.apicontato.services.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestProfile {

    @Autowired
    private DataBaseService dataBaseService;

    @Bean
    public void instanciaDataBase() {
        this.dataBaseService.instanciaDataBase();
    }


}
