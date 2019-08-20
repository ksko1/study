package org.springframework.samples.petclinic.owner;

    import org.aspectj.lang.ProceedingJoinPoint;
    import org.aspectj.lang.annotation.Around;
    import org.aspectj.lang.annotation.Aspect;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import org.springframework.stereotype.Component;
    import org.springframework.util.StopWatch;

@Component // 빈 등록
@Aspect // aspect 명시
public class LogAspect {
    Logger logger = LoggerFactory.getLogger(LogAspect.class); // slf4j logger 삽입

    // LogExecutionTime 이라는 어노테이션 주변에 해당 Aspect를 적용하겠다!
    // 이 내부는 프록시 패턴으로 동작함.
    @Around("@annotation(LogExecutionTime)") // @Around 를 사용한 메서드 안에서는 joinPoint 파라미터를 받을 수 있음
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable { // joinpoint : 어노테이션이 붙어있는 타겟 메서드
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object proceed = joinPoint.proceed();

        stopWatch.stop();
        logger.info(stopWatch.prettyPrint());

        return proceed; // 결과값 리턴
    }
}
