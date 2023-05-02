<!DOCTYPE html>
<%@page import="java.util.*, model.*, java.sql.*" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    AtaqueDAO dao = new AtaqueDAO();
    List<Ataque> ataques = dao.buscarAtaque(id, "");
%>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <div>
        <h2><%=ataques.get(0).getNome()%></h2>
        <p>TM: <%=ataques.get(0).getTm()%></p>
        <p>Tipo: <%=ataques.get(0).getTipo()%></p>
        <p>Categoria: <%=ataques.get(0).getCategoria()%></p>
        <p><%=ataques.get(0).getEfeito()%></p>
        <p>Dano: <%=ataques.get(0).getDano()%></p>
        <p>PP: <%=ataques.get(0).getPp()%></p>
        <p>Precisão do Ataque: <%=ataques.get(0).getPrecisao()%>%</p>
        <button><a href="ataque.jsp">Voltar</a></button>
    </div>
</body>
</html>