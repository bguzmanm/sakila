<%--
  Created by IntelliJ IDEA.
  User: brian
  Date: 09-06-22
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>

<main>
    <h1>Listado de Actores
        <c:if test="${not empty pelicula}">
            <c:out value="${pelicula.getTitle()}"></c:out>
        </c:if>
    </h1>
    <div class="row pb-2 justify-content-end">
        <table id="actors" class="table">
            <thead class="table-dark">
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Acciones</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${actores}" var="a">
                <tr>
                    <th><c:out value="${a.getActor_id()}"></c:out></th>
                    <td><c:out value="${a.getFirst_name()}"></c:out></td>
                    <td><c:out value="${a.getLast_name()}"></c:out></td>
                    <td><a href="${pageContext.request.contextPath}/peliculas/actor/<c:out value="${a.getActor_id()}"></c:out>" alt="Ver Peliculas"><i class="fa-solid fa-film"></i></a></td>
                </tr>

            </c:forEach>
            </tbody>
        </table>
    </div>

</main>


<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css">
<script type="text/javascript" src="http://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>

<script>
    $(document).ready(function () {
        $("#actors").DataTable();
    })
</script>

<%@include file="footer.jsp" %>
