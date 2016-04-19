package springWebApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
			HelloWorld w = (HelloWorld)ctx.getBean("HelloWorld");
			w.Hello();
	}

}
