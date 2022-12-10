import java.util.Scanner;

public class ClasseTeste {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ComputarMetodos calcular = new ComputarMetodos();

        System.out.print("Digite a temperatura na medida Fahrenheit: ");
        double f= sc.nextDouble();
        double c = calcular.fToC(f);
        System.out.println("Temperatura in Celsius é "+c+" °C");

        System.out.println("==================================================");

        System.out.print("Digite o valor do 1° cateto: ");
        double a= sc.nextInt();
        System.out.print("Digite o valor do 2° cateto: ");
        double b= sc.nextInt();
        double h = calcular.hipotenusa(a, b);
        System.out.println("O triângulo possui uma hipotenusa de "+h);

        System.out.println("==================================================");
        sc.close();

        int d = calcular.rolar();
        System.out.println("A soma dos dois dados é igual a "+d);
    }

}
