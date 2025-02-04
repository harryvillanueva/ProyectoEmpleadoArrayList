package empleados;

public class Empleado {

    String nombreCompleto;
    int edad;
    String fechaAlta;
    double salario;


    public Empleado() {
    }

    public Empleado(String nombreCompleto, int edad, String fechaAlta, double salario) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.fechaAlta = fechaAlta;
        this.salario = salario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return
                "nombreCompleto=" + nombreCompleto + " " +
                " edad=" + edad + " " +
                " fechaAlta=" + fechaAlta + " " +
                " salario=" + salario ;
    }
}
