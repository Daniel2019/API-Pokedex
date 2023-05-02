<%@page import="java.util.*, model.*, java.sql.*" %>
<%
    Ataque ataque = new Ataque();
    
    ataque.setTm(Integer.parseInt(request.getParameter("numero_tm")));
    ataque.setNome(request.getParameter("nome"));
    ataque.setTipo(request.getParameter("tipo"));
    ataque.setEfeito(request.getParameter("efeito"));
    ataque.setCategoria(request.getParameter("categoria"));
    ataque.setDano(Integer.parseInt(request.getParameter("dano")));
    ataque.setPp(Integer.parseInt(request.getParameter("pp")));
    ataque.setPrecisao(Integer.parseInt(request.getParameter("precisao_ataque")));
    
//    AtaqueDAO dao = new AtaqueDAO();
//    dao.adicionarAtaque(ataque);
%>
<%=ataque.toString()%>