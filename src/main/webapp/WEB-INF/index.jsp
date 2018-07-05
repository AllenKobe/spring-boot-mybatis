<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>
    部门列表
</h2>

<table>
    <tr>
        <th>编号</th>
        <th>部门名称</th>
        <th>部门编号</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${departments}" var="dp">
    <tr>
        <td>${dp.id}</td>
        <td>${dp.departmentName}</td>
        <td>${dp.departmentNumber}</td>
        <td><a href="${ctx}/test/upd?id=${dp.id}"><button>修改</button></a>
            <a href="${ctx}/test/del?id=${dp.id}"><button>删除</button></a></td>
    </tr>
    </c:forEach>
</table>
<a href="${ctx}/test/add"> <button>新增</button></a>
</body>
</html>
