/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.105
 * Generated at: 2020-09-09 23:59:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class livro_002dnovo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<meta name=\"author\" content=\"\" />\n");
      out.write("<title>IFSP Admin</title>\n");
      out.write("<link href=\"/admin/css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("<link\n");
      out.write("\thref=\"https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css\"\n");
      out.write("\trel=\"stylesheet\" crossorigin=\"anonymous\" />\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/all.min.js\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("<body class=\"sb-nav-fixed\">\n");
      out.write("\t<nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"index.html\">IFSP</a>\n");
      out.write("\t</nav>\n");
      out.write("\t<div id=\"layoutSidenav\">\n");
      out.write("\t\t<div id=\"layoutSidenav_nav\">\n");
      out.write("\t\t\t<nav class=\"sb-sidenav accordion sb-sidenav-light\"\n");
      out.write("\t\t\t\tid=\"sidenavAccordion\">\n");
      out.write("\t\t\t\t<div class=\"sb-sidenav-menu\">\n");
      out.write("\t\t\t\t\t<div class=\"nav\">\n");
      out.write("\t\t\t\t\t\t<div class=\"sb-sidenav-menu-heading\">Menu Principal</div>\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\t\t\tdata-target=\"#collapseLayouts\" aria-expanded=\"false\"\n");
      out.write("\t\t\t\t\t\t\taria-controls=\"collapseLayouts\"><div class=\"sb-nav-link-icon\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-columns\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div> Cliente\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sb-sidenav-collapse-arrow\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-angle-down\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div></a>\n");
      out.write("\t\t\t\t\t\t<div class=\"collapse\" id=\"collapseLayouts\"\n");
      out.write("\t\t\t\t\t\t\taria-labelledby=\"headingOne\" data-parent=\"#sidenavAccordion\">\n");
      out.write("\t\t\t\t\t\t\t<nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/admin/livro/lista\">Lista</a> <a\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"nav-link\" href=\"/admin/livro/novo\">Novo</a>\n");
      out.write("\t\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<!--\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\"\n");
      out.write("                                ><div class=\"sb-nav-link-icon\"><i class=\"fas fa-table\"></i></div>\n");
      out.write("                                Novo link\n");
      out.write("\t\t\t\t\t\t\t</a> -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"sb-sidenav-footer\">\n");
      out.write("\t\t\t\t\t<div class=\"small\">Disciplina:</div>\n");
      out.write("\t\t\t\t\tLP2A4\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"layoutSidenav_content\">\n");
      out.write("\t\t\t<main>\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<h1 class=\"mt-4\">Livro</h1>\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb mb-4\">\n");
      out.write("\t\t\t\t\t<li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"breadcrumb-item active\">Livro</li>\n");
      out.write("\t\t\t\t</ol>\n");
      out.write("\t\t\t\t<div class=\"card mb-4\">\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<a href=\"/admin/livro/lista\" class=\"btn btn-outline-primary\">Lista de Livros</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\t\t\n");
      out.write("\t\t\t\t<div class=\"card mb-4\">\n");
      out.write("\t\t\t\t\t<div class=\"card-header\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-table mr-1\"></i>Novo Livro\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t<form method=\"post\" action=\"/admin/livro/novo\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"small mb-1\" for=\"nome\">Titulo</label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"nome\" name=\"titulo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titulo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"small mb-1\" for=\"preco\">Preço</label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"preco\" name=\"preco\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preco}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"small mb-1\" for=\"cpf_cnpj\">Autor</label> <input\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"cpf_cnpj\" name=\"autor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" />\n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"small mb-1\" for=\"isbn\">ISBN</label> <input\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" id=\"isbn\" name=\"isbn\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isbn}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"type=\"text\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group mt-4 mb-0\">\n");
      out.write("\t\t\t\t\t<input class=\"btn btn-primary btn-block\" type=\"submit\"\n");
      out.write("\t\t\t\t\t\tvalue=\"Salvar\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</main>\n");
      out.write("\t<footer class=\"py-4 bg-light mt-auto\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("\t\t\t\t<div class=\"text-muted\">Rebeca Souza</div>\n");
      out.write("\t\t\t\t<div>Versão 1.0</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js\"\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js\"\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js\"\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\t<script src=\"/admin/assets/demo/datatables-demo.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
      // /livro-novo.jsp(75,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/livro-novo.jsp(75,4) '${mensagens}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${mensagens}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /livro-novo.jsp(75,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("mensagem");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">\n");
            out.write("\t\t\t\t\t\t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mensagem}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\n");
            out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
            out.write("\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
            out.write("\t\t\t\t\t\t</button>\n");
            out.write("\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /livro-novo.jsp(84,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sucess}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\n");
          out.write("\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sucess}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\n");
          out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
          out.write("\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
          out.write("\t\t\t\t\t\t</button>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}