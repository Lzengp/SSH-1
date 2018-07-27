package cn.hnust.test;

import com.opensymphony.xwork2.ActionSupport;

public class Test04Struts extends ActionSupport {
		
	private static final long serialVersionUID = 1L;

	public String execute() {
		System.out.println("Struts已经调用此方法");
		return SUCCESS;
	}
}
