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
		
		 SAXReader reader = new SAXReader();
		  File file = new File("books.xml");
		  Document document = reader.read(file);
		  Element root = document.getRootElement();
		  List<Element> childElements = root.elements();
		  for (Element child : childElements) {
		   //δ֪�����������
		   /*List<Attribute> attributeList = child.attributes();
		   for (Attribute attr : attributeList) {
		    System.out.println(attr.getName() + ": " + attr.getValue());
		   }*/

		   //��֪�����������
		   System.out.println("id: " + child.attributeValue("id"));

		   //δ֪��Ԫ���������
		   /*List<Element> elementList = child.elements();
		   for (Element ele : elementList) {
		    System.out.println(ele.getName() + ": " + ele.getText());
		   }
		   System.out.println();*/

		   //��֪��Ԫ�����������
		   System.out.println("title" + child.elementText("title"));
		   System.out.println("author" + child.elementText("author"));
		   //������Ϊ�˸�ʽ�����۶�����
		   System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
