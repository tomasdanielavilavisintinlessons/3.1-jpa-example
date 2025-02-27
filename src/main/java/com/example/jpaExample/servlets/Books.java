package com.example.jpaExample.servlets;

import java.io.IOException;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.example.jpaExample.database.Db;
import com.example.jpaExample.entities.Book;

/**
 * Servlet implementation class Books
 */
@WebServlet("/books")
public class Books extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Books() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		EntityManager em = Db.getEntityManager();
		
		List<Book> books = (List<Book>) em.createNamedQuery("findAllBooks").getResultList();
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		for(Book b : books)
			response.getWriter().append("\n" + b.getId() + " " + b.getTitle());
		
		em.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
