<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wedding</title>
</head>
<body>
     
     <div id="weddingRegistration">
     
     <form:form commandName="wedding" action="/weddingR" >
      <fieldset>
      <legend>Wedding Registration Form</legend>
      <p class="displayedName">Wedding: <input type="text" size="20"/><br/>
      <p class="displayedName">Country:
      <select size="20">
      <c:forEach items="${countrys}" var="countrys">
        <option>${countrys}</option>
      </c:forEach>
      </select>
      
      
      
      
      
      </fieldset>
     </form:form>
     
     </div>
</body>
</html>