/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-02-23 15:54:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\"/>\n");
      out.write("<title>java</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/style.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"n-head\">\n");
      out.write("    <div class=\"g-doc f-cb\">\n");
      out.write("        <div class=\"user\">\n");
      out.write("            卖家你好，<span class=\"name\">mmmmm</span>！<a href=\"\">[退出]</a>\n");
      out.write("            请<a href=\"login.html\">[登录]</a>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("            <li><a href=\"index.html\">首页</a></li>\n");
      out.write("            <li><a href=\"account.html\">账务</a></li>\n");
      out.write("            <li><a href=\"public.html\">发布</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"g-doc\">\n");
      out.write("    <div class=\"m-tab m-tab-fw m-tab-simple f-cb\">\n");
      out.write("        <h2>内容编辑</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"n-public\">\n");
      out.write("        <form class=\"m-form m-form-ht\" id=\"form\" method=\"post\" action=\"editSubmit.html\" onsubmit=\"return false;\" autocomplete=\"off\">\n");
      out.write("            <div class=\"fmitem\">\n");
      out.write("                <label class=\"fmlab\">标题：</label>\n");
      out.write("                <div class=\"fmipt\">\n");
      out.write("                    <input class=\"u-ipt ipt\" name=\"title\" value=\"标题\" placeholder=\"2-80字符\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fmitem\">\n");
      out.write("                <label class=\"fmlab\">摘要：</label>\n");
      out.write("                <div class=\"fmipt\">\n");
      out.write("                    <input class=\"u-ipt ipt\" name=\"summary\" value=\"摘要\" placeholder=\"2-140字符\"／>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fmitem\">\n");
      out.write("                <label class=\"fmlab\">图片：</label>\n");
      out.write("                <div class=\"fmipt\">\n");
      out.write("                    <input class=\"u-ipt ipt\" name=\"image\" value=\"http://nec.netease.com/img/s/1.jpg\" placeholder=\"图片地址\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fmitem\">\n");
      out.write("                <label class=\"fmlab\">正文：</label>\n");
      out.write("                <div class=\"fmipt\">\n");
      out.write("                    <textarea class=\"u-ipt\" name=\"detail\" rows=\"10\" placeholder=\"2-1000个字符\">全文</textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fmitem\">\n");
      out.write("                <label class=\"fmlab\">价格：</label>\n");
      out.write("                <div class=\"fmipt\">\n");
      out.write("                    <input class=\"u-ipt price\" name=\"price\" value=\"123.9\"/>元\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fmitem fmitem-nolab fmitem-btn\">\n");
      out.write("                <div class=\"fmipt\">\n");
      out.write("                    <button type=\"submit\" class=\"u-btn u-btn-primary u-btn-lg\">保 存</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <span class=\"imgpre\"><img src=\"http://nec.netease.com/img/l/1.jpg\" alt=\"\" id=\"imgpre\"></span>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"n-foot\">\n");
      out.write("    <p>版权所有：网易云课堂<a href=\"http://mooc.study.163.com/smartSpec/detail/85002.htm\">Java开发工程师(Web方向)</a>微专业团队</p>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/global.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/public.js\"></script>\n");
      out.write("</body>\n");
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
