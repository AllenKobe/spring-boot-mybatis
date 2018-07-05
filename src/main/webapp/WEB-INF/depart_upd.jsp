<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>
    部门添加
</h2>
部门名称：<input type="text" width="20%" value="${dept.departmentName}">
部门编号：<input type="text" width="20%" value="${dept.departmentNumber}">
<button>确定</button>
<button>取消</button>
</body>
</html>
