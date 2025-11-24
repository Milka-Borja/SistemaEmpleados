public class EmpleadoMedioTiempo extends Empleados {
    private double  pagoPorHora;
    public EmpleadoMedioTiempo(int codigo, String nombre, String apellido, String cargo, double sueldoBase,double pagoPorHora) throws DatoInvalido {
        super(codigo,nombre,apellido,cargo,sueldoBase);
        if(pagoPorHora<0){
            throw new DatoInvalido("El pago por horas no puede ser negativo.");
        }
        this.pagoPorHora = pagoPorHora;
    }
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) throws DatoInvalido {
        if(pagoPorHora<0){
            throw new DatoInvalido("El pago por horas no puede ser negativo.");
        }
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public void mostrar() {
        System.out.println("----- Empleado tiempo completo -----");
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nombre:  "+getNombre());
        System.out.println("Apellido:  "+getApellido());
        System.out.println("Cargo:  "+getCargo());
        System.out.println("Sueldo Base: "+getSueldoBase());
        System.out.println("Pago por Hora: "+getPagoPorHora());
    }
}