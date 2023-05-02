<%@page import="java.util.*, model.*, java.sql.*" %>
<%
    Habilidade habilidade = new Habilidade();
    habilidade.setNome(request.getParameter("nome"));
    habilidade.setDescricao(request.getParameter("descricao"));
    
    HabilidadeDAO dao = new HabilidadeDAO();
    dao.adicionarHabilidade(habilidade);
%>
