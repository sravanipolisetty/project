package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleDoGetExample
 */
@WebServlet("/SimpleDoGetExample")
public class SimpleDoGetExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("Am from init method .....");
		super.init();
	}
	
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("Service method ... ");
		super.service(arg0, arg1);
	}
	
	
	@Override
	public void destroy() {
		System.out.println("Destroy");
		super.destroy();
	}
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleDoGetExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(" From Do get Method Hello World!");
		
		/***
		 * 
		 * ServletConfig demo*/
		 
		ServletConfig config = getServletConfig();
		String tempString = config.getInitParameter("Avi");
		String tempString1 = config.getInitParameter("Sai");
		out.println(" <br>Avinash from ServletConfig  : " +tempString +" Chandu " + tempString1); 
		 
		/***
		 * 
		 * ServletContext demo
		 */
		  //How to get the Servletcontext object
        ServletContext ctx = getServletContext();
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaa : ");
        String s1=ctx.getInitParameter("n1");
        String s2=ctx.getInitParameter("n2");
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB : ");
        out.println("<br> n1 value is " +s1+ " and n2 is " +s2);
        
        String s3 = ctx.getInitParameter("avinash");
        String s4 = ctx.getInitParameter("chandu");
        
        
        out.println("Avinash value is " +s3+ " and chandu is " +s4);
    
        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
