package Modelo;

import ws.Profesor;

public class ProfesorService {

    public ProfesorService() {
    }

    public String agregar(java.lang.String p1, java.lang.String p2, int p3, int p4,java.lang.String p5) {
        ws.Servicios_Service service = new ws.Servicios_Service();
        ws.Servicios port = service.getServiciosPort();
        return port.agregar(p1, p2, p3,p4,p5);
    }
    
    public Profesor buscar(int p1) {
        ws.Servicios_Service service = new ws.Servicios_Service();
        ws.Servicios port = service.getServiciosPort();
        return port.buscar(p1);
    }
    
    public String editar(int p1, java.lang.String p2, java.lang.String p3, int p4,int p5,java.lang.String p6) {
        ws.Servicios_Service service = new ws.Servicios_Service();
        ws.Servicios port = service.getServiciosPort();
        return port.editar(p1, p2, p3, p4,p5,p6);
    }

    public java.util.List<ws.Profesor> listar() {
        ws.Servicios_Service service = new ws.Servicios_Service();
        ws.Servicios port = service.getServiciosPort();
        return port.listar();
    }

    public int suprimir(int p1) {
        ws.Servicios_Service service = new ws.Servicios_Service();
        ws.Servicios port = service.getServiciosPort();
        return port.suprimir(p1);
    }

}
