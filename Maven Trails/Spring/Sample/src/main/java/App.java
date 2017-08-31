import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App {
	public static void main(String[] args) {
		ClassPathResource xmlFile = new ClassPathResource("Spring-Module.xml");
		XmlBeanFactory xmlBean = new XmlBeanFactory(xmlFile);
		Object o = xmlBean.getBean("helloBean1");
		HelloWorld hw = (HelloWorld) o;
		hw.printHello();
	}
}