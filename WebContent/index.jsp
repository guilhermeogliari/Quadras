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


        <title>Quadras</title>
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
                <!--<div class="collapse navbar-collapse" id="navbar-ex-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#">Contato</a></li>
                    </ul>
                </div>-->
                
            </div>
        </div>

        <!--<div class="alert alert-dismissible alert-info" id="mensagem" style="display: block" fade in>
            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
            teste
        </div> -->

        <div class="section">
            <div class="container">
                <div class="row">
                    <form class="form-horizontal" role="form" id="form1"
                          name="autentica" action="Autenticar">
                        <div class="form-group">
                            <div class="col-md-12">
                                <h1 class="text-center">Log In</h1>
                            </div>
                        </div>
                        <div class="jumbotron">
                            <div class="form-group">
                                <label for="usuario" class="col-lg-2 control-label">Usuário</label>
                                <div class="col-lg-10">
                                    <input id="usuario" class="form-control" type="text" name="usuario"
                                           value="" size="20" placeholder="Digite seu usuario" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="senha" class="col-lg-2 control-label">Senha</label>
                                <div class="col-lg-10">
                                    <input id="senha" type="password" name="senha"
                                           class="form-control" value="" size="20"
                                           placeholder="Digite sua senha" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-lg-10 col-lg-offset-2">
                                    <button type="submit" value="Enviar" name="Login"
                                            class="btn btn-primary">Entrar</button>
                                    <button type="reset" class="btn btn-warning">Cancel</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>