<%--
  Created by IntelliJ IDEA.
  User: brian
  Date: 08-06-22
  Time: 00:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp"%>

    <main>
        <h1>Listado de Películas</h1>


        <table class="table">
            <thead class="table-dark">
            <tr>
                <th>Id</th>
                <th>Titulo</th>
                <th>Descripción</th>
                <th>Año</th>
                <th>Rating</th>
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
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </main>

<%@include file="footer.jsp"%>