package org.springframework.samples.petclinic.sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class SampleControllerTest {

    @Test
    public void testDoSomething() {
        // 생성자가 하나라서 피할 수 없구나? ==> 이게 뭔말이여;;;
        SampleRepository sampleRepository = new SampleRepository();
        SampleController sampleController = new SampleController(sampleRepository);
    }
}
