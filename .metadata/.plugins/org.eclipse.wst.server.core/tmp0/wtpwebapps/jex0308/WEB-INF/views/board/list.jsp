<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../includes/header.jsp"%>

<table class="table">
  <thead>
    <tr>
      <th scope="col">bno</th>
      <th scope="col">Title</th>
      <th scope="col">Content</th>
      <th scope="col">Writer</th>
    </tr>
  </thead>
  
  <c:forEach items="${list }" var="board">
  <tbody>
    <tr>
      <th scope="row">${board.bno }</th>
      <td>${board.title }</td>
      <td>${board.content }</td>
      <td>${board.writer }</td>
    </tr>
  </tbody>
  </c:forEach>
  
</table>


<%@ include file="../includes/footer.jsp"%>