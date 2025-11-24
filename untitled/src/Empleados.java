public abstract  class Empleados {
    private int codigo;
    private String nombre;
    private String apellido;
    private String cargo;
    private double sueldoBase;

    public Empleados(int codigo, String nombre, String apellido, String cargo, double sueldoBase) throws DatoInvalido {
        if(nombre==null||nombre.trim().isEmpty()){
            throw new DatoInvalido("Nombre vacio");
        }
        if(apellido==null||apellido.trim().isEmpty()){
            throw new DatoInvalido("Apellido vacio");
        }
        if(cargo==null||cargo.trim().isEmpty()){
            throw new DatoInvalido("Cargo vacio");
        }
        if(sueldoBase<0){
            System.out.println("El sueldo es negativo");
        }
        this.codigo=codigo;
        this.nombre=nombre.trim();
        this.apellido=apellido.trim();
        this.cargo=cargo.trim();
        this.sueldoBase=sueldoBase;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
       return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNombre(String nombre) throws DatoInvalido{
        if(nombre==null||nombre.trim().isEmpty()){
            throw new DatoInvalido("Nombre vacio");
        }
        this.nombre = nombre.trim();
    }
    public void setApellido(String apellido) throws DatoInvalido{
        if(apellido==null||apellido.trim().isEmpty()){
            throw new DatoInvalido("Apellido vacio");
        }
        this.apellido = apellido.trim();
    }
    public void setCargo(String cargo) throws DatoInvalido{
        if(cargo==null||cargo.trim().isEmpty()){
            throw new DatoInvalido("Cargo vacio");
        }
        this.cargo = cargo.trim();
    }
    public void setSueldoBase(double sueldoBase) throws DatoInvalido{
        if(sueldoBase<0){
            System.out.println("El sueldo es negativo");
        }
        this.sueldoBase = sueldoBase;
    }
    public abstract  void mostrar();


}
