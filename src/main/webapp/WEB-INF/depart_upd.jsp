<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>
    部门修改
</h2>
部门名称：<input type="text" width="20%" value="${dept.departmentName}" id="name">
部门编号：<input type="text" width="20%" value="${dept.departmentNumber}" id="number">
<input type="hidden" width="20%" value="${dept.id}" id="id">
<button onclick="agree();">确定</button>
<button>取消</button>
<script type="text/javascript">
    function agree() {
        var id=document.getElementById("id").value;
        var name=document.getElementById("name").value;
        var number=document.getElementById("number").value;
        window.location.href="${ctx}/test/toUpd?id="+id+"&name="+name+"&number="+number;
    }
</script>
</body>
</html>
