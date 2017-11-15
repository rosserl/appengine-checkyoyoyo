package at.diehalbstarken.checkyoyoyo;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "Gimme503",
    urlPatterns = {"/gimme503"}
)
public class Gimme503 extends HttpServlet {

@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");
    response.setStatus(503);
    response.getWriter().print("Hello 503!\r\n");

  }
}