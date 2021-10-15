<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Cadastro de nova empresa</title>
</head>
<body>
<form action="<c:url value="/novaEmpresa"/>" method="post">
	Nome: <input type="text" name="nome" />
	Data de Abertura: <input type="text" name="data"/>
	<button type="submit">Cadastrar</button>
</form>
<br/> <a href="<c:url value="/listaEmpresas" />">Voltar</a>
</body>
</html>