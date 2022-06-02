package modelo;
public class Empleados 
{
    //----------
    // Atributos
    //-----------
    
    public static int SALARIO_MINIMO = 1000000;
    public static int AUXILIO_TRANSPORTE = 117172;
    private String nombre;
    private int valorHora;
    private int horasTrabajadas;
    private int fechaNacimiento;
    private int fechaIngreso;
    private int salario;
    private int edad;
    private int antiguedad;
    
    //---------
    // Metodos
    //---------

    //Constructor
    public Empleados(String pNombre, int nHorasTrabajadas, int pFechaIngreso, int pFechaNacimiento, int nValorHora)
    {
        this.nombre = pNombre;
        this.horasTrabajadas = nHorasTrabajadas;
        this.fechaIngreso = pFechaIngreso;
        this.fechaNacimiento = pFechaNacimiento;
        this.valorHora = nValorHora;
    }

    public static int getSalarioMinimo()
    {
        return SALARIO_MINIMO;
    }

    public static int getAuxilioTransporte()
    {
        return AUXILIO_TRANSPORTE;
    }

    public int getValorHora()
    {
        return this.valorHora;
    }

    public void setValorHora(int nValorHora) 
    {
        this.valorHora = nValorHora;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String pNombre) 
    {
        this.nombre = pNombre;
    }

    public int getHorasTrabajadas()
    {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(int nHorasTrabajadas)
    {
        this.horasTrabajadas = nHorasTrabajadas;
    }

    public int getFechaIngreso()
    {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(int pFechaIngreso)
    {
        this.fechaIngreso = pFechaIngreso;
    }

    public int getFechaNacimiento()
    {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(int pFechaNacimiento)
    {
        this.fechaNacimiento = pFechaNacimiento;
    }

    public int getSalario()
    {
        return this.salario;
    }

    public void setSalario(int nSalario)
    {
        this.salario = nSalario;
    }

    public int getAntiguedad()
    {
        return antiguedad;
    }

    public void setAntiguedad(int nAntiguedad)
    {
        this.antiguedad = nAntiguedad;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int nEdad)
    {
        this.edad = nEdad;
    }
    
    public void calcularSalario()
    {
        setSalario(getSalario() + getHorasTrabajadas()*getValorHora());
        if(getSalario() < 2*getSalarioMinimo())
        {
            setSalario(getSalario() + getAuxilioTransporte());
        }
    }

    public void calcularEdad()
    {
        setEdad(getEdad() + 2022 - getFechaNacimiento());
    }

    public void calcularAntiguedad()
    {
        setAntiguedad(getAntiguedad() + 2022 - getFechaIngreso());
    }

    public String toString()
    {
        return "";
    }
}