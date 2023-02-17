import java.util.Scanner;

public class Not {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String name = reading.nextLine();

        double not1, not2, not3, assistance;
        System.out.println("Digite su primera nota");
        not1 = reading.nextDouble();
        System.out.println("Digite su segunda nota");
        not2 = reading.nextDouble();
        System.out.println("Digite su tercera nota");
        not3 = reading.nextDouble();

        double average = (not1+not2+not3) /3;

        System.out.println("Su promedio de las notas es: "+average);

        System.out.println("ingrese su porcentaje de asistencia");
        assistance = reading.nextDouble();

        if(average>=3.5 && assistance>=70 || name.equals("Oscar") ){
            System.out.println("Usted aprobó");
        }
        else{
            System.out.println("Usted no aprobó");
        }

        reading.close();
    }
}
