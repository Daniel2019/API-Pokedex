<%@page import="java.util.*, model.*, java.sql.*"%>

<html>
    <head>
   
    </head>
    <body>
        <%-- comentário em JSP aqui: nossa primeira página JSP --%>
        
        <% String mensagem  = "Bem vindo ao sistema de Olá Mundo!"; %>
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