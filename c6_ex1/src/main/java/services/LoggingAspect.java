package services;

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
        logger.info("Method is about to execute...");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {}
        logger.info("Method execute");
    }
}
