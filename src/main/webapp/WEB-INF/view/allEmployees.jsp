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
        <th>Operations</th>
    </tr>

    <%--Emp = Object from Emploee with fields = conection by @Annotions--%>
    <%--allEmps = Model links where saving all about our Object Emploee --%>
    <c:forEach var="emp" items="${allEmps}">

        <%--        Call Сontroller method name 'value'--%>
        <%--        Param passing to Method Request parametrsc of ID =2= --%>
        <%--        LAGGG value="/updateInfo"> mark as RED --%>
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empID" value="${emp.id}"/>
        </c:url>

        <%--        Link for calling Сontroller method name 'value'--%>
        <%--        =2= of <c:forEach var="emp" --%>
        <%--        LAGGG value="/deleteEmploee"> mark as RED --%>
        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="empID" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                    <%--nClick activate updateButton -> method "/updateInfo" --%>
                <input type="button" value="Update"
                       onclick="window.location.href='${updateButton}'"/>

                    <%--nClick activate deleteButton -> method "/deleteEmploee" --%>
                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>

</table>

<br>
<%--Add button that onClick forward to another View by calling method 'href'--%>
<input type="button" value="Add"
       onclick="window.location.href='addNewEmployee'"/>

</body>
</html>