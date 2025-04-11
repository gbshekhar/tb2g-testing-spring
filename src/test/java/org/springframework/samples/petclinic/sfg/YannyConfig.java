package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("base-test")
@Configuration
public class YannyConfig {
    @Bean
    YannyWordProducer yannyWordProducer(){
        return  new YannyWordProducer();
    }
}
