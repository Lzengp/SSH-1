package cn.hnust.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hnust.service.ICustomerService;

/**
 * 测试spring的ioc环境是否可以
 * @author lw
 *
 */
public class Test01Spring {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		ICustomerService cs = (ICustomerService) ac.getBean("customerService");
		cs.findAllCustomer();
	}
}
