package org.apache.jsp.WEB_002dINF.views.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ObjectUtils;

public final class goodsList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
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
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/My97DatePicker/WdatePicker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"font-family: '微软雅黑'\">\r\n");
      out.write("<div id=\"tb\" style=\"padding:5px;height:auto\">\r\n");
      out.write("        <div>\r\n");
      out.write("        \t<form id=\"searchFrom\" action=\"\">\r\n");
      out.write("       \t        <input type=\"text\" name=\"filter_LIKES_label\" class=\"easyui-validatebox\" data-options=\"width:150,prompt: '标签'\"/>\r\n");
      out.write("       \t        <input type=\"text\" name=\"filter_LIKES_value\" class=\"easyui-validatebox\" data-options=\"width:150,prompt: '值'\"/>\r\n");
      out.write("       \t        <input type=\"text\" name=\"filter_LIKES_type\" class=\"easyui-validatebox\" data-options=\"width:150,prompt: '类型'\"/>\r\n");
      out.write("\t\t        <span class=\"toolbar-item dialog-tool-separator\"></span>\r\n");
      out.write("\t\t        <a href=\"javascript(0)\" class=\"easyui-linkbutton\" plain=\"true\" iconCls=\"icon-search\" onclick=\"cx()\">查询</a>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t       \t");
      if (_jspx_meth_shiro_hasPermission_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t       \t");
      if (_jspx_meth_shiro_hasPermission_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t        ");
      if (_jspx_meth_shiro_hasPermission_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div> \r\n");
      out.write("        \r\n");
      out.write("</div>\r\n");
      out.write("<table id=\"dg\"></table> \r\n");
      out.write("<div id=\"dlg\"></div>  \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var dg;\r\n");
      out.write("$(function(){   \r\n");
      out.write("\tdg=$('#dg').datagrid({    \r\n");
      out.write("\tmethod: \"get\",\r\n");
      out.write("    url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/shop/goods/json', \r\n");
      out.write("    fit : true,\r\n");
      out.write("\tfitColumns : true,\r\n");
      out.write("\tborder : false,\r\n");
      out.write("\tstriped:true,\r\n");
      out.write("\tidField : 'id',\r\n");
      out.write("\tpagination:true,\r\n");
      out.write("\trownumbers:true,\r\n");
      out.write("\tpageNumber:1,\r\n");
      out.write("\tpageSize : 20,\r\n");
      out.write("\tpageList : [ 10, 20, 30, 40, 50 ],\r\n");
      out.write("\tsingleSelect:true,\r\n");
      out.write("    columns:[[    \r\n");
      out.write("\t\t{field:'id',title:'id',hidden:true},  \r\n");
      out.write("\t\t{field:'name',title:'名称',sortable:true,width:100},\r\n");
      out.write("\t\t{field:'cover',title:'封面',sortable:true,width:100},\r\n");
      out.write("        {field:'price',title:'价格',sortable:true,width:100},    \r\n");
      out.write("        {field:'isSold',title:'是否上架',sortable:true},\r\n");
      out.write("        {field:'sales',title:'销量',sortable:true,width:100},\r\n");
      out.write("        {field:'postage',title:'邮费',sortable:true},\r\n");
      out.write("        {field:'pv',title:'浏览量',sortable:true}\r\n");
      out.write("    ]],\r\n");
      out.write("    enableHeaderClickMenu: false,\r\n");
      out.write("    enableHeaderContextMenu: false,\r\n");
      out.write("    enableRowContextMenu: false,\r\n");
      out.write("    toolbar:'#tb'\r\n");
      out.write("});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//弹窗增加\r\n");
      out.write("function add() {\r\n");
      out.write("\td=$(\"#dlg\").dialog({   \r\n");
      out.write("\t    title: '添加商品',    \r\n");
      out.write("\t    width: 380,    \r\n");
      out.write("\t    height: 250,    \r\n");
      out.write("\t    href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/shop/goods/create',\r\n");
      out.write("\t    maximizable:true,\r\n");
      out.write("\t    modal:true,\r\n");
      out.write("\t    buttons:[{\r\n");
      out.write("\t\t\ttext:'确认',\r\n");
      out.write("\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t$(\"#mainform\").submit(); \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},{\r\n");
      out.write("\t\t\ttext:'取消',\r\n");
      out.write("\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\td.panel('close');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}]\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//删除\r\n");
      out.write("function del(){\r\n");
      out.write("\tvar row = dg.datagrid('getSelected');\r\n");
      out.write("\tif(rowIsNull(row)) return;\r\n");
      out.write("\tparent.$.messager.confirm('提示', '删除后无法恢复您确定要删除？', function(data){\r\n");
      out.write("\t\tif (data){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:'get',\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/shop/goods/delete/\"+row.id,\r\n");
      out.write("\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\tsuccessTip(data,dg);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t} \r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//弹窗修改\r\n");
      out.write("function upd(){\r\n");
      out.write("\tvar row = dg.datagrid('getSelected');\r\n");
      out.write("\tif(rowIsNull(row)) return;\r\n");
      out.write("\td=$(\"#dlg\").dialog({   \r\n");
      out.write("\t    title: '修改用户',    \r\n");
      out.write("\t    width: 380,    \r\n");
      out.write("\t    height: 250,    \r\n");
      out.write("\t    href:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/shop/goods/update/'+row.id,\r\n");
      out.write("\t    maximizable:true,\r\n");
      out.write("\t    modal:true,\r\n");
      out.write("\t    buttons:[{\r\n");
      out.write("\t\t\ttext:'修改',\r\n");
      out.write("\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t$('#mainform').submit(); \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},{\r\n");
      out.write("\t\t\ttext:'取消',\r\n");
      out.write("\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\td.panel('close');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}]\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("//创建查询对象并查询\r\n");
      out.write("function cx(){\r\n");
      out.write("\tvar obj=$(\"#searchFrom\").serializeObject();\r\n");
      out.write("\tdg.datagrid('reload',obj); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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
    _jspx_th_shiro_hasPermission_0.setName("sys:dict:add");
    int _jspx_eval_shiro_hasPermission_0 = _jspx_th_shiro_hasPermission_0.doStartTag();
    if (_jspx_eval_shiro_hasPermission_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t       \t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\" onclick=\"add();\">添加</a>\r\n");
        out.write("\t       \t\t<span class=\"toolbar-item dialog-tool-separator\"></span>\r\n");
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
    _jspx_th_shiro_hasPermission_1.setName("sys:dict:delete");
    int _jspx_eval_shiro_hasPermission_1 = _jspx_th_shiro_hasPermission_1.doStartTag();
    if (_jspx_eval_shiro_hasPermission_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t            <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\" data-options=\"disabled:false\" onclick=\"del()\">删除</a>\r\n");
        out.write("\t            <span class=\"toolbar-item dialog-tool-separator\"></span>\r\n");
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
    _jspx_th_shiro_hasPermission_2.setName("sys:dict:update");
    int _jspx_eval_shiro_hasPermission_2 = _jspx_th_shiro_hasPermission_2.doStartTag();
    if (_jspx_eval_shiro_hasPermission_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t            <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\" onclick=\"upd()\">修改</a>\r\n");
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
}
