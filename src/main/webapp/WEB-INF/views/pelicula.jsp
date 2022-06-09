<%--
  Created by IntelliJ IDEA.
  User: brian
  Date: 08-06-22
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="header.jsp"%>
<main>
  <h1>${pelicula.getTitle()}</h1>

  <form class="form-container" action="${pageContext.request.contextPath}/peliculas" method="post" name="edit">
    <input type="hidden" name="film_id" id="film_id" value="${pelicula.getFilm_id()}">
    <h2>Editar Película</h2>
    <div class="mb-3">
      <label for="title" class="form-label">Titulo</label>
      <input type="text" class="form-control" id="title" name="title" placeholder="Star Wars"
             value="${pelicula.getTitle()}">
    </div>
    <div class="mb-3">
      <label for="description" class="form-label">Descripción</label>
      <input type="text" class="form-control" id="description" name="description"
             placeholder="Darth Vader es el padre de Luck!" value="${pelicula.getDescription()}">
    </div>
    <div class="mb-3">
      <label for="release_year" class="form-label">Año de Lanzamiento</label>
      <input type="number" class="form-control" id="release_year" name="release_year" placeholder="2010"
             value="${pelicula.getRelease_year()}">
    </div>
    <div class="mb-3">
      <label for="rating" class="form-label">Censura</label>
      <select id="rating" class="form-select" name="rating">
          <option value="PG" ${pelicula.getRating() == "PG" ? 'selected': ''}>PG</option>
          <option value="G" ${pelicula.getRating() == "G" ? 'selected': ''}>G</option>
          <option value="NC-17" ${pelicula.getRating() == "NC-17" ? 'selected': ''}>NC-17</option>
          <option value="PG-13" ${pelicula.getRating() == "PG-13" ? 'selected': ''}>PG-13</option>
        <option value="R" ${pelicula.getRating() == "R" ? 'selected': ''}>R</option>
      </select>
    </div>
    <button class="btn btn-primary" type="submit">Guardar</button>
    <button class="btn btn-secondary" type="reset">Limpiar</button>
  </form>


</main>
<%@include file="footer.jsp"%>