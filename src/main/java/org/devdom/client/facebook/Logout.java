package org.devdom.client.facebook;

import java.io.IOException;
import java.io.Serializable;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Vásquez Polanco
 */
public class Logout extends HttpServlet implements Serializable{

    private static final long serialVersionUID = 6580988700239155391L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getSession().invalidate();
        response.sendRedirect("index.xhtml");
    }
}
