package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    
    //Identificacion, Nombre, Horastrabajadas.
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JLabel lbNombre;
    private JLabel lbHorasTrabajadas;
    private JLabel lbFechaNacimiento;
    private JLabel lbFechaIngreso;
    private JLabel lbValorHora;
    private JTextField tfNombre;
    private JTextField tfHorasTrabajadas;
    private JTextField tfFechaNacimiento;
    private JTextField tfFechaIngreso;
    private JTextField tfValorHora;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/Empresa.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas nombre, horas trabajadas, fecha de nacimiento y fecha de ingreso
        lbNombre = new JLabel("Nombre y apellidos = ");
        lbNombre.setBounds(230,20,200,30);
        add(lbNombre);
        
        lbHorasTrabajadas = new JLabel("Horas Trabajadas =");
        lbHorasTrabajadas.setBounds(230,50,200,30);
        add(lbHorasTrabajadas);
        
        lbFechaNacimiento = new JLabel("Fecha Nacimiento =");
        lbFechaNacimiento.setBounds(230,80,200,30);
        add(lbFechaNacimiento);

        lbFechaIngreso = new JLabel("Fecha Ingreso =");
        lbFechaIngreso.setBounds(230,110,200,30);
        add(lbFechaIngreso);

        lbValorHora = new JLabel("Valor Hora =");
        lbValorHora.setBounds(230,140,200,30);
        add(lbValorHora);
        
        
        //Creación y adición de campos de texto
        tfNombre = new JTextField();
        tfNombre.setBounds(400, 20, 120, 30);
        add(tfNombre);
        
        tfHorasTrabajadas = new JTextField();
        tfHorasTrabajadas.setBounds(400, 50, 120, 30);
        add(tfHorasTrabajadas);
        
        tfFechaNacimiento = new JTextField();
        tfFechaNacimiento.setBounds(400, 80, 120, 30);
        add(tfFechaNacimiento);

        tfFechaIngreso = new JTextField();
        tfFechaIngreso.setBounds(400, 110, 120, 30);
        add(tfFechaIngreso);

        tfValorHora = new JTextField();
        tfValorHora.setBounds(400, 140, 120, 30);
        add(tfValorHora);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNombre()
    {
        return tfNombre.getText();
    }
    
    public String getHorasTrabajadas()
    {
        return tfHorasTrabajadas.getText();
    }
    
    public String getFechaNacimiento()
    {
        return tfFechaNacimiento.getText();
    }

    public String getFechaIngreso()
    {
        return tfFechaIngreso.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNombre.setText("");
        tfHorasTrabajadas.setText("");
        tfFechaNacimiento.setText("");
        tfFechaIngreso.setText("");
    }

    public String calcularEdad() {
        return null;
    }

    public String calcularAntiguedad() {
        return null;
    }

    public String calcularSalario() {
        return null;
    }
}