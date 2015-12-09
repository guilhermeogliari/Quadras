<%-- 
    Document   : principal
    Created on : 04/12/2015, 10:35:21
    Author     : fcolchete
--%>

<%@page import="Model.Usuario"%>
<%@page import="Control.UsuarioController"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%
    Usuario user = new Usuario();
    user.setId(Integer.parseInt(request.getParameter("id")));
    UsuarioController usuario = new UsuarioController();
    user = usuario.localizar(user);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript"
        src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript"
        src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <link
            href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
            rel="stylesheet" type="text/css">

        <link href="https://bootswatch.com/cosmo/bootstrap.min.css"
              rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <title>Benvindo ao Quadras!!</title>
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse"
                            data-target="#navbar-ex-collapse">
                        <span class="sr-only">Toggle navigation</span> <span
                            class="icon-bar"></span> <span class="icon-bar"></span> <span
                            class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#"><span>Quadras</span></a>
                </div>
                <div>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="index.jsp">Sair</a></li>
                    </ul>
                </div>
            </div>
        </div>
    <body>

        <div class="section">
            <div class="container">
                <div class="row">
                    <div>
                    <h1 class ="text-center">Editar Usuário</h1>
                    </div>
                    <form class = "form-horizontal" role = "form" id="editUsuario" name="editUsuario" action="EditarUser">
                        <div class="form-group col-md-12">
                            <div class="jumbotron">
                                <label for="Nome" class="control-label">Nome</label>
                                <input class = "form-control"  type="text" name="Nome" value="<%out.println(user.getNome());%>" size="20"/>
                                <label for="cpf" class="control-label">CPF</label>
                                <input class = "form-control"  type="text" name="cpf" value="<%out.println(user.getCpf());%>" size="11"/>
                                <label for="idade" class="control-label">Idade</label>
                                <input class = "form-control"  type="text" name="idade" value="<%out.println(user.getIdade());%>" size="20"/>
                                <input class = "form-control"  type="hidden" name="pontos" value="<%out.println(user.getPontos());%>" size="20"/>
                                <input class = "form-control"  type="hidden" name="id" value="<%out.println(user.getId());%>" size="20"/>
                                <input class = "form-control"  type="hidden" name="senha" value="<%out.println(user.getSenha());%>" size="20"/>
                            </div>
                        </div>
                            <div class="form-group">
                                <div class="col-lg-offset-2">
                                    <button type="submit" value="Enviar" name="Salvar"
                                            class="btn btn-primary">Salvar</button>
                                    <button type="reset" class="btn btn-danger">Voltar</button>
                                </div>
                            </div>

                    </form>
                </div>
            </div>
        </div>

        <%
            //out.println(request.getParameter("id"));
        %>

    </body>
</html>
