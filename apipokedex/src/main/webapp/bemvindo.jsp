<%@page import="java.util.*, model.*, java.sql.*"%>

<html>
    <head>
   
    </head>
    <body>
        <%-- coment�rio em JSP aqui: nossa primeira p�gina JSP --%>
        
        <% String mensagem  = "Bem vindo ao sistema de Ol� Mundo!"; %>
        <% out.println(mensagem); %>
        <br/>

        <% System.out.println("Teu tudo certo!"); %>
	<%AtaqueDAO dao = new AtaqueDAO();%>
        <%List<Ataque> ataques = dao.retornarAtaques();%>
        <%for(Ataque ataque: ataques){
           %><div><%=ataque.getNome()%></div> 
         <%}%>
    </body>
</html>