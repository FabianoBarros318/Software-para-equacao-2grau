import java.util.Scanner;

public class executor extends Equacao {
    public static void main(String[] args) {
       
        Delta dt = new Delta();
        EqXn xnXp = new EqXn();

        Scanner entrada = new Scanner(System.in);
        System.out.println("qual o valor do A?");
        dt.setA(entrada.nextDouble());
        System.out.println("qual o valor do B?");
        dt.setB(entrada.nextDouble());
        System.out.println("qual o valor do C?");
        dt.setC(entrada.nextDouble());
        dt.calculaDelta();
        System.out.println("resultado de delta: " + dt.getDelta());
        System.out.println("---------- x| e x|| sao: -----------------");
        if (dt.getDelta() < 0) {
            System.out.println("a equacao nao possui raizes reais.");
        } else {
            System.out.println("X| :" + xnXp.calculaXn(dt));
            System.out.println("X|| :" + xnXp.calculaXP(dt));
        }

    }

}
