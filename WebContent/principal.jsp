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

        <div class="alert alert-dismissible alert-success">
            <button type="button" class="close" data-dismiss="alert"></button>
            <strong>Bem-vindo Usuário: <% out.println(request.getSession().getAttribute("login"));%> </strong>
        </div>

        <ul class="nav nav-tabs">
            <li><a href="#Reserva" data-toggle="tab">Dados da Reserva</a></li>
            <li><a href="#Time" data-toggle="tab">Time</a></li>
            <li><a href="#Atividades" data-toggle="tab">Atividades</a></li>
                <%
                    if (request.getSession().getAttribute("login").equals("Admin")) {
                        out.println("<li>");
                        out.println("<a href='#Configs' data-toggle='tab'>Configurações</a></li>");
                    }
                %>
            <!--<li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    Dropdown <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#dropdown1" data-toggle="tab">Action</a></li>
                    <li class="divider"></li>
                    <li><a href="#dropdown2" data-toggle="tab">Another action</a></li>
                </ul>
            </li>-->
        </ul>
        <div id="myTabContent" class="tab-content">
            <div class="tab-pane fade active in" id="Reserva">
                <p>Aqui vão os dados das Reservas</p>
            </div>
            <div class="tab-pane fade" id="Time">
                <p>Aqui vão os dados dos times do usuário</p>
            </div>
            <!--<div class="tab-pane fade" id="dropdown1">
                <p>Aqui vão os dados das Atividades das partidas do Usuário</p>
            </div>-->
            <div class="tab-pane fade" id="Atividades">
                <p>Aqui vão os dados das Atividades das partidas do Usuário</p>
            </div>
            <div class="tab-pane fade" id="Configs">
                <div class="col-md-6">
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            <h3 class="panel-title">Configurações Gerais</h3>
                        </div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            <h3 class="panel-title">Configurações de Usuários</h3>
                        </div>
                        <div class="panel-body">
                            <table class='table table-striped table-hover' border='1'>
                                <thead>
                                <tr class='info'>
                                    <th>Usuários Cadastrados</th>
                                    <th>Ação</th>
                                </thead>
                                <tbody>
                                <%
                                    ArrayList<Usuario> lista = new ArrayList();
                                    UsuarioController users = new UsuarioController();
                                    lista = users.consultar();
                                    for (int f = 0; f < lista.size(); f++) {
                                        out.println("<td>" + lista.get(f).getNome() + "</td>");
                                        out.println("<th>");
                                        out.println("<a href='#'>Editar</a>");
                                        out.println("</th>");
                                    }
                                %>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>