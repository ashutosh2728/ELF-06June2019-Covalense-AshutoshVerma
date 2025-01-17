package com.covalense.employeeapp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.employeeapp.beans.EmployeeInfoBean;
import com.covalense.employeeapp.config.HibernateConfig;

public class DeleteEmployeeInfo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);

		Session session = factory.openSession();
		EmployeeInfoBean infoBean = session.get(EmployeeInfoBean.class, 6);
		infoBean.getId();
		Transaction transaction = session.beginTransaction();
		session.delete(infoBean);
		transaction.commit();
		session.close();
	}
}
