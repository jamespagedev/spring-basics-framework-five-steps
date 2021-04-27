package com.in28minutes.jp.spring.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.in28minutes.jp.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);
	public static void main(String[] args) {
		// Application Context
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		LOGGER.info("beans loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
		// [xmlJdbcConnection, xmlPersonDAO] <- 2 beans being loaded
		/* Note: use context in xml to load all beans using annotations instead of xml.
				[
					componentDAO, scopedTarget.componentJdbcConnection, componentJdbcConnection,
					springIn5StepsBasicApplication, springIn5StepsCdiApplication,
					springIn5StepsComponentScanApplication, springIn5StepsScopeApplication, binarySearchImpl,
					bubbleSortAlgorithm, quickSortAlgorithm, someCdiBusiness, someCdiDao,
					scopedTarget.jdbcConnection, jdbcConnection, personDAO,
					org.springframework.context.annotation.internalConfigurationAnnotationProcessor,
					org.springframework.context.annotation.internalAutowiredAnnotationProcessor,
					org.springframework.context.annotation.internalCommonAnnotationProcessor,
					org.springframework.context.event.internalEventListenerProcessor,
					org.springframework.context.event.internalEventListenerFactory, xmlJdbcConnection, xmlPersonDAO
				]
		*/

		XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
		LOGGER.info("{} {}", personDAO, personDAO.getXmlJdbcConnection());
		applicationContext.close();
	}

}
