<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>API-POKÉDEX</title>
</head>
<body>
    <h1>Cadastrar Ataque</h1>
    <form action="teste.jsp" method="post">
        <div>
            <label for="">Número do TM:</label>
            <input type="number"  name="numero_tm" id="numero_tm">
        </div>
        <div>
            <label for="">Nome:</label>
            <input type="text"  name="nome" id="nome">
        </div>
        <div>
            <label for="">Tipo</label>
            <select name="tipo" id="tipo">
                <option value="" selected>Nenhum</option>
                <option value="agua">Água</option>
                <option value="normal">Normal</option>
            </select>
        </div>
        <div>
            <label for="">Efeito:</label>
            <input type="text"  name="efeito" id="efeito">
        </div>
        <div>
            <label for="">Categoria</label>
            <select name="categoria" id="categoria">
                <option value="" selected>Nenhum</option>
                <option value="physical">Physical</option>
                <option value="special">Special</option>
            </select>
        </div>
        <div>
            <label for="">Dano:</label>
            <input type="number"  name="dano" id="dano">
        </div>
        <div>
            <label for="">Quantidade PP:</label>
            <input type="number"  name="pp" id="pp">
        </div>
        <div>
            <label for="">Precisão do Ataque:</label>
            <input type="number"  name="precisao_ataque" id="precisao_ataque">
        </div>
        <div>
            <button type="submit">Cadastrar</button>
            <button><a href="ataque.jsp">Voltar</a></button>
        </div>
    </form>
</body>
</html>