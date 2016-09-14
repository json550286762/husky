package org.apache.jsp.WEB_002dINF.views.system;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils;

public final class userList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/views/include/easyui.jsp");
    _jspx_dependants.add("/WEB-INF/views/include/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_default_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_hasPermission_name;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_default_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_hasPermission_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_default_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_shiro_hasPermission_name.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title></title>\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!-- easyui皮肤 -->\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jquery-easyui-theme/");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("/easyui.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jquery-easyui-theme/icon.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/icons/icon-all.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!-- ztree样式 -->\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/ztree/css/zTreeStyle/zTreeStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jquery/jquery-1.11.1.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jquery-easyui-1.3.6/jquery.easyui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- jquery扩展 -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/release/jquery.jdirk.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- easyui扩展 -->\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.progressbar.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.slider.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.linkbutton.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.validatebox.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.combo.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.combobox.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.menu.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.searchbox.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.panel.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.window.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.dialog.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.layout.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.tree.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.datagrid.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.treegrid.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.combogrid.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.combotree.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.tabs.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.theme.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!--<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/release/jeasyui.extensions.all.min.js\"></script>-->\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/icons/jeasyui.icons.all.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/release/jeasyui.icons.all.min.js\"></script>-->\n");
      out.write("    \n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.icons.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.gridselector.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jquery.toolbar.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jquery.comboicons.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jquery.comboselector.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jquery.portal.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jquery.my97.js\" type=\"text/javascript\"></script>    \n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/jeasyui-extensions/jeasyui.extensions.ty.js\"></script>\n");
      out.write("\n");
      out.write("<!-- ztree扩展 -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/ztree/js/jquery.ztree.all-3.5.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/ztree/js/jquery.ztree.exhide-3.5.min.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/easyui/common/other.css\"></link>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("//全局的AJAX访问，处理AJAX清求时SESSION超时\n");
      out.write("$.ajaxSetup({\n");
      out.write("    contentType:\"application/x-www-form-urlencoded;charset=utf-8\",\n");
      out.write("    complete:function(XMLHttpRequest,textStatus){\n");
      out.write("          //通过XMLHttpRequest取得响应头，sessionstatus           \n");
      out.write("          var sessionstatus=XMLHttpRequest.getResponseHeader(\"sessionstatus\"); \n");
      out.write("          if(sessionstatus==\"timeout\"){\n");
      out.write("               //跳转的登录页面\n");
      out.write("               window.location.replace('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/a/login');\n");
      out.write("       \t\t}\t\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/My97DatePicker/WdatePicker.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"tb\" style=\"padding:5px;height:auto\">\n");
      out.write("        <div>\n");
      out.write("        \t<form id=\"searchFrom\" action=\"\">\n");
      out.write("       \t        <input type=\"text\" name=\"filter_LIKES_name\" class=\"easyui-validatebox\" data-options=\"width:150,prompt: '昵称'\"/>\n");
      out.write("       \t        <input type=\"text\" name=\"filter_LIKES_phone\" class=\"easyui-validatebox\" data-options=\"width:150,prompt: '电话'\"/>\n");
      out.write("\t\t        <input type=\"text\" name=\"filter_GTD_createDate\" class=\"easyui-my97\" datefmt=\"yyyy-MM-dd\" data-options=\"width:150,prompt: '开始日期'\"/>\n");
      out.write("\t\t        - <input type=\"text\" name=\"filter_LTD_createDate\" class=\"easyui-my97\" datefmt=\"yyyy-MM-dd\" data-options=\"width:150,prompt: '结束日期'\"/>\n");
      out.write("\t\t        <span class=\"toolbar-item dialog-tool-separator\"></span>\n");
      out.write("\t\t        <a href=\"javascript(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" plain=\"true\" onclick=\"cx()\">查询</a>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t\n");
      out.write("\t       \t");
      if (_jspx_meth_shiro_hasPermission_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t       \t");
      if (_jspx_meth_shiro_hasPermission_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t        ");
      if (_jspx_meth_shiro_hasPermission_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t        ");
      if (_jspx_meth_shiro_hasPermission_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \t");
      if (_jspx_meth_shiro_hasPermission_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("  </div>\n");
      out.write("<table id=\"dg\"></table> \n");
      out.write("<div id=\"dlg\"></div>  \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var dg;\n");
      out.write("var d;\n");
      out.write("$(function(){   \n");
      out.write("\tdg=$('#dg').datagrid({    \n");
      out.write("\tmethod: \"get\",\n");
      out.write("    url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/system/user/json', \n");
      out.write("    fit : true,\n");
      out.write("\tfitColumns : true,\n");
      out.write("\tborder : false,\n");
      out.write("\tidField : 'id',\n");
      out.write("\tstriped:true,\n");
      out.write("\tpagination:true,\n");
      out.write("\trownumbers:true,\n");
      out.write("\tpageNumber:1,\n");
      out.write("\tpageSize : 20,\n");
      out.write("\tpageList : [ 10, 20, 30, 40, 50 ],\n");
      out.write("\tsingleSelect:true,\n");
      out.write("    columns:[[    \n");
      out.write("        {field:'id',title:'id',hidden:true},    \n");
      out.write("        {field:'loginName',title:'帐号',sortable:true,width:100},    \n");
      out.write("        {field:'name',title:'昵称',sortable:true,width:100},\n");
      out.write("        {field:'gender',title:'性别',sortable:true,\n");
      out.write("        \tformatter : function(value, row, index) {\n");
      out.write("       \t\t\treturn value==1?'男':'女';\n");
      out.write("        \t}\n");
      out.write("        },\n");
      out.write("        {field:'email',title:'email',sortable:true,width:100},\n");
      out.write("        {field:'phone',title:'电话',sortable:true,width:100},\n");
      out.write("        {field:'loginCount',title:'登录次数',sortable:true},\n");
      out.write("        {field:'previousVisit',title:'上一次登录',sortable:true}\n");
      out.write("    ]],\n");
      out.write("    headerContextMenu: [\n");
      out.write("        {\n");
      out.write("            text: \"冻结该列\", disabled: function (e, field) { return dg.datagrid(\"getColumnFields\", true).contains(field); },\n");
      out.write("            handler: function (e, field) { dg.datagrid(\"freezeColumn\", field); }\n");
      out.write("        },\n");
      out.write("        {\n");
      out.write("            text: \"取消冻结该列\", disabled: function (e, field) { return dg.datagrid(\"getColumnFields\", false).contains(field); },\n");
      out.write("            handler: function (e, field) { dg.datagrid(\"unfreezeColumn\", field); }\n");
      out.write("        }\n");
      out.write("    ],\n");
      out.write("    enableHeaderClickMenu: true,\n");
      out.write("    enableHeaderContextMenu: true,\n");
      out.write("    enableRowContextMenu: false,\n");
      out.write("    toolbar:'#tb'\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("\n");
      out.write("//弹窗增加\n");
      out.write("function add() {\n");
      out.write("\td=$(\"#dlg\").dialog({   \n");
      out.write("\t    title: '添加用户',    \n");
      out.write("\t    width: 380,    \n");
      out.write("\t    height: 380,    \n");
      out.write("\t    href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/system/user/create',\n");
      out.write("\t    maximizable:true,\n");
      out.write("\t    modal:true,\n");
      out.write("\t    buttons:[{\n");
      out.write("\t\t\ttext:'确认',\n");
      out.write("\t\t\thandler:function(){\n");
      out.write("\t\t\t\t$(\"#mainform\").submit(); \n");
      out.write("\t\t\t}\n");
      out.write("\t\t},{\n");
      out.write("\t\t\ttext:'取消',\n");
      out.write("\t\t\thandler:function(){\n");
      out.write("\t\t\t\t\td.panel('close');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t}]\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("//删除\n");
      out.write("function del(){\n");
      out.write("\tvar row = dg.datagrid('getSelected');\n");
      out.write("\tif(rowIsNull(row)) return;\n");
      out.write("\tparent.$.messager.confirm('提示', '删除后无法恢复您确定要删除？', function(data){\n");
      out.write("\t\tif (data){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype:'get',\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/system/user/delete/\"+row.id,\n");
      out.write("\t\t\t\tsuccess: function(data){\n");
      out.write("\t\t\t\t\tsuccessTip(data,dg);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t} \n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("//弹窗修改\n");
      out.write("function upd(){\n");
      out.write("\tvar row = dg.datagrid('getSelected');\n");
      out.write("\tif(rowIsNull(row)) return;\n");
      out.write("\td=$(\"#dlg\").dialog({   \n");
      out.write("\t    title: '修改用户',    \n");
      out.write("\t    width: 380,    \n");
      out.write("\t    height: 340,    \n");
      out.write("\t    href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/system/user/update/'+row.id,\n");
      out.write("\t    maximizable:true,\n");
      out.write("\t    modal:true,\n");
      out.write("\t    buttons:[{\n");
      out.write("\t\t\ttext:'修改',\n");
      out.write("\t\t\thandler:function(){\n");
      out.write("\t\t\t\t$('#mainform').submit(); \n");
      out.write("\t\t\t}\n");
      out.write("\t\t},{\n");
      out.write("\t\t\ttext:'取消',\n");
      out.write("\t\t\thandler:function(){\n");
      out.write("\t\t\t\t\td.panel('close');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t}]\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("//用户角色弹窗\n");
      out.write("function userForRole(){\n");
      out.write("\tvar row = dg.datagrid('getSelected');\n");
      out.write("\tif(rowIsNull(row)) return;\n");
      out.write("\t$.ajaxSetup({type : 'GET'});\n");
      out.write("\td=$(\"#dlg\").dialog({   \n");
      out.write("\t    title: '用户角色管理',    \n");
      out.write("\t    width: 580,    \n");
      out.write("\t    height: 350,  \n");
      out.write("\t    href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/system/user/'+row.id+'/userRole',\n");
      out.write("\t    maximizable:true,\n");
      out.write("\t    modal:true,\n");
      out.write("\t    buttons:[{\n");
      out.write("\t\t\ttext:'确认',\n");
      out.write("\t\t\thandler:function(){\n");
      out.write("\t\t\t\tsaveUserRole();\n");
      out.write("\t\t\t\td.panel('close');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},{\n");
      out.write("\t\t\ttext:'取消',\n");
      out.write("\t\t\thandler:function(){\n");
      out.write("\t\t\t\t\td.panel('close');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}]\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("//用户机构弹窗\n");
      out.write("function userForOrg(){\n");
      out.write("\tvar row = dg.datagrid('getSelected');\n");
      out.write("\tif(rowIsNull(row)) return;\n");
      out.write("\t$.ajaxSetup({type : 'GET'});\n");
      out.write("\td=$(\"#dlg\").dialog({   \n");
      out.write("\t    title: '用户机构管理',    \n");
      out.write("\t    width: 580,    \n");
      out.write("\t    height: 350,  \n");
      out.write("\t    href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/system/user/'+row.id+'/userOrg',\n");
      out.write("\t    maximizable:true,\n");
      out.write("\t    modal:true,\n");
      out.write("\t    buttons:[{\n");
      out.write("\t\t\ttext:'确认',\n");
      out.write("\t\t\thandler:function(){\n");
      out.write("\t\t\t\tsaveUserOrg();\n");
      out.write("\t\t\t\td.panel('close');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},{\n");
      out.write("\t\t\ttext:'取消',\n");
      out.write("\t\t\thandler:function(){\n");
      out.write("\t\t\t\t\td.panel('close');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}]\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("//查看\n");
      out.write("function look(){\n");
      out.write("\tvar row = dg.datagrid('getSelected');\n");
      out.write("\tif(rowIsNull(row)) return;\n");
      out.write("\td=$(\"#dlg\").dialog({   \n");
      out.write("\t    title: '修改用户',    \n");
      out.write("\t    width: 380,    \n");
      out.write("\t    height: 340,    \n");
      out.write("\t    href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/system/user/update/'+row.id,\n");
      out.write("\t    maximizable:true,\n");
      out.write("\t    modal:true,\n");
      out.write("\t    buttons:[{\n");
      out.write("\t\t\ttext:'取消',\n");
      out.write("\t\t\thandler:function(){\n");
      out.write("\t\t\t\t\td.panel('close');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t}]\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("//创建查询对象并查询\n");
      out.write("function cx(){\n");
      out.write("\tvar obj=$(\"#searchFrom\").serializeObject();\n");
      out.write("\tdg.datagrid('load',obj); \n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_default_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cookie.themeName.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_out_0.setDefault("default");
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_default_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_default_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_0 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_0.setParent(null);
    _jspx_th_shiro_hasPermission_0.setName("sys:user:add");
    int _jspx_eval_shiro_hasPermission_0 = _jspx_th_shiro_hasPermission_0.doStartTag();
    if (_jspx_eval_shiro_hasPermission_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t       \t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\" onclick=\"add();\">添加</a>\n");
        out.write("\t       \t\t<span class=\"toolbar-item dialog-tool-separator\"></span>\n");
        out.write("\t       \t");
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
      return true;
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_1 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_1.setParent(null);
    _jspx_th_shiro_hasPermission_1.setName("sys:user:delete");
    int _jspx_eval_shiro_hasPermission_1 = _jspx_th_shiro_hasPermission_1.doStartTag();
    if (_jspx_eval_shiro_hasPermission_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t            <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\" data-options=\"disabled:false\" onclick=\"del()\">删除</a>\n");
        out.write("\t        \t<span class=\"toolbar-item dialog-tool-separator\"></span>\n");
        out.write("\t        ");
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_1);
      return true;
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_1);
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_2 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_2.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_2.setParent(null);
    _jspx_th_shiro_hasPermission_2.setName("sys:user:update");
    int _jspx_eval_shiro_hasPermission_2 = _jspx_th_shiro_hasPermission_2.doStartTag();
    if (_jspx_eval_shiro_hasPermission_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t            <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\" onclick=\"upd()\">修改</a>\n");
        out.write("\t            <span class=\"toolbar-item dialog-tool-separator\"></span>\n");
        out.write("\t        ");
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_2);
      return true;
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_2);
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_3 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_3.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_3.setParent(null);
    _jspx_th_shiro_hasPermission_3.setName("sys:user:roleView");
    int _jspx_eval_shiro_hasPermission_3 = _jspx_th_shiro_hasPermission_3.doStartTag();
    if (_jspx_eval_shiro_hasPermission_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        \t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-hamburg-suppliers\" plain=\"true\" onclick=\"userForRole()\">用户角色</a>\n");
        out.write("        \t");
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_3);
      return true;
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_3);
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_4 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_4.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_4.setParent(null);
    _jspx_th_shiro_hasPermission_4.setName("sys:user:orgView");
    int _jspx_eval_shiro_hasPermission_4 = _jspx_th_shiro_hasPermission_4.doStartTag();
    if (_jspx_eval_shiro_hasPermission_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        \t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-cologne-home\" plain=\"true\" onclick=\"userForOrg()\">用户所属机构</a>\n");
        out.write("        \t");
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_4);
      return true;
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_4);
    return false;
  }
}
