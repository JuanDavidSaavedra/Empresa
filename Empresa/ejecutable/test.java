package ejecutable;

import controlador.controlador;
import modelo.Empleados;
import vista.VentanaPrincipal;

public class test
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Empleados miEmpleados = null;
        controlador miControlador = new controlador(miVentana, miEmpleados);
    }
    
}