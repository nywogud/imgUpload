/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-05-22 12:48:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home5_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.3.RELEASE.jar", Long.valueOf(1621314311918L));
    _jspx_dependants.put("jar:file:/D:/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/fileUploadEx/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1621312266169L));
    _jspx_dependants.put("jar:file:/D:/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/fileUploadEx/WEB-INF/lib/spring-webmvc-4.3.3.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1474264370000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<title>imageView</title>\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.11.2.min.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<!-- <script type=\"text/javascript\">\n");
      out.write("					$(document).ready(function () {\n");
      out.write("						$(\"#sort3\").click(function () {\n");
      out.write("							ajaxSort3();\n");
      out.write("						});\n");
      out.write("					});\n");
      out.write("\n");
      out.write("				</script>\n");
      out.write("\n");
      out.write("				<script type=\"text/javascript\">\n");
      out.write("					$(document).ready(function () {\n");
      out.write("						$(\"#sort4\").click(function () {\n");
      out.write("							ajaxSort4();\n");
      out.write("						});\n");
      out.write("					});\n");
      out.write("\n");
      out.write("				</script>\n");
      out.write("\n");
      out.write("				<script type=\"text/javascript\">\n");
      out.write("					$(document).ready(function () {\n");
      out.write("						$(\"#sort5\").click(function () {\n");
      out.write("							ajaxSort5();\n");
      out.write("						});\n");
      out.write("					});\n");
      out.write("\n");
      out.write("				</script> -->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	if ('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("') {\n");
      out.write("		var msg = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("		alert(msg);\n");
      out.write("	}\n");
      out.write("</script>\n");
      out.write("<!-- <script>\n");
      out.write("					function ajaxSort5() {\n");
      out.write("						$.ajax({\n");
      out.write("\n");
      out.write("							url: \"/ajaxSort5\",\n");
      out.write("							type: \"POST\",\n");
      out.write("							data: {\n");
      out.write("								col: \"sort5\"\n");
      out.write("							},\n");
      out.write("							success: function (result) {\n");
      out.write("\n");
      out.write("								$(\"#fileUpload\").empty();\n");
      out.write("								var form = \"<form action='/upload5' method='post' enctype='multipart/form-data'><input type='file' name='uploadFile' id='upFile' /><button style='margin-left: 330px;' type='submit'>파일업로드</button></form>\";\n");
      out.write("								$(\"#fileUpload\").append(form);\n");
      out.write("\n");
      out.write("								$(\"#imgView\").empty();\n");
      out.write("								for (i = 0; i < result.length; i++) {\n");
      out.write("									var tag = \"<img width='100' height='100' src = 'img/sort5/\" + result[i].imgTitle + \"'/>\";\n");
      out.write("\n");
      out.write("									$('#imgView').append(tag);\n");
      out.write("\n");
      out.write("								}\n");
      out.write("							},\n");
      out.write("							error: function (request, status, error) {\n");
      out.write("								alert(\"code = \" + request.status + \"message = \" + request.responseText + \"error = \" + error);\n");
      out.write("							}\n");
      out.write("						});\n");
      out.write("					}\n");
      out.write("				</script>\n");
      out.write("				<script>\n");
      out.write("					function ajaxSort4() {\n");
      out.write("						$.ajax({\n");
      out.write("\n");
      out.write("							url: \"/ajaxSort4\",\n");
      out.write("							type: \"POST\",\n");
      out.write("							data: {\n");
      out.write("								col: \"sort4\"\n");
      out.write("							},\n");
      out.write("							success: function (result) {\n");
      out.write("\n");
      out.write("								$(\"#imgView\").empty();\n");
      out.write("								for (i = 0; i < result.length; i++) {\n");
      out.write("									var tag = \"<img width='200' height='200' src = 'img/sort4/\" + result[i].imgTitle + \"'/>\";\n");
      out.write("\n");
      out.write("									$('#imgView').append(tag);\n");
      out.write("\n");
      out.write("								}\n");
      out.write("								$(\"#fileUpload\").empty();\n");
      out.write("								var form = \"<form action='/upload4' method='post' enctype='multipart/form-data'><input type='file' name='uploadFile' id='upFile' /><button style='margin-left: 330px;' type='submit'>파일업로드</button></form>\";\n");
      out.write("								$(\"#fileUpload\").append(form);\n");
      out.write("\n");
      out.write("							},\n");
      out.write("							error: function (request, status, error) {\n");
      out.write("								alert(\"code = \" + request.status + \"message = \" + request.responseText + \"error = \" + error);\n");
      out.write("							}\n");
      out.write("						});\n");
      out.write("					}\n");
      out.write("				</script>\n");
      out.write("				<script>\n");
      out.write("					function ajaxSort3() {\n");
      out.write("						$.ajax({\n");
      out.write("\n");
      out.write("							url: \"/ajaxSort3\",\n");
      out.write("							type: \"POST\",\n");
      out.write("							data: {\n");
      out.write("								col: \"sort3\"\n");
      out.write("							},\n");
      out.write("							success: function (result) {\n");
      out.write("\n");
      out.write("								$(\"#imgView\").empty();\n");
      out.write("								for (i = 0; i < result.length; i++) {\n");
      out.write("									var tag = \"<img width='300' height='300' src = 'img/sort3/\" + result[i].imgTitle + \"'/>\";\n");
      out.write("\n");
      out.write("									$('#imgView').append(tag);\n");
      out.write("\n");
      out.write("								}\n");
      out.write("								$(\"#fileUpload\").empty();\n");
      out.write("								var form = \"<form action='/upload3' method='post' enctype='multipart/form-data'><input type='file' name='uploadFile' id='upFile' /><button style='margin-left: 330px;' type='submit'>파일업로드</button></form>\";\n");
      out.write("								$(\"#fileUpload\").append(form);\n");
      out.write("\n");
      out.write("							},\n");
      out.write("							error: function (request, status, error) {\n");
      out.write("								alert(\"code = \" + request.status + \"message = \" + request.responseText + \"error = \" + error);\n");
      out.write("							}\n");
      out.write("						});\n");
      out.write("					}\n");
      out.write("				</script> -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("	<div style=\"display: inline-block\">\n");
      out.write("		<button type=\"button\" onclick=\"location.href='/sort3'\">sort3</button>\n");
      out.write("		<button type=\"button\" onclick=\"location.href='/sort4'\">sort4</button>\n");
      out.write("		<button type=\"button\" onclick=\"location.href='/sort5'\">sort5</button>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<div id=\"fileUpload\" style=\"display: inline-block\">\n");
      out.write("		<form action=\"/upload5\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("			<input type=\"file\" name=\"uploadFile\" id=\"upFile\" />\n");
      out.write("			<button style=\"margin-left: 330px;\" type=\"submit\">파일업로드</button>\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<br>\n");
      out.write("\n");
      out.write("	<div id=\"imgView\">\n");
      out.write("		");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/home5.jsp(153,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/home5.jsp(153,2) '${imgList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${imgList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/home5.jsp(153,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("imgList");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("			<img src=\"img/sort5/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imgList.imgTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" width=\"100\" height=\"100\" />\n");
            out.write("		");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
