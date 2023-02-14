import java.util.Scanner;

public class Love {
    public static void main(String[] args) {
     
        Scanner reading = new Scanner(System.in);

        int love;
        System.out.println("¿Le gusta Oriana? por favor, responda 1 si es sí, si es no escriba 2");

        love = reading.nextInt();

        if(love == 1){
            System.out.println("Lo suponía");
        }
        else{
            System.out.println("Entonces sí?");

            int securty;
            System.out.println("Esta seguro?, Escriba 1 si es sí y 2 si es no");
            securty = reading.nextInt();
            if(securty == 1){
                System.out.println("ya we, todos sabemos que sí");
            }
            else{
                System.out.println("si ve que si le gusta");
            }
        }



        reading.close();
    }
}
