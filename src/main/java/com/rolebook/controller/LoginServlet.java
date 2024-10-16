package com.rolebook.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Catch;

import com.rolebook.connection.DbCon;
import com.rolebook.dao.UserDao;
import com.rolebook.model.User;

@WebServlet("/userlogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//indique qu'on va envoyer une page html
		response.setContentType("text/html; charset=UTF-8");
		
		try(PrintWriter out = response.getWriter()){
			//récupére les données du formulaire
			String email = request.getParameter("login-email");
			String password = request.getParameter("password");
		
			//out.print("This infos servlet : "+email + password)	
			// connexion à la base de données et vérification de l'utilisateur
			UserDao udao = new UserDao(DbCon.getConnection());
		User user = udao.userLogin(email, password);
		if(user !=null) {
			// Création de la session pour l'utilisateur
			HttpSession session = request.getSession();
			// On stocke l'utilisateur dans la session
			session.setAttribute("currentUser", user);
		}
			response.sendRedirect("homeUser.jsp");
	}catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}

}
}
