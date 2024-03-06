package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Interest;

/**
 * Servlet implementation class getInterestServlet
 */
@WebServlet("/getInterestServlet")
public class getInterestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getInterestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userExercise = request.getParameter("userExercise");

		Interest userTime = new Interest(Integer.parseInt(userExercise));
		
		request.setAttribute("userTimePouch", userTime);
		getServletContext().getRequestDispatcher("/interestresult.jsp").forward(request,response);
		
		PrintWriter writer = response.getWriter();
		writer.println(userTime.toString());
		writer.close();
	}

}
