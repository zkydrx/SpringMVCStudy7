<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zky
  Date: 12/11/17
  Time: 12:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Product Form</title>
</head>
<body>
<div id="global">
    <form:form commandName="product" action="product_save" method="post">
        <fieldset>
            <legend>Add a Product</legend>
            <p class="error">
                <form:errors path="name" />
            </p>
            <p>
                <label for="name">Product Name:</label>
                <form:input path="name" tabindex="1"/>
            </p>
            <p class="errorLine">
                <form:errors path="description" cssClass="error"/>
            </p>

            <p>
                <label for="description">Description:</label>
                <form:input path="description" tabindex="2"/>
            </p>

            <p class="errorLine">
                <form:errors path="price" cssClass="error"/>
            </p>
            <p>
                <label for="price">Price:</label>
                <form:input path="price" tabindex="3"/>
            </p>

            <p class="errorLine">
                <form:errors path="price" cssClass="error"/>
            </p>
            <p>
                <label for="productionDate">Production Date</label>
                <form:input path="productionDate" tabindex="4"/>
            </p>

            <p id="buttons">
                <input type="reset" id="reset" tabindex="5"/>
                <input type="submit" id="submit" tabindex="6"/>
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
