/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2017-04-25 15:33:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/home/impe/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1493117900000L));
    _jspx_dependants.put("jar:file:/home/impe/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384368462000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Log Generator with minimal API for configuration</title>\n");
      out.write("\t<link rel='stylesheet' href='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("' type='text/css' media='all' /> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h2>LogGen Api: generate a few logs at random</h2>\n");
      out.write("\t<p>Clearly there is no instruction as we want you to have some fun. At least for now :)</p>\n");
      out.write("\t<h3>Instructions:</h3>\n");
      out.write("\t<p>The API exposes 2 services avilable at <a href=\"/loggen/config\">/loggen/config</a></p>\n");
      out.write("\t<p>GET: Returns the current configuration</p>\n");
      out.write("\t<p>POST updates the configuration and (re)starts the timer e.g. '{\"logGens\":[{\"logbody\":\"Hello World!\",\"severity\":\"INFO\",\"delay\":0,\"period\":3000},{\"logbody\":\"Waning World!\",\"severity\":\"WARN\",\"delay\":0,\"period\":1000},{\"logbody\":\"Error World!\\\\n\\\\tMultiline ..\",\"severity\":\"ERROR\",\"delay\":0,\"period\":12345}]}'</p>\n");
      out.write("\t<p></p>\n");
      out.write("\t<p>A Swagger UI is avaliable under <a href=\"/loggen/swagger-ui.html\">/loggen/swagger-ui.html</a></p>\n");
      out.write("\t<p></p>\n");
      out.write("\t<p></p>\n");
      out.write("\t\n");
      out.write("\t<h3>Example:</h3>\n");
      out.write("\t<p>curl -i \\ <br/>\n");
      out.write("    -H \"Accept: application/json\" \\ <br/>\n");
      out.write("\t -H \"Content-Type: application/json\" \\ <br/>\n");
      out.write("    -H \"X-HTTP-Method-Override: PUT\" \\ <br/>\n");
      out.write("    -X POST -d '{\"logGens\":[{\"logbody\":\"Hello World!\",\"severity\":\"INFO\",\"delay\":0,\"period\":3000},{\"logbody\":\"Waning World!\",\"severity\":\"WARN\",\"delay\":0,\"period\":1000},{\"logbody\":\"Error World!\\n\\tMultiline ..\",\"severity\":\"ERROR\",\"delay\":0,\"period\":12345}]}' \\ <br />\n");
      out.write("    http://localhost:8080/loggen/config<br/>\n");
      out.write("    </p>\n");
      out.write("\t<p></p>\n");
      out.write("\t<p></p>\n");
      out.write("\t<p></p>\n");
      out.write("\t<h3>In Progress:</h3>\n");
      out.write("\t<p>DELETE: Stops the timer and no logs are generated</p>\n");
      out.write("\t<p></p>\n");
      out.write("\t<p></p>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/jsp/index.jsp(6,30) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/css/style.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
