<%@page import="java.util.*, model.*, java.sql.*"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>API-Pokedex</title>
</head>
<body>
    <h1>Ataques</h1>
    <div>
        <a href="cadastrar_ataque.jsp"><button>Cadastrar</button></a>
        <a href="../menu.jsp"><button>Voltar</button></a>
    </div>
    <div>
        <h2>Lista de Ataques</h2>
        <div>
            <ul>
               <%AtaqueDAO dao = new AtaqueDAO();%>
                <%List<Ataque> ataques = dao.retornarAtaques();%>
                <%for(Ataque ataque: ataques){
                %><a href="consultar_ataque.jsp?id=<%=ataque.getId()%>"><li><%=ataque.getNome()%></li></a> 
                 <%}%> 
            </ul>
        </div>
    </div>
</body>
</html>