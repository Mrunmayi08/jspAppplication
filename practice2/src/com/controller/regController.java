package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Register;
import com.Dao.RegisterDao;
/**
 * Servlet implementation class regController
 */
@WebServlet("/regController")
public class regController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int reg_no =Integer.parseInt(request.getParameter("reg_no"));
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String username=request.getParameter("username");
		String pass=request.getParameter("pass");
		
		
		Register r=new Register();
		r.setReg_no(reg_no);
		
		r.setFirstName(firstName);
		r.setLastName(lastName);
		r.setUserName(username);
		r.setPass(pass);
		
		RegisterDao rd=new RegisterDao();
		List<Register> lst=new ArrayList<Register>();
		lst.add(r);
		
		int i=rd.saveData(lst);
		if(i>0){
			response.sendRedirect("login.html");
		}
		
		
		
		
	}

}
