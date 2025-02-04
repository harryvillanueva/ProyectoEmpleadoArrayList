package empleados;

public class CargoMedio extends Empleado{

int comision;


    public CargoMedio(String nombreCompleto, int edad, String fechaAlta, double salario, int comision) {
        super(nombreCompleto,  edad,  fechaAlta,  salario);
        this.comision = comision;
    }



    @Override
    public String toString() {
        return "Empleado \n" +
                "nombreCompleto=" + nombreCompleto + "\n" +
                " edad=" + edad + "\n" +
                " fechaAlta=" + fechaAlta + "\n" +
                " salario=" + salario + "\n" +
                " comisión=" + comision + "\n\n\n"
                ;
    }


}
