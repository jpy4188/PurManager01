<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/7/30
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table cellpadding="0px"  cellspacing="0px"  align="center" border="1px  solid">
    <tr>
        <td>采购编号</td>
        <td>采购类型</td>
        <td>采购商品名称</td>
        <td>采购单位</td>
        <td>采购数量</td>
        <td>采购人</td>
        <td>审批时间</td>
        <td>审批状态</td>
        <td>操作内容</td>
    </tr>
    <c:forEach items="${list}" var="list">
        <tr>
            <td>${list.tpurchase.pid}</td>
            <td>${list.tpurchase.ptype}</td>
            <td>${list.tpurchase.pname}</td>
            <td>${list.tpurchase.punit}</td>
            <td>${list.tpurchase.pnum}</td>
            <td>${list.tpurchase.pperson}</td>
            <td>${list.padate}</td>
            <td>${list.pastate}</td>
            <td>
                <c:if test="${list.pastate!=null}">
                    <a href="update.do?pid=${list.tpurchase.pid}">审批</a>
                </c:if>

                <a href="delcai.do?pid=${list.tpurchase.pid}">删除</a>

            </td>
        </tr>

    </c:forEach>
    <tr>
        <td align="center" colspan="9"><a href="addcai.jsp">新增采购</a></td>

    </tr>




</table>

</body>
</html>
