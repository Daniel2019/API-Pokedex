<!DOCTYPE html>
<%@page import="java.util.*, model.*, java.sql.*" %>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    HabilidadeDAO dao = new HabilidadeDAO();
    List<Habilidade> habilidades = dao.buscarHabilidade(id, "", "");
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
       <h2><%=habilidades.get(0).getNome()%></h2>
       <p><%=habilidades.get(0).getDescricao()%></p>
       <button><a href="habilidade.jsp">Voltar</a></button>
    </div>
</body>
</html>