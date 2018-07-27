package cn.hnust.service.impl;

import java.util.List;

import cn.hnust.dao.ICustomerDao;
import cn.hnust.domain.Customer;
import cn.hnust.service.ICustomerService;

/**
 * 客户业务层实现类
 * @author lw
 *
 */
public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao customerDao;
	//创建一个set方法，等待SpringIoC注入
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public List<Customer> findAllCustomer() {
		
		return customerDao.findAllCustomer();
	}

	public void saveCustomer(Customer customer) {
			customerDao.saveCustomer(customer);

	}

}
