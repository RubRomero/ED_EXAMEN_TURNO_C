package empleadoED_48585234B;

/**
 * Ejercicio práctico examen EVAL 1 ED
 *
 * @author RUBÉN ROMERO REBOLLO
 * @version 1.0
 */

public class EmpleadoED_48585234B {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    public EmpleadoED_48585234B(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA
        EmpleadoED_48585234B emp = new EmpleadoED_48585234B("RUBÉN ROMERO REBOLLO", "48585234B");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
           + " euros, al hacer " + horasExtra + " horas extra.");
    }
}
