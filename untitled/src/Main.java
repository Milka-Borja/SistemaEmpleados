import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws DatoInvalido {
        ArrayList<Empleados> Emp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        while (opc != 5) {
            System.out.println("--- Menú de Empleados ---");
            System.out.println("1 - Registrar empleado tiempo completo");
            System.out.println("2 - Registrar empleados medio tiempo");
            System.out.println("3 - Mostrar empleados registrados");
            System.out.println("4 - Mostrar Estadisticas");
            System.out.println("5 - Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Opcion 1: Registrar empleado tiempo completo");
                    System.out.println("Código:");
                    int c = sc.nextInt();
                    System.out.println("Nombre:");
                    String n = sc.next();
                    System.out.println("Apellido:");
                    String a = sc.next();
                    System.out.println("Cargo:");
                    String ca = sc.next();
                    System.out.println("Sueldo base:");
                    double s = sc.nextDouble();
                    System.out.println("Bono Adicional:");
                    double b = sc.nextDouble();
                    Empleados ee = new EmpleadoTiempoCompleto(c, n, a, ca, s, b);
                    Emp.add(ee);
                    break;
                case 2:
                    System.out.println("Opcion 2: Registrar empleado medio tiempo");
                    System.out.println("Código:");
                    int codig = sc.nextInt();
                    System.out.println("Nombre:");
                    String nombr = sc.next();
                    System.out.println("Apellido:");
                    String apellid = sc.next();
                    System.out.println("Cargo:");
                    String carg = sc.next();
                    System.out.println("Sueldo base:");
                    double sueldoBas = sc.nextDouble();
                    System.out.println("Pago por Hora:");
                    double hora = sc.nextDouble();
                    EmpleadoMedioTiempo m = new EmpleadoMedioTiempo(codig, nombr, apellid, carg, sueldoBas, hora);
                    Emp.add(m);
                    break;
                case 3:
                    System.out.println("Opcion 3: Mostrar empleados registrados");
                    if (Emp.size() == 0) {
                        System.out.println("No hay empleados registrados");
                    }
                    else if (Emp.size() != 0) {
                        System.out.println("--- Estadisticas ---");
                        for (Empleados e : Emp) {
                            e.mostrar();
                        }
                    }

                    break;
                case 4:
                    System.out.println("Opcion 4: Estadisticas");
                    if (Emp.size() != 0) {
                        System.out.println("--- Estadisticas ---");
                        for (Empleados e : Emp) {

                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Dato Invalido");

            }

        }
    }
}