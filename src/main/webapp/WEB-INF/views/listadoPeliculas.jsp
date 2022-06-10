<%--
  Created by IntelliJ IDEA.
  User: brian
  Date: 08-06-22
  Time: 00:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>

<main>
    <h1>Listado de Películas</h1>
    <div class="row pb-2 justify-content-end">
        <div class="col">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/peliculas/new"><i
                class="fa-solid fa-circle-plus"></i> Crear nueva Pelicula</a>
        </div>
    </div>
    <table id="films" class="table">
        <thead class="table-dark">
        <tr>
            <th>Id</th>
            <th>Titulo</th>
            <th>Descripción</th>
            <th>Año</th>
            <th>Rating</th>
            <th>Acciones</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="p" items="${films}">
            <tr>
                <th><c:out value="${p.getFilm_id()}"></c:out></th>
                <td><c:out value="${p.getTitle()}"></c:out></td>
                <td><c:out value="${p.getDescription()}"></c:out></td>
                <td><c:out value="${p.getRelease_year()}"></c:out></td>
                <td><c:out value="${p.getRating()}"></c:out></td>
                <td>
                    <a href="${pageContext.request.contextPath}/peliculas/${p.getFilm_id()}" title="Editar Película"><i
                            class="fa-solid fa-pen-to-square"></i></a>
                    <a href="${pageContext.request.contextPath}/peliculas/del/${p.getFilm_id()}" title="Borrar Película"><i
                            class="fa-solid fa-trash-can"></i></a>
                    <a href="${pageContext.request.contextPath}/actoresPelicula/${p.getFilm_id()}" title="Ver Actores">
                        <i class="fa-solid fa-user-group"></i></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</main>

<script type="text/javascript" src="${pageContext.request.contextPath}/res/js/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css">
<script type="text/javascript" src="http://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>

<script>
    $(document).ready(function () {
        $("#films").DataTable();
    })
</script>

<%@include file="footer.jsp" %>