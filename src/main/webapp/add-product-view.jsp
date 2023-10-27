<%@ page import="java.util.List" %>
<%@ page import="com.example.productmanage.entity.Manufacturer" %>
<%@ page import="com.example.productmanage.service.ManufacturerService" %><%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 07/03/2023
  Time: 10:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% List<Manufacturer> lsManufacturer =(List<Manufacturer>)session.getAttribute("maunfactories"); %>
<form action="ProductController">

  <input type="hidden" name="action" value="add_product"/>
  Name:<input type="text" name="name">
  <br/>
  Description:<input type="text" name="description">
  <br/>

  Manufacturer:
  <select name="manu">
  <% for(Manufacturer manufacturer : lsManufacturer){ %>
  <option value=<%= manufacturer.getId() %>><%=manufacturer.getManName()%></option>
  <% } %>
  </select>
  <br/>

  <button type="submit">ADD Product</button>
</form>
</body>
</html>
