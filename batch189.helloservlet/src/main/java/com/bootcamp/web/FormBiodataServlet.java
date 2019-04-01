package com.bootcamp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/simpan.awi", "/form.html"})
public class FormBiodataServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("modus", "input");
		req.getRequestDispatcher("/biodata.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nama = req.getParameter("nama");
		req.setAttribute("modus", "tampil");
		req.setAttribute("namaku", nama);
		req.getRequestDispatcher("/biodata.jsp").forward(req, resp);
	}

}
