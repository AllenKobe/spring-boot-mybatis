<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>
    部门添加
</h2>
部门名称：<input type="text" width="20%" id="name">
部门编号：<input type="text" width="20%" id="number">
<button onclick="agree();">确定</button>
<button>取消</button>
<script type="text/javascript">
function agree() {
    var name=document.getElementById("name").value;
    var number=document.getElementById("number").value;
    window.location.href="${ctx}/test/toAdd?name="+name+"&number="+number;
}
</script>
</body>
</html>
