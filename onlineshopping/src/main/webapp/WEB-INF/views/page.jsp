<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" /> 


<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shop Homepage -${title} }</title>
<script>
window.menu = '${title}';

</script>
    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap readable theme CSS -->
    <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>
  <div  class="wrapper">

    <!-- Navigation -->
<%@include file="./shared/navbar.jsp" %>
    <!-- Page Content -->
    <div class="content">
    <c:if test="${userclickabout==true}">
   <%@include file="about.jsp" %>
   </c:if>
   
   <c:if test="${userclickcontact==true}">
   <%@include file="contact.jsp" %>
   </c:if>
   
   <c:if test="${userclickhome==true}">
   <%@include file="home.jsp" %>
   </c:if>
   
   <c:if test="${userclickservices==true}">
   <%@include file="services.jsp" %>
   </c:if>
   <!-- Load listProducts -->
   <c:if test="${userClicAllProducts == true or userClicCategoryProducts== true}">
   <%@include file="listProducts.jsp" %>
   </c:if>
   </div>
   
   
    <!-- Footer -->
   <%@include file="./shared/footer.jsp" %>
    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/bootstrap.min.js"></script>

<!-- Self coded javascript -->
<script src="${js}/myapp.js"></script>
</div>
  </body>

</html>
