package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Empleados;
import vista.VentanaPrincipal;

public class controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Empleados model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public controlador(VentanaPrincipal pVenPrin, Empleados pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("Salario"))
        {  
            model.getSalario();
            venPrin.miPanelResultados.mostrarResultado("\nTras digitar sud horas trabajadas, su salario es: ");
            venPrin.miPanelResultados.mostrarResultado2(model.getSalario());

        }
        
        if(comando.equals("Edad"))
        {
            model.getEdad();
            venPrin.miPanelResultados.mostrarResultado("\nTras digitar su fecha de nacimiento, su edad es: ");
            venPrin.miPanelResultados.mostrarResultado2(model.getEdad());
        }
        
        if(comando.equals("Antiguedad"))
        {
            model.getAntiguedad();
            venPrin.miPanelResultados.mostrarResultado("\nTras digitar su ingreso a esta empresa, su antiguedad es: ");
            venPrin.miPanelResultados.mostrarResultado2(model.getAntiguedad());
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
        
        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultados.borrar();
        }
    }
}   