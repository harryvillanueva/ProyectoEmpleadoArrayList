package output;

import empleados.Empleado;

public class Output {

    public  void mostrarMenu(){
        System.out.println("""
                Elija la acción que desea realizar \n
                1. Agregar Empleado
                2. Modificar Empleado
                3. Mostrar Empleados
                4. Eliminar Empleado
                5. Salir
                """);
    }

    public  void mostrarMenuEmpleado(){
        System.out.println("""
               ingrese opcion
               1. subordinado
               2. Cargo medio
               """);
    }




    public  void mostrarMensajeNombre(){
        System.out.println("ingrese nombre del empleado " );
    }
    public  void mostrarMensajecantidadEmpleados(){
        System.out.println("ingrese candidad de empleados a agregar ");
    }
    public  void mostrarMensajeEdad(){
        System.out.println("ingrese edad del empleado ");
    }

    public  void mostrarMensajeFecha(){
        System.out.println("Ingrese Fecha de Ingreso del Empleado (dd/mm/yyyy)" );
    }
    public  void mostrarMensajeSalario(){
        System.out.println("Ingrese salario del Empleado " );
    }

    public  void mostrarMensajeSalarioActualizado(){
        System.out.println("Ingrese salario actual del Empleado ");
    }

    public  void saltoDeLinea(){
        System.out.println(" ");
    }

    public  void mostrarMensajeComision(){
        System.out.println("Ingrese comisión del Empleado" );
    }

    public  void mostrarEmpleado(Empleado empleado){
        System.out.println(empleado);
    }

    public  void mostrarEmpleadoActualizar(int numero, String empleado){
        System.out.println(numero + " Nombre -> "+ empleado);
    }

    public  void mostrarEmpleadoModificar(String nombre, Double salario ){

        System.out.println( " Nombre -> " +nombre+ "\n Salario -> " + salario);
    }

    public  void opcionModificarEmpleado(){

        System.out.println("Elije el numero de usuario que deseas modificar ");
    }

    public  void opcionEliminarEmpleado(){

        System.out.println("Elije el numero de usuario que deseas eliminar ");
    }





}
