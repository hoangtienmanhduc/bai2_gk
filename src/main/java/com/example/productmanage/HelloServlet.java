package com.example.productmanage;

import com.example.productmanage.entity.Manufacturer;
import com.example.productmanage.service.ManufacturerService;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

    public void init() {
        message = "Hello World!";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
//        ManufacturerService manufacturerService = new ManufacturerService();

//        Manufacturer manufacturer1 = new Manufacturer("Vinamilk","Vinamilk","vinamilkvn@gmail.com","02002032102","vinamilk.com.vn");
//        Manufacturer manufacturer2 = new Manufacturer("SunHouse1","SunHouse","sunhouse@gmail.com","02002032009","sunhouse.com.vn");
//        manufacturerService.save(manufacturer1);
//        manufacturerService.save(manufacturer2); //ManufacturerService manufacturerService = new ManufacturerService();

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}