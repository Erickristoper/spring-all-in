package aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import model.Category;
import services.CategoryService;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(CategoryService.class.getName());


   // @Around("execution(* services.*.*(..))")
    // public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
    //     String methodName = joinPoint.getSignature().getName();
    //     Object[] arg = joinPoint.getArgs();
    //     logger.info("method " + methodName + " with params " + Arrays.asList(arg) + " will execute. ");

    //     Category grapplingCategory = new Category(
    //         2L, 
    //         "Grappling", 
    //         "Techniques involving wrestling, submission holds, and joint locks."
    //     );
    //     Object returnValue = joinPoint.proceed(new Object[] {grapplingCategory});
    //     logger.info("Method executed and returned " + returnValue);


    //     return "FAILED";
    // }

    @Around("@annotation(ToLog)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("START DELETING");
        joinPoint.proceed();
        logger.info("END DELETE");
    }
}
