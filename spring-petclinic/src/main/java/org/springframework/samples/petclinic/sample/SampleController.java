package org.springframework.samples.petclinic.sample;

public class SampleController {

    SampleRepository sampleRepository;
    // 위 만들고, alt+enter 눌러서 repository 만들어준다.
    // 생성자 만들때 alt+insert (IntelliJ generate 단축키)
    public SampleController(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public  void doSomething() {
        sampleRepository.save(); //save 위에두고 alt+enter
    }
}
