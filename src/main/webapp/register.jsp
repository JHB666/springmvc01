<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/8 0008
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>用户注册</h1>
<form  action="${pageContext.request.contextPath}/register4" method="post">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>真实姓名:</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td>
                <input type="radio" name="gender" value="男" checked="checked"/>男
                <input type="radio" name="gender" value="女"/>女
            </td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td>商品名称:</td>
            <td><input type="text" name="product.productName"/></td>
        </tr>
        <tr>
            <td>商品单价:</td>
            <td><input type="text" name="product.productPrice"/></td>
        </tr>
        <tr>
            <td><input type="text" name="books[0].bookName" PLACEHOLDER="第一本书名"/></td>
            <td><input type="text" name="books[0].bookAuthor" PLACEHOLDER="第一本作者"/></td>
        </tr>
        <tr>
            <td><input type="text" name="books[1].bookName" PLACEHOLDER="第二本书名"/></td>
            <td><input type="text" name="books[1].bookAuthor" PLACEHOLDER="第二本作者"/></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="注册"/></td>
        </tr>
    </table>
</form>
</body>
</html>
