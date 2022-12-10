import java.util.Scanner;
import static java.lang.Math.sqrt;
import java.util.Random;
public class ComputarMetodos {
    public double fToC(double f) {
        double c = (f-32)/1.8;
        return c;
    }
    public double hipotenusa(double a, double b ) {
        double h = sqrt(a*a+b*b);
        return h;
    }
    public int rolar ( ) {
        Random dado = new Random();
        int d1 = dado.nextInt(6) + 1;;
        int d2 = dado.nextInt(6) + 1;;
        int soma = d1+d2;
        return soma;
    }
}
