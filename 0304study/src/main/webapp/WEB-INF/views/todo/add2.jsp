<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>   
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<h1>ADD2</h1>

<form action="/todo/add" method="post">
<div class="context">
<input type='text' name="title">
<input type='text' name="complete">

<h1>submit</h1>
</div>
</form>

<script>

    $(document).ready(function () {
   	
        const insert = $(".context > h1");
        const title = $("input[ name = 'title']");
        const complete = $("input[ name = 'complete']");


        insert.on("click", function () {
            
    $.post("/todo/add2",
     {title: title.val(), complete: complete.val()},
     function(result){
    	 location.href="/todo/list";
     }
     
    ) 
            
        }) 
    })
</script>