package aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import services.CategoryService;


@Aspect
@Order(2)
public class LoggingAspect {

    private Logger logger = Logger.getLogger(CategoryService.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Logging Aspect: Calling the intercepted method");
        Object returnedValue = joinPoint.proceed();
        logger.info("Logging Aspect: Method executed and returned " + returnedValue);

        return returnedValue;
    }
}
