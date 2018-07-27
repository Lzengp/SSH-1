package cn.hnust.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.hnust.dao.ICustomerDao;
import cn.hnust.domain.Customer;


/**
 * 客户持久层实现类
 * @author lw
 *
 */
public class CustomerDaoImpl implements ICustomerDao {

	private HibernateTemplate  hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//查询所有客户
	public List<Customer> findAllCustomer() {

		return (List<Customer>) hibernateTemplate.find("from Customer");//HQL
	}
	//保存客户
	public void saveCustomer(Customer customer) {
		
		hibernateTemplate.save(customer);
	}

}
