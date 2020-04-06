package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String imie = request.getParameter("imie");
        request.setAttribute("imie", imie);
        String nazwisko = request.getParameter("nazwisko");
        request.setAttribute("nazwisko", nazwisko);
        String email = request.getParameter("email");
        request.setAttribute("email", email);
        
        Person osoba = new Person(imie, nazwisko, email);
        request.setAttribute("osoba", osoba);
        
        request.getRequestDispatcher("hello.jsp").forward(request, response);
    }
}