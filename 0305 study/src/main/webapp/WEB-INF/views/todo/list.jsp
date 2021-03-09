<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<body>

${page }

${todo }

<ul>

<c:forEach items="${list }" var="todoDTO">
<li>${todoDTO}</li>

</c:forEach>
</ul>

</body>

<script>

const msg = '${msg}'

if(msg === 'success'){
	alert("성공")
}
</script>

