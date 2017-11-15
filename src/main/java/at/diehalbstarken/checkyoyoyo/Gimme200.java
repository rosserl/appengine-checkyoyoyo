package at.diehalbstarken.checkyoyoyo;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "Gimme200",
    urlPatterns = {"/gimme200"}
)
public class Gimme200 extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");
    response.setStatus(200);
    response.getWriter().print("Hello 200!\r\n");

  }
}