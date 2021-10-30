 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="<c:url value="/formNovaEmpresa.jsp" />">Cadastro</a><br/>
Lista de empresas:
	<ul>
	<c:forEach items="${empresas}" var="empresa">
		<li>
			${empresa.nome } - <fmt:formatDate pattern="dd/MM/yyyy" value="${empresa.dataAbertura}"/>
			<a href="<c:url value="/entrada?acao=MostraEmpresa&id=${empresa.id}"/>">Editar</a>
			<a href="<c:url value="/entrada?acao=RemoveEmpresa&id=${empresa.id}"/>">Remover</a>
			
		</li>
	</c:forEach>
	</ul>
</body>
</html>