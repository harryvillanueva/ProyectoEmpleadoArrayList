package input;

import java.util.Scanner;

public class Input {

    static int opcionMenu;
    static double numdouble;
    static String palabra;
    static Scanner sc = new Scanner(System.in);


    private  void opcionMenu(){

        opcionMenu = Integer.parseInt(sc.nextLine());
    }

    private  void opcionDouble(){

        numdouble = Double.parseDouble(sc.nextLine());
    }
    private  void opcionString(){

        palabra = sc.nextLine();
    }

    public  int obtenerInt(){
        opcionMenu();
        return opcionMenu;
    }
    public  int obtenerOpcionMenu(){
        opcionMenu();
        return opcionMenu;
    }
    public  double obtenerDouble(){
        opcionDouble();
        return numdouble;
    }
    public  String obtenerString(){
        opcionString();
        return palabra;
    }
}
