/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.web.controller;

import com.mycompany.interfaces.MediaAritmetica;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@WebServlet(name = "CalcularMedia", urlPatterns = {"/media"})
public class CalcularMedia extends HttpServlet {

    @EJB
    private MediaAritmetica media;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        float nota1 = Float.parseFloat(req.getParameter("nota1"));
        float nota2 = Float.parseFloat(req.getParameter("nota2"));
        float nota3 = Float.parseFloat(req.getParameter("nota3"));
        
        float m = media.calculaMedia(nota1, nota2, nota3);
        
        req.setAttribute("media", m);
        
        req.getRequestDispatcher("media.jsp").forward(req, resp);
    }

    
}
