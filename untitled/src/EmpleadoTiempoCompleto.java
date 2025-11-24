public class EmpleadoTiempoCompleto extends Empleados{
    private double  bonoAdicional;
    public EmpleadoTiempoCompleto(int codigo, String nombre, String apellido, String cargo, double sueldoBase,double bonoAdicional) throws DatoInvalido {
        super(codigo,nombre,apellido,cargo,sueldoBase);
        if(bonoAdicional<0){
            throw new DatoInvalido("El bono no puede ser negativo.");
        }
        this.bonoAdicional = bonoAdicional;
    }
    public double getBonoAdicional() {
        return bonoAdicional;
    }

    public void setBonoAdicional(double bonoAdicional) throws DatoInvalido {
        if(bonoAdicional<0){
            throw new DatoInvalido("El bono no puede ser negativo.");
        }
        this.bonoAdicional = bonoAdicional;
    }

    @Override
    public void mostrar() {
        System.out.println("----- Empleado tiempo completo -----");
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nombre:  "+getNombre());
        System.out.println("Apellido:  "+getApellido());
        System.out.println("Cargo:  "+getCargo());
        System.out.println("Sueldo Base: "+getSueldoBase());
        System.out.println("Bono Adicional: "+getBonoAdicional());
    }
}
