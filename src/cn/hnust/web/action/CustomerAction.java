package cn.hnust.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.hnust.domain.Customer;
import cn.hnust.service.ICustomerService;

/**
 * 客户动作类
 * @author lw
 *
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private Customer customer = new Customer();
	private List<Customer> customers;
	private ICustomerService customerService;
	
	//setters和getters方法
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	
	public Customer getModel() {
		return customer;
	}
	
	
	/**
	 * 查询所有客户
	 * @return
	 */
	public String findAllCustomer() {
		//调用业务层查询客户列表
		customers = customerService.findAllCustomer();
		ServletActionContext.getRequest().setAttribute("customers",customers);
		System.out.println(customers);
		return "findAllCustomer";
	}
	
	/**
	 * 获取添加客户页面
	 * @return
	 */
	public String addUICustomer() {
		return "addUICustomer";
	}



}
