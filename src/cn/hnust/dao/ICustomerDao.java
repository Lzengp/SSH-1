package cn.hnust.dao;

import java.util.List;

import cn.hnust.domain.Customer;

/**
 * 客户持久层接口
 * @author lw
 *
 */
public interface ICustomerDao {

	/**
	 * 查询所有客户
	 * @return
	 */
	List<Customer> findAllCustomer();

	/**
	 * 保存客户
	 * @param customer
	 */
	void saveCustomer(Customer customer);
}
