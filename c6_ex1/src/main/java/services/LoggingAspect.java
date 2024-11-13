package services;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(CategoryService.class.getName());


    @Around("execution(* services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] arg = joinPoint.getArgs();
        logger.info("method " + methodName + " with params " + Arrays.asList(arg) + " will execute. ");

        try {
            Object returnValue = joinPoint.proceed();
            logger.info("Method executed and retured " + returnValue);
        } catch (Throwable e) {}
    }
}
