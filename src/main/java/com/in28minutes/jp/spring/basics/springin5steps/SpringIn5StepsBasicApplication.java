package com.in28minutes.jp.spring.basics.springin5steps;

import com.in28minutes.jp.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		/* Old - Before using Spring
			BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		*/
		/* Old2 - springframework.boot (in dependency) and @SpringBootApplication (above class)
			SpringApplication applicationContext = new SpringApplication.run(SpringIn5StepsBasicApplication.class, args);;
		 */
		// Application Context
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("binarySearch " + binarySearch);
		System.out.println("binarySearch1 " + binarySearch1);

		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		applicationContext.close();
		//com.in28minutes.jp.spring.basics.springin5steps.basic.BubbleSortAlgorithm@51549490
		//3
	}

}
