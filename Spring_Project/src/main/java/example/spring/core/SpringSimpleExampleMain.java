package example.spring.core;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		ApplicationContext context;
		String configPath="./src/main/resources/spring-config.xml";
		context=new FileSystemXmlApplicationContext(configPath);
		Object loadedObject=context.getBean("greet");
		GreetingService gs=(GreetingService)loadedObject;
		String reply=gs.sayGreeting();
		System.out.println(reply);
		
		

	}

}
