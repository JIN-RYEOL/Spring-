/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.85
 * Generated at: 2023-02-02 05:42:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.sign_005fview;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("function kakaoLogin(){\r\n");
      out.write("	location.href='");
      out.print(request.getAttribute("kakaoLoginUrl"));
      out.write("'\r\n");
      out.write("}\r\n");
      out.write("function googleLogin(){\r\n");
      out.write("	location.href='");
      out.print(request.getAttribute("googleLoginUrl"));
      out.write("'\r\n");
      out.write("}\r\n");
      out.write("function naverLogin(){\r\n");
      out.write("	location.href='");
      out.print(request.getAttribute("naverLoginUrl"));
      out.write("'\r\n");
      out.write("}\r\n");
      out.write("function facebookLogin(){\r\n");
      out.write("	location.href='");
      out.print(request.getAttribute("faceLoginUrl"));
      out.write("'\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("	.button{\r\n");
      out.write("	color: black;\r\n");
      out.write("	}\r\n");
      out.write("	.body{\r\n");
      out.write("	text-align:center;\r\n");
      out.write("	}\r\n");
      out.write("	.find_up{\r\n");
      out.write("		padding: 30px;\r\n");
      out.write("	}\r\n");
      out.write("	.line_border{\r\n");
      out.write("		width: 300px;\r\n");
      out.write("		border: 1px solid #dae1e6;\r\n");
      out.write("		margin: 10px auto;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("<body class=\"body\" bgcolor=\"\">\r\n");
      out.write("<!-- top bar  -->\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script><script src=\"resources/JSs/bar_js/get_top_bar.js\"></script><div id=\"top_bar\" ></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"context_main\" style=\"margin: auto; width: 600px;\" >\r\n");
      out.write("\r\n");
      out.write("	<div style=\"width:550px; margin: 30px auto; padding:60px 10px;border: 1px solid #dae1e6;\">	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<form action=\"sign_in.do\">\r\n");
      out.write("    <input type=\"text\" name=\"id\" placeholder=\"ID\" style=\"width:300px;height:30px;font-size:30px; font-family:Comic Sans MS;margin-bottom: 10px;\">\r\n");
      out.write("    <br>\r\n");
      out.write("    <input type=\"password\" name=\"password\" placeholder=\"password\" style=\"width:300px;;height:30px;font-size:30px;font-family:Comic Sans MS;margin-bottom: 10px;\">\r\n");
      out.write("\r\n");
      out.write("    <input type=\"submit\" class=\"button\"  value=\"로그인\" style=\"width:300px; font-size:25px;font-family:Comic Sans MS; \"><br>\r\n");
      out.write("</form> \r\n");
      out.write("\r\n");
      out.write("   	<div class=\"find_up\">\r\n");
      out.write("    <a href='find_id' style =\" text-decoration:none;color: blue; font-family:Comic Sans MS;\">ID,PW찾기 </a>\r\n");
      out.write("    |\r\n");
      out.write("    <a href=\"sign_agree\" style =\" text-decoration:none;color: blue; font-family:Comic Sans MS;\">회원가입 </a>\r\n");
      out.write(" 	</div>\r\n");
      out.write(" 	\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"line_border\"></div>\r\n");
      out.write("    <img  src=\"resources/imgs/login_img/kakao.png\" width=\"400\" height=\"80\" onclick=\"kakaoLogin()\"><br>\r\n");
      out.write("	<img  src=\"resources/imgs/login_img/google.png\" width=\"400\" height=\"80\" onclick=\"googleLogin()\"><br>\r\n");
      out.write("	<img  src=\"resources/imgs/login_img/naver.png\" width=\"400\" height=\"80\" onclick=\"naverLogin()\"><br>\r\n");
      out.write("	<img  src=\"resources/imgs/login_img/facebook.png\" width=\"400\" height=\"80\" onclick=\"facebookLogin()\">\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
