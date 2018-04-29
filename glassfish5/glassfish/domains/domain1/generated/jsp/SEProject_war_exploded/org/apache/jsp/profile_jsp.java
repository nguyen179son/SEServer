package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Profile</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"stylesheets/css/profile.css\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.9.1.min.js\"></script>\n");
      out.write("    <script src=\"stylesheets/js/profile.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");

    if (session.getAttribute("user_name") == null) {
        session.setAttribute("returnUrl", request.getAttribute("currentUrl"));
        response.sendRedirect("/SEProject_war_exploded/home");
    }

      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div clas=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <img src=\"image/HomepageIcon.jpg\" class=\"img-responsive logo\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <p class=\"navbar-text text\" style=\"color:black;\"> Chat Application </p>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<input type=\"text\" hidden id=\"id\" value=");
      out.print(request.getAttribute("id"));
      out.write(">\n");
      out.write("<img src=\"image/profile.png\" class=\"center img-responsive\" alt=\"profilepic\" id=\"profile\">\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-4\"></div>\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("        <label class=\"control-label\">Nick Name: </label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("        <label class=\"view-label\" id=\"nick-name\"> </label>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-4\"></div>\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("        <label class=\"control-label\">Email: </label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("        <label class=\"view-label\" id=\"email\"> </label>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-4\"></div>\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("        <label class=\"control-label\">Phone Number: </label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("        <label class=\"view-label\" id=\"phone\"> </label>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-4\"></div>\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("        <label class=\"control-label\">Date of Birth: </label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("        <label class=\"view-label\" id=\"dob\"> </label>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
