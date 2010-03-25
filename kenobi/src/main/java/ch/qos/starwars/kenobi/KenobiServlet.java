package ch.qos.starwars.kenobi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KenobiServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    logger.debug("in doGet()");
    
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    out.println("<HTML><HEAD><TITLE>Hello</TITLE>" + "</HEAD><BODY>");
    out.println("<h2>Hello from "+this.getClass().getSimpleName()+"</h2>");
    out.println("</BODY></HTML>");
    out.close();
  }

}
