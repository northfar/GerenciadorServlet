 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
	<c:forEach items="${empresas}" var="empresa">
		<li>${empresa.nome } - <fmt:formatDate pattern="dd/MM/yyyy" value="${empresa.dataAbertura}"/></li>
	</c:forEach>
	</ul>
</body>
</html>