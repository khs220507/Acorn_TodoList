/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-09-19 05:58:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<style>\r\n");
      out.write(".total {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	border-top: 6px solid #0078d4;\r\n");
      out.write("	margin-top: -8px;\r\n");
      out.write("	/* border: 1px solid black; */\r\n");
      out.write("	font-family: \"돋움\", Dotum, \"맑은 고딕\", \"Malgun Gothic\", \"Apple Gothic\",\r\n");
      out.write("		sans-serif;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".image-logo {\r\n");
      out.write("	width: 97px;\r\n");
      out.write("	height: 79px;\r\n");
      out.write("	margin-top: 115px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	height: 500px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".MTD p {\r\n");
      out.write("	font-weight: 900;\r\n");
      out.write("	font-size: 35px;\r\n");
      out.write("	margin-top: -100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".MTD span {\r\n");
      out.write("	font-weight: 700;\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".image-left {\r\n");
      out.write("	width: 272px;\r\n");
      out.write("	height: 460px;\r\n");
      out.write("	padding-right: 40px;\r\n");
      out.write("	margin-left: -46px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".image-right {\r\n");
      out.write("	width: 210px;\r\n");
      out.write("	height: 460px;\r\n");
      out.write("	padding-left: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".startBut {\r\n");
      out.write("	background-color: #0078d4;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border: 0px;\r\n");
      out.write("	width: 123px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	font-size: 22px;\r\n");
      out.write("	margin-top: 50px;\r\n");
      out.write("	border-radius: 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".startBut:hover {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	background: #106ebe;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"total\">\r\n");
      out.write("		<div class=\"checkimg\">\r\n");
      out.write("			<img\r\n");
      out.write("				src=\"https://to-do-cdn.microsoft.com/static-assets/c87265a87f887380a04cf21925a56539b29364b51ae53e089c3ee2b2180148c6/icons/logo.png\"\r\n");
      out.write("				class=\"image-logo\" alt=\"\" />\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"main\">\r\n");
      out.write("			<img\r\n");
      out.write("				src=\"https://to-do-cdn.microsoft.com/static-assets/c26cd0d92ec61ba2c661adefaa535ab3cc4fb124f347a850fded8034dad5d360/icons/welcome-left.png\"\r\n");
      out.write("				class=\"image-left\" alt=\"\" />\r\n");
      out.write("			<div class=\"MTD\">\r\n");
      out.write("				<p>Microsoft To Do</p>\r\n");
      out.write("				<span>To Do을(를) 통해 직장 생활과 여가 생활<br />에 모두 집중할 수 있습니다.\r\n");
      out.write("				</span> <br />\r\n");
      out.write("				<form name=\"frm\" action=\"login.do\r\n");
      out.write("\" method=\"get\"\r\n");
      out.write("					onsubmit=\"return check()\">\r\n");
      out.write("					<button class=\"startBut\">Start</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<img\r\n");
      out.write("				src=\"https://to-do-cdn.microsoft.com/static-assets/f2f56b7d4c72910540effed9ccddae703d8d09b94075dddfeeab6cd79def0c60/icons/welcome-right.png\"\r\n");
      out.write("				class=\"image-right\" alt=\"\" />\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
