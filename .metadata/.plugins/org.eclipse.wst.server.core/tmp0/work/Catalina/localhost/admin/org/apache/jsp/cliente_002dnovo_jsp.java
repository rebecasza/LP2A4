/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.105
 * Generated at: 2020-09-03 01:26:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cliente_002dnovo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>IFSP Admin</title>\n");
      out.write("        <link href=\"/admin/css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\" />\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/all.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"sb-nav-fixed\">\n");
      out.write("        <nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\">IFSP</a>\n");
      out.write("        </nav>\n");
      out.write("        <div id=\"layoutSidenav\">\n");
      out.write("            <div id=\"layoutSidenav_nav\">\n");
      out.write("                <nav class=\"sb-sidenav accordion sb-sidenav-light\" id=\"sidenavAccordion\">\n");
      out.write("                    <div class=\"sb-sidenav-menu\">\n");
      out.write("                        <div class=\"nav\">\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Menu Principal</div>\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseLayouts\" aria-expanded=\"false\" aria-controls=\"collapseLayouts\"\n");
      out.write("                                ><div class=\"sb-nav-link-icon\"><i class=\"fas fa-columns\"></i></div>\n");
      out.write("                                Cliente\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div\n");
      out.write("                            ></a>\n");
      out.write("                            <div class=\"collapse\" id=\"collapseLayouts\" aria-labelledby=\"headingOne\" data-parent=\"#sidenavAccordion\">\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/admin/cliente/lista\">Lista</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"/admin/cliente/novo\">Novo</a></nav>\n");
      out.write("                            </div>\n");
      out.write("                            <!--\n");
      out.write("\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\"\n");
      out.write("                                ><div class=\"sb-nav-link-icon\"><i class=\"fas fa-table\"></i></div>\n");
      out.write("                                Novo link\n");
      out.write("\t\t\t\t\t\t\t</a> -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sb-sidenav-footer\">\n");
      out.write("                        <div class=\"small\">Disciplina:</div>\n");
      out.write("                        LP2A4\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"layoutSidenav_content\">\n");
      out.write("                <main>\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <h1 class=\"mt-4\">Cliente</h1>\n");
      out.write("                        <ol class=\"breadcrumb mb-4\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Cliente</li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/admin/cliente/lista\" class=\"btn btn-outline-primary\">Lista de Clientes</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <div class=\"card-header\"><i class=\"fas fa-table mr-1\"></i>Novo Cliente</div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                            \t<form method=\"post\" action=\"/admin/cliente/novo\">\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"small mb-1\" for=\"nome\">Nome</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"nome\" name=\"nome\" type=\"text\" placeholder=\"Nome Completo\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"small mb-1\" for=\"tipo\">Tipo</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"tipo\" name=\"tipo\" class=\"form-control\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option selected disabled>Selecione...</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"PF\">Pessoa Física</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"PJ\">Pessoa Jurídica</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"small mb-1\" for=\"email\">E-mail</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"email\" name=\"email\" type=\"email\" aria-describedby=\"emailHelp\" placeholder=\"Informe seu e-mail\" /></div>\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"small mb-1\" for=\"cpf_cnpj\">CPF/CNPJ</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"cpf_cnpj\" name=\"cpf_cnpj\" type=\"text\" placeholder=\"Informe seu cpf/cnpj\" /></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"small mb-1\" for=\"telefone\">Telefone</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"telefone\" name=\"telefone\" type=\"text\" placeholder=\"Informe seu telefone\" /></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group mt-4 mb-0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"btn btn-primary btn-block\" type=\"submit\" value=\"Salvar\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                        </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("                <footer class=\"py-4 bg-light mt-auto\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("                            <div class=\"text-muted\">Prof. Aldo Paim</div>\n");
      out.write("                            <div>\n");
      out.write("                                Versão 1.0\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"/admin/assets/demo/datatables-demo.js\"></script>\n");
      out.write("    </body>\n");
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
}
