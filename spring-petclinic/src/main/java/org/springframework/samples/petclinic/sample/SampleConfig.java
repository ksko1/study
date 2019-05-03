package org.springframework.samples.petclinic.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    @Bean
    public SampleController sampleController() {
        return new SampleController();  // return 값으로 생성되는 SampleController 가 bean 으로 등록이 된다.
    }

}
