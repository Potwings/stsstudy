<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>   
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<form action="/todo/add" method="post">
<div class="context">
<input type='text' name="title">
   <spring:hasBindErrors name="todoDTO">
	<c:if test="${errors.hasFieldErrors('title') }">
	<strong>Error.....Title...... ${errors.getFieldError( 'title' ).defaultMessage }</strong>
	</c:if>
	</spring:hasBindErrors>
<input type='text' name="complete">

<h1>submit</h1>
</div>
</form>


<iframe name='zero'></iframe>

<script>

function showResult(){
	alert("show result")
}


    $(document).ready(function () {
   	
        const insert = $(".context > h1");
        const title = $("input[ name = 'title']");
        const complete = $("input[ name = 'complete']");


        insert.on("click", function () {

        	
            
    $.post("/todo/add",
     {title: title.val(), complete: complete.val()},
     function(result){
    	 location.href="/todo/list";
     }
     
    ) 
            
         /*   var todo;
            todo.setAttribute("title", title.val())
            todo.setattribute("complete", complete.attr())
           
            todo.submit();

            $('form').submit */
        }) 
    })
</script>