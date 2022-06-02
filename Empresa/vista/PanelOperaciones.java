package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton btCalcularSalario;
    public JButton btCalcularEdad;
    public JButton btCalcularAntiguedad;
    public JButton btBorrar;
    public JButton btSalir;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        btCalcularSalario = new JButton("Salario");
        btCalcularSalario.setFont(new Font("Arial", BOLD, 12));
        btCalcularSalario.setBounds(30,20,75,30);
        add(btCalcularSalario);
        btCalcularSalario.setActionCommand("Salario");
        
        btCalcularEdad = new JButton("Edad");
        btCalcularEdad.setFont(new Font("Arial", BOLD, 12));
        btCalcularEdad.setBounds(140,20,75,30);
        add(btCalcularEdad);
        btCalcularEdad.setActionCommand("Edad");
        
        btCalcularAntiguedad = new JButton("Antiguedad");
        btCalcularAntiguedad.setFont(new Font("Arial", BOLD, 12));
        btCalcularAntiguedad.setBounds(250,20,75,30);
        add(btCalcularAntiguedad);
        btCalcularAntiguedad.setActionCommand("Antiguedad");

        //Crear y agrear boton Borrar
        btBorrar = new JButton("Borrar");
        btCalcularAntiguedad.setFont(new Font("Arial", BOLD, 12));
        btBorrar.setBounds(360, 20, 75, 30);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        //Crear y agrear boton Salir
        btSalir = new JButton("Salir");
        btCalcularAntiguedad.setFont(new Font("Arial", BOLD, 12));
        btSalir.setBounds(470, 20, 75, 30);
        this.add(btSalir);
        btSalir.setActionCommand("salir");
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btCalcularSalario.addActionListener(pAL);
        btCalcularEdad.addActionListener(pAL);
        btCalcularAntiguedad.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
    
    public void activarBotones()
    {
        btCalcularSalario.setEnabled(true);
        btCalcularEdad.setEnabled(true);
        btCalcularAntiguedad.setEnabled(true);
        btBorrar.setEnabled(true);
        btSalir.setEnabled(true);
    }
}