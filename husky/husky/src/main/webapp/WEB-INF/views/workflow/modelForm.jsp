<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title></title>
<%@ include file="/WEB-INF/views/include/easyui.jsp"%>

</head>
<body>
	<div>
		<form id="mainform" action="${ctx}/workflow/model/create"
			target="_blank" method="post">
			<table>
				<tr>
					<td>名称：</td>
					<td><input id="name" name="name" type="text"
						class="easyui-validatebox"
						data-options="required:true,validType:['length[0,255]']" /></td>
				</tr>
				<tr>
					<td>KEY：</td>
					<td><input id="key" name="key" type="text"
						class="easyui-validatebox"
						data-options="required:true,validType:['length[0,255]']" /></td>
				</tr>
				<tr>
					<td>描述：</td>
					<td><textarea id="description" name="description"
							style="width: 300px; height: 50px;" class="easyui-validatebox"
							data-options="required:true,validType:['length[0,255]']"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</div>
<script type="text/javascript">
$(function(){
	
	$('#mainform').form({    
	    onSubmit: function(){    
	    	var isValid = $(this).form('validate');
			return isValid;	// 返回false终止表单提交
	    },    
	    success:function(data){   
	    	if(successTip(data,null,null)){
	    		location.reload() ;
	    	}
	    }    
	}); 
});

</script>
</body>
</html>