package aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import model.Category;
import services.CategoryService;


@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(CategoryService.class.getName());


    @AfterReturning(value = "@annotation(ToLog)", returning= "returnedValue")
    public void updateLog(Object returnedValue) throws Throwable{
        logger.info("START UPDATING");
        logger.info("This is called after the executiion " + returnedValue);
        logger.info("END UPDATE");
    }

    @AfterThrowing(value= "@annotation(ToLog)", throwing = "throwedValue")
    public String modifyErrLog(Object throwedValue) throws Throwable {
        logger.info("Thid is called after failed modification " + throwedValue);
        logger.severe("MODFICATION ERROR");
        return "YESSSS";
    }
}
