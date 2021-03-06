<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TODO ADD</title>
</head>
<body>

	<form action="/todo/add" method="post">
		<div>
			<input type="text" name="title">
			<spring:hasBindErrors name="todoDTO">
	<c:if test="${errors.hasFieldErrors('title') }">
	<strong>Error.....Title...... ${errors.getFieldError( 'title' ).defaultMessage }</strong>
	</c:if>
	</spring:hasBindErrors>
			
			<button class="btn">submit</button>
		</div>
	</form>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"
		integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
		crossorigin="anonymous"></script>

	<script>
		$(document).ready(function() {
			$('.btn').on("click", function(e) {
				e.preventDefault();
				$("form").submit();
			})

		})
	</script>

</body>
</html>