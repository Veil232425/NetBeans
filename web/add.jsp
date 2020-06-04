<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <title>Registrar</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header text-white">
                    <h1>Nuevo Registro</h1>
                </div>
                <div class="card-body">
                    <form action="Controlador">
                        <label>IdProfesor</label>
                        <input type="text" value="auto" class="form-control" readonly="">
                        <label>Nombres</label>
                        <input type="text" name="txtNom" class="form-control">
                        <label>Apellidos</label>
                        <input type="text" name="txtApe" class="form-control">
                        <label>Edad</label>
                        <input type="text" name="txtEdad" class="form-control">
                        <label> DNI</label>
                        <input type="text" name="txtDni" class="form-control">
                        <label> Genero</label>
                        <input type="text" name="txtGenero" class="form-control">
                        <input type="submit" name="accion" value="Guardar">
                        <a href="Controlador?accion=index" class="btn btn-success">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
