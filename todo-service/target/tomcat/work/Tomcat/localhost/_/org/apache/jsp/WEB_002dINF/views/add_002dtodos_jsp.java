/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-28 08:35:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dtodos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/../common/navigation.jspf", Long.valueOf(1530174944693L));
    _jspx_dependants.put("/WEB-INF/views/../common/header.jspf", Long.valueOf(1530173278860L));
    _jspx_dependants.put("/WEB-INF/views/../common/footer.jspf", Long.valueOf(1530012882565L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Todos</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\t.footer {\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tbottom: 0;\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\theight: 60px;\r\n");
      out.write("\t\tbackground-color: #f5f5f5;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-info navbar-dark fixed-top\">\r\n");
      out.write("  <a href=\"/\" class=\"navbar-brand\"> Ekomera-TodoService </a>\r\n");
      out.write("  <ul class=\"navbar-nav\">\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" href=\"/login.do\">Home</a>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("      <a class=\"nav-link\" href=\"/list-todo.do\">Todos</a>\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("  </ul>\r\n");
      out.write("  <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t<li><a class=\"nav-link\" href=\"/logout.do\">Logout</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<br>\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<H1>Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</H1>\r\n");
      out.write("\t<p>Add New Todo</p>\r\n");
      out.write("\t<form method=\"post\" action=\"/add-todo.do\">\r\n");
      out.write("\t\t<fieldset class=\"form-group\">\r\n");
      out.write("\t\t\t<label> Description: </label><input type=\"text\" name=\"todo\" \r\n");
      out.write("\t\t\t\tclass=\"form-control\" />\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<fieldset class=\"form-group\">\r\n");
      out.write("\t\t\t<label> Category: </label><input type=\"text\" name=\"categ\"\r\n");
      out.write("\t\t\t\tclass=\"form-control\" />\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"Add\" class=\"btn btn-success\" /> &nbsp;\r\n");
      out.write("\t\t <a class=\"btn btn-default\" href=\"/list-todo.do\">Back</a>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer class=\"footer\" >\r\n");
      out.write("\t\t<div>footer content</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
