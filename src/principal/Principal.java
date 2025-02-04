package principal;

import empleados.CargoMedio;
import empleados.Empleado;
import input.Input;
import output.Output;
import validador.Validador;

import java.util.ArrayList;
import java.util.List;


public class Principal {

    private static final int AGREGAR = 1;
    private static final int MODIFICAR = 2;
    private static final int LISTAR = 3;
    private static final int ELIMINAR = 4;
    private static final int SALIR = 5;

    private static final int SUBORDINADO = 1;
    private static final int CARGOMEDIO = 2;





    private static int opcionMenu;


    private static List<Empleado> listaEmpleados;

    private static boolean usuarioQuiereSalir;

    private static Output output;
    private static Input input;


    public static void main(String[] args) {
        output = new Output();
        input = new Input();

        listaEmpleados = new ArrayList<>();

        usuarioQuiereSalir = false;



        do {
            boolean esValido;
            do {
                mostrarMenu();
                obtenerOpcionMenu();
                esValido = validarOpcionUsuario();
            } while (!esValido);


            ejecutarOpcionMenu(opcionMenu);

        } while (!usuarioQuiereSalir);

    }

    private static void mostrarMenu() {
        output.mostrarMenu();
    }
    private static void mostrarMenuEmpleado() {
        output.mostrarMenuEmpleado();
    }

    private static void obtenerOpcionMenu() {

        opcionMenu = input.obtenerOpcionMenu();


    }

    private static boolean validarOpcionUsuario() {

        Validador datoValido = new Validador();
        boolean esValido = datoValido.validarOpcionMenu(opcionMenu);

        return esValido;
    }

    private static void ejecutarOpcionMenu(int opcionMenu) {

        switch (opcionMenu) {

            case AGREGAR -> {


                solicitarDatosempleado();

            }
            case MODIFICAR -> {
                modificarUsuario();

            }
            case LISTAR -> {
                for (Empleado lista : listaEmpleados) {

                    System.out.println(lista);


                }
            }
            case ELIMINAR -> {
               eliminarUsuario();



            }
            case SALIR -> {
                usuarioQuiereSalir = true;
            }

        }

    }



    private static void solicitarDatosempleado() {

        mostrarMenuEmpleado();


       int opcionEmpleado = input.obtenerInt();

       switch (opcionEmpleado){

           case SUBORDINADO->{
               output.mostrarMensajeNombre();
                String nombre = input.obtenerString();
                output.mostrarMensajeEdad();
                int edad = input.obtenerInt();
                output.mostrarMensajeFecha();
                String fechaAlta = input.obtenerString();
                output.mostrarMensajeSalario();
                double salario = input.obtenerDouble();
               listaEmpleados.add(new Empleado(nombre,edad,fechaAlta,salario));
           }
           case CARGOMEDIO->{
               output.mostrarMensajeNombre();
                String nombre = input.obtenerString();
               output.mostrarMensajeEdad();
                int edad = input.obtenerInt();
                output.mostrarMensajeFecha();
                String fechaAlta = input.obtenerString();
                output.mostrarMensajeSalario();
                double salario = input.obtenerDouble();
                output.mostrarMensajeComision();
               int comision = input.obtenerInt();
               listaEmpleados.add(new CargoMedio(nombre,edad,fechaAlta,salario,comision));
           }
       }



    }

    private static void modificarUsuario() {



        for (Empleado lista : listaEmpleados) {

            output.mostrarEmpleadoModificar(lista.getNombreCompleto(), lista.getSalario());
        }

        output.mostrarMensajeNombre();
        String nombre = input.obtenerString();
        output.mostrarMensajeSalarioActualizado();
        double salarioActualizado = input.obtenerDouble();

        for (Empleado lista : listaEmpleados) {

            if (nombre.equals(lista.getNombreCompleto())){
                lista.setSalario(salarioActualizado);
            }
        }

    }

    private static void eliminarUsuario(){

        if (listaEmpleados.size()>0){

            int contadorEmpleados = 1;

            for (Empleado lista : listaEmpleados) {

                output.mostrarEmpleadoActualizar(contadorEmpleados,lista.getNombreCompleto());
                contadorEmpleados++;
            }

            System.out.println("ingrese numero de usuario a eliminar");
            int numero = input.obtenerInt();

            listaEmpleados.remove(numero-1);
        }






    }


}
