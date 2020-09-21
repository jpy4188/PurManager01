<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/7/30
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addcai.do" method="post">
    <table cellpadding="0px"  cellspacing="0px"  align="center" border="1px  solid">
        <tr>
            <td>采购类型</td>
            <td>
                <select name="ptype">
                    <option value="办公用品">办公用品</option>
                    <option value="福利用品">福利用品</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>商品名称：</td>
            <td><input  type="text" name="pname"></td>
        </tr>
        <tr>
            <td>商品单位：</td>
            <td><input  type="text" name="punit"></td>
        </tr>
        <tr>
            <td>商品数量</td>
            <td><input  type="text" name="pnum"></td>
        </tr>
        <tr>
            <td>商品采购人</td>
            <td><input  type="text" name="pperson"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="保存"></td>

        </tr>
    </table>


</form>

</body>
</html>
