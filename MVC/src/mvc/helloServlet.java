package mvc;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servlet.page")
public class helloServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String msg = "MVC pattern2 "; 
		req.setAttribute("m", msg);
		
		 RequestDispatcher rd = req.getRequestDispatcher( "hello.jsp" );
		 rd.forward(req,resp);
	}

}

