package ServletPrueba;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPureba
 */
@WebServlet("/ServletPureba")
public class ServletPureba extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPureba() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String nombre = request.getParameter("Nombre");
		StringBuilder sb = new StringBuilder();
		
		
		sb.append("<html><head><title>").append("Muestra mensaje").append("</title></head>").append("<body><h1>Mensaje></h1>")
				.append("<p>Nombre:").append(nombre).append("</p>");
	//	.append("<p>Cliente Apellido:").append(apellido).append("</p>")
		//.append("<table>")
	//	.append("<tr><td>Subtotal:</td><td>").append(dSubtotal).append("</td></tr>")
	//	.append("<tr><td>MontoIva:</td><td>").append(montoIva).append("</td></tr>")
	//	.append("<tr><td>Total:</td><td>").append(total).append("</td></tr>")
	//	.append("</table></body><html>");
		
		
		response.getOutputStream().print(sb.toString());
		response.getOutputStream().flush();
		
		doGet(request, response);
	}

}
