
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

            <p>
                <label for="name">Product Name:</label>
                <form:input path="name" tabindex="1"/>
            </p>


            <p>
                <label for="description">Description:</label>
                <form:input path="description" tabindex="2"/>
            </p>


            <p>
                <label for="price">Price:</label>
                <form:input path="price" tabindex="3"/>
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
