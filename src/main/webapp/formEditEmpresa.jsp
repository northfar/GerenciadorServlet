<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Cadastro de nova empresa</title>
</head>
<body>
<form action="<c:url value="/editEmpresa?id=${empresa.id} "/>" method="post">
	Nome: <input type="text" name="nome" value="${empresa.nome}"/>
	Data de Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />"/>
	<button type="submit">Cadastrar</button>
</form>

<br/> <a href="<c:url value="/listaEmpresas" />">Voltar</a>
</body>
</html>