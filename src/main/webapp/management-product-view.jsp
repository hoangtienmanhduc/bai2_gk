<%@ page import="java.util.List" %>
<%@ page import="com.example.productmanage.entity.Product" %>
<%@ page import="com.example.productmanage.service.ProductService" %>
<%@ page import="com.example.productmanage.entity.Manufacturer" %>
<%@ page import="com.example.productmanage.service.ManufacturerService" %><%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 07/03/2023
  Time: 11:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% List<Product> products = (List<Product>) session.getAttribute("products");
    ManufacturerService manufacturerService = new ManufacturerService();%>
<h2>Xin chao</h2>
<br/>
<table border="1" width="80%" align="center">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Description</th>
        <th>manufacturer</th>
    </tr>
    <% for(Product product: products) { %>
    <tr>
        <td><%= product.getProductId() %></td>
        <td><%= product.getProductName() %></td>
        <td><%= product.getDescription() %></td>
        <td><%= manufacturerService.getManufacturerById(String.valueOf(product.getManuf().getId())).getManName()  %></td>

        <td><a href=""
               onclick='if(confirm("Are you sure to execute this action?"))
                       {window.open("ProductController?action=delete_product&id=<%=product.getProductId()%>");window.close();}'
        >Delete</a></td>
        <td><a href="ProductController?action=update_product_view&id=<%=product.getProductId()%>">Update</a></td>
    </tr>
    <% } %>


</table>
<a href="ProductController?action=add_product_view">Add Product</a>
</body>
</html>
