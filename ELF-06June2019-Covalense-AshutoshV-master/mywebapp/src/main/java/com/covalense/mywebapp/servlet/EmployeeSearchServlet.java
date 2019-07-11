package com.covalense.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/search")
public class EmployeeSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idValue = req.getParameter("id");

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);

		PrintWriter out = resp.getWriter();
		if (bean == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style =\"color : red\"> Employee not Found!!!</span></H1>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style =\"color : red\"> Employee  Found!!! </span></H1>");
			out.print("<BR>");
			out.print("<BR> Name ===> " + bean.getName());
			out.print("<BR> Id ===>" + bean.getId());
			out.print("<BR>  Age ===>" + bean.getAge());
			out.print("<BR>  GENDER ===>" + bean.getGender());
			out.print("<BR> SALARY ===>" + bean.getSalary());
			out.print("<BR> PHONE ===>" + bean.getPhone());
			out.print("<BR> JOINING_DATE ===>" + bean.getJoiningDate());
			out.print("<BR> ACCOUNT_NUMBER ===>" + bean.getAccountNumber());
			out.print("<BR> EMAIL ===>" + bean.getEmail());
			out.print("<BR> DESIGNATION ===>" + bean.getDesignation());
			out.print("<BR> DOB ===>" + bean.getDob());
			out.print("<BR> DEPT_ID ===>" + bean.getDepartmentId());
			out.print("<BR> MNGR_ID ===>" + bean.getManagerId());
			out.print("</BODY>");
			out.print("</HTML>");
		}
	}

}
