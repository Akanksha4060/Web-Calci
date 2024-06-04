package MyPackage;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//joke part
	private String[] jokes= {
			"Why do java developer wear glasses? because they don't C sharp !",
			"I told my computer i need a break ,and now it won't stop to send me kit-kat bars .",
			"Why developer dosen't like nature? because it has too many bugs .",
			"How many programer does it change to light bulb? none it's a hardware problem",
	};

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//to get parameter
		String str1=request.getParameter("num1");
		String str2=request.getParameter("num2");
		response.getWriter().append(str1+" "+str2);

		String button=request.getParameter("btn1");

		//type casting
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);

// Way 1.
		int output;
		if(button.equals("1")) output=num1+num2;
		else if(button.equals("2")) output=num1-num2;
		else if(button.equals("3")) output=num1*num2;
		else output=num1/num2;

//Way 2.
//		switch(button) {
//		case "a":
//			button.equals("1");
//			response.sendRedirect("index.jsp?output=\"+(num1+num2)");
//		//	response.getWriter().append("output="+(num1+num2));
//			break;
//		case "b":
//			button.equals("2");
//			response.sendRedirect("index.jsp?output=\"+(num1-num2)");
////		response.getWriter().append("output="+(num1-num2));
//			break;
//		case "c":
//			button.equals("3");
//			response.sendRedirect("index.jsp?output=\"+(num1*num2)");
////			response.getWriter().append("output="+(num1*num2));
//			break;
//		default:
//			response.sendRedirect("index.jsp?output=\"+(num1/num2)");
////			response.getWriter().append("output="+(num1/num2));
//
//		}


//to generate random jokes
		// Create an instance of Random clas
		Random random = new Random();
        // Generate a random index within the range of the array's length
        int randomIndex = random.nextInt(jokes.length);
        // Access the string at the random index
        String randomString = jokes[randomIndex];


		//to redirect request to jsp page
		response.sendRedirect("index.jsp?output="+output+"&joke="+randomString);



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
