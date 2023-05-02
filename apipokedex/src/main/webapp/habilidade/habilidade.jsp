<%@page import="java.util.*, model.*, java.sql.*" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>API-Pokedex</title>
</head>
<body>
    <h1>Habilidade</h1>
    <div>
        <a href="cadastrar_habilidade.jsp"><button>Cadastrar</button></a>
        <a href="../menu.jsp"><button>Voltar</button></a>
    </div>
    <div>
        <h2>Lista de Habilidades</h2>
        <div>
            <ul>
                <% HabilidadeDAO dao = new HabilidadeDAO();
                List<Habilidade> habilidades = dao.retornarHablilidades();
                for(Habilidade habilidade: habilidades){%>
                    <a href="consultar_habilidade.jsp?id=<%=habilidade.getId()%>"><li><%=habilidade.getNome()%></li></a>
                <%}%>
            </ul>
        </div>
    </div>
</body>
</html>