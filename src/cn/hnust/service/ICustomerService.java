package cn.hnust.service;

import java.util.List;

import cn.hnust.domain.Customer;

/**
 * 客户的业务层接口
 * @author lw
 *
 */
public interface ICustomerService {

	List<Customer> findAllCustomer();
	
	void saveCustomer(Customer customer);
}
