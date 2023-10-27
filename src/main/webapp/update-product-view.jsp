<%@ page import="com.example.productmanage.entity.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.productmanage.entity.Manufacturer" %><%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 08/03/2023
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Product productUpdate = (Product) session.getAttribute("productUpdate");
    List<Manufacturer> ls = (List<Manufacturer>) session.getAttribute("manufacturers");

%>
<h2>Update product</h2>
<form action="ProductController">
    <input type="hidden" name="action" value="update_product"/>
    <input type="hidden" name="idProduct" value="<%=productUpdate.getProductId()%>"/>
    Name:<input name="name" value="<%=productUpdate.getProductName()%>"/>
    <br>
    Description:<input name="description" value="<%=productUpdate.getDescription()%>"/>
    <br>
    Manufacturer:
    <select name="manufacturer">
        <% for(Manufacturer manufacturer: ls) { %>
            <option <%= manufacturer.getId()==productUpdate.getManuf().getId() ? "selected": ""%> value="<%=manufacturer.getId()%>"><%=manufacturer.getManName()%></option>
        <% } %>
    </select>
    <br>
    <button>Update</button>
</form>
</body>
</html>
