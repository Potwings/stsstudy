<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<body>

<div class="insert">
<h1>insert</h1>
</div>



<table class="table">
	<thead>
		<tr>
			<th scope="col">tno</th>
			<th scope="col">Title</th>
			<th scope="col">Complete</th>
			<th scope="col">regdate</th>
		</tr>
	</thead>
	
	
	<tbody>
	<c:forEach items="${todos }" var="todo" >
		<tr>
			<th scope="row">${todo.tno }</th>
			<td>${todo.title }</td>
			<td>${todo.complete }</td>
			<td><%-- ${todo.regdate } --%></td>
		</tr>
		</c:forEach>
	</tbody>
</table>

</body>

<script>
const msg = '${param.msg}'
if(msg === 'success'){
	alert("성공")
}
</script>

<script>

    $(document).ready(function(){
        const insert = $(".insert > h1");

        insert.on("click",function(){
        	
        	self.location ="/todo/add"
   
        })

    })
</script>