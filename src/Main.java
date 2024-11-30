

public class Main {
    public static void main(String[] args) {
        String txt = "Boby Moreno";

        System.out.println(txt);

        txt = "Cubos Academy";

        final String txt2 = "Minha primeira constante";

        System.out.println(txt2);

        // Números
        // números inteiros
        int numeroInteiro = 12;

        // números double
        double numeroDecimal = 20.5;
        System.out.println(numeroInteiro);
        System.out.println(numeroDecimal);

        // Lógico
        boolean verdadeiroOuFalso = true;
        System.out.println(verdadeiroOuFalso);

        // ==, >=, <=, !=, >, <
        // &&, ||, !verdadeiroOuFalso (Negação da variavel, nesse caso ela ira ser false)
        int numero1 = 15;
        int numero2 = 10;

        if(numero1 > numero2) {
            System.out.println("O número 1 é maior");
        } else if(numero1 == numero2) {
            System.out.println("O número 1 é igual ao número 2");
        } else {
            System.out.println("O número 2 é maior");
        }

        // Switch case
        int numero3 = 18;

        switch (numero3) {
            case 18:
                System.out.println("O número é 18");
                break;
            case 17:
                System.out.println("O número é 17");
                break;
            default:
                System.out.println("O número é desconhecido");
                break;
        }

        // Condições térnarias
      String ternario =  (numero3 <= 17) ? "Menor de idade" : "Maior de idade";
        System.out.println(ternario);


    }
}