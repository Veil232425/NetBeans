<%@page import="java.util.List"%>
<%@page import="ws.Profesor"%>
<%@page import="Modelo.ProfesorService" %>
<%
    ProfesorService Obj = new ProfesorService();
    List<Profesor> filas = Obj.listar();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <title>Listado</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header text-white">
                    <a href=Controlador?accion=add class="btn btn-success">Nuevo Registro</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>IdProfesor</th>
                                <th>Nombres</th>
                                <th>Apellidos</th>
                                <th>Edad</th>
                                <th>DNI</th>
                                <th>Género</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% for(Profesor f:filas){ %>
                            <tr>
                                <td><%=f.getIdProfesor()%></td>
                                <td><%=f.getNombres()%></td>
                                <td><%=f.getApellidos()%></td>
                                <td><%=f.getEdad()%></td>
                                <td><%=f.getDni()%></td>
                                 <td><%=f.getGenero()%></td>
                                <td>
                                    <a href=Controlador?accion=edit&id=<%=f.getIdProfesor()%> class="btn btn-warning">Editar</a>
                                    <a href=Controlador?accion=del&id=<%=f.getIdProfesor()%> class="btn btn-danger">Borrar</a>
                                </td>
                            </tr>
                            <% } %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
