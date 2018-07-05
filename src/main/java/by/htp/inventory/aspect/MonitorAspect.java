package by.htp.inventory.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import by.htp.inventory.domain.Monitor;

@Aspect
@Component
public class MonitorAspect {
	@Before("execution(* by.htp.inventory.service.impl.EquipmentServiceImpl.monitorAll())")
	public void doSmth() {
		System.out.println("----------------------------------");
		System.out.println("Service method minitorAll() service IMPL");
		System.out.println("----------------------------------");
	}

	@AfterReturning(pointcut="execution(* by.htp.inventory.service.impl.EquipmentServiceImpl.getMonitor(..))", returning="retVal")
    public void logAfterReturningGetEmployee(Object retVal) throws Throwable
    {
        System.out.println(((Monitor)retVal).getId());
    }
	
	@AfterThrowing(pointcut="execution(* by.htp.inventory.controller.ExeptionRest.exception())", throwing="ex")
		  public void doRecoveryActions(Exception ex) {
		    System.out.println("Возникла ошибка: " + ex.toString());
		  }

}
