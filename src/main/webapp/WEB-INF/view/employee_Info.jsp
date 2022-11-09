<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!Doctype html>
<html>

<body>

<h3> Employee Info</h3>

<br>
<%--Take info from View -> Model 'modelAttribute' --%>
<%--And onClick forward to Base site page using method 'action'  --%>
<form:form action="saveEmployee" modelAttribute="employee">

  Name <form:input path="name"/>
  <br><br>
  Surname <form:input path="surname"/>
  <br><br>
  Department <form:input path="department"/>
  <br><br>
  Salary <form:input path="salary"/>
  <br><br>


  <input type="submit" value="ok"/>

</form:form>


</body>
</html>
