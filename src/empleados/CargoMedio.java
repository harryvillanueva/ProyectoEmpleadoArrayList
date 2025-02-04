package empleados;

public class CargoMedio extends Empleado{

int comision;


    public CargoMedio(String nombreCompleto, int edad, String fechaAlta, double salario, int comision) {
        super(nombreCompleto,  edad,  fechaAlta,  salario);
        this.comision = comision;
    }



    @Override
    public String toString() {
        return
                "nombreCompleto=" + nombreCompleto + " " +
                " edad=" + edad + " " +
                " fechaAlta=" + fechaAlta + " " +
                " salario=" + salario + " " +
                " comisión=" + comision + " "
                ;
    }


}
