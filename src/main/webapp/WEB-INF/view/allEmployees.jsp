<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!Doctype html>
<html>
<body>

<h3>All Employees</h3>
<br>

<%--Table names of Columns--%>
<table>
  <tr>
    <th>Name</th>
    <th>Surname</th>
    <th>Department</th>
    <th>Salary</th>
  </tr>

  <%--Emp = Object from Emploee with fields = conection by @Annotions--%>
  <%--allEmps = Model links where saving all about our Object Emploee --%>
  <c:forEach var="emp" items="${allEmps}">

    <tr>
      <td>${emp.name}</td>
      <td>${emp.surname}</td>
      <td>${emp.department}</td>
      <td>${emp.salary}</td>
    </tr>

  </c:forEach>

</table>

</body>
</html>