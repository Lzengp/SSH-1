package cn.hnust.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hnust.domain.Customer;
import cn.hnust.service.ICustomerService;

/**
 * spring和hibernate整合测试
 * @author lw
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:bean.xml"})
public class Test03SpringHibernate {

	
	@Autowired//自动注入
	private ICustomerService cs;


	@Test
	public void testSave() {
		Customer c = new Customer();
		c.setCustName("Spring H123");
		cs.saveCustomer(c);
		
	}
	
	@Test
	public void testFindAll() {
		List<Customer> list = cs.findAllCustomer();
		for(Object o :list) {
				System.out.println(o);
		}
		
	}
}
