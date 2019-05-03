package org.springframework.samples.petclinic.sample;

import javassist.tools.rmi.Sample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleControllerTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testDI(){
        SampleController bean = applicationContext.getBean(SampleController.class);
        assertThat(bean).isNotNull();
    }
    /*@Test
    public void testDoSomething() {
        // 생성자가 하나라서 피할 수 없구나? ==> 이게 뭔말이여;;;
        SampleRepository sampleRepository = new SampleRepository();
        SampleController sampleController = new SampleController(sampleRepository);
    }*/
}
