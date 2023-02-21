import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        String name, surname;
        System.out.println("Ingrese su numbre");
        name = reading.nextLine();
        System.out.println("Ingrese su apellido");
        surname = reading.nextLine();
        
        int longName = name.length();
        int longSurname = surname.length();

        System.out.println("El numero de carácteres del nombre son: "+longName+" y el del apellido son: "+longSurname);

        reading.close();
    }
}
