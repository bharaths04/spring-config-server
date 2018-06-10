package com.bharath;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class client {

	public static void main(String[] args) {
		StudentIntern s = new StudentIntern();
		s.setId(123);
		s.setSname("bharath");
		 Resource resource = new ClassPathResource("employee.xml");
		 BeanFactory bf = new XmlBeanFactory(resource);
		 employee e1 = (employee)bf.getBean("emp");
		 e1.show();
	}

}
