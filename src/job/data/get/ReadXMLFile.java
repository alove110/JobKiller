package job.data.get;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadXMLFile {
	
	public List<String> getUrl()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("URL_List.xml");   
		HelloBean helloBean = (HelloBean)context.getBean("helloBean");   
		System.out.println(helloBean.getHelloWorld()); 
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
