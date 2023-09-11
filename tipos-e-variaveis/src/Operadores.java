public class Operadores {
   public static void main(String[] args) {
    
  
        double numero1 = 20 / 2;
        double numero2 = 5 * 2;
        
        double resultado;

        resultado = numero1 + numero2;
        System.out.println(resultado);

        resultado = numero1 - numero2;
        System.out.println(resultado);
        
        resultado = numero1 * numero2;
        System.out.println(resultado);
    
        resultado = numero1 / numero2;
        System.out.println(resultado);

        resultado = numero1 % numero2;
        System.out.println(resultado);

        String nome = "Hian A. Damaceno";
        String profissao = "Engenheiro de computação";

        String nomeProfissao = "o nome do cliente é " + nome + " sua principal colocação é de " + profissao;

        System.out.println(nomeProfissao);

        int incremento = 0;
        int decremento = 10;
        boolean negacao = true;

        incremento++;
        decremento--;
    
        System.out.println(incremento);
        System.out.println(decremento);
        System.out.println(!negacao);
       
        String verificacao = numero1 == numero2 ? "numero 1 (" + numero1 + ") e numero 2 ("+ numero2 + ") são iguais" : "numero 1 (" + numero1 + ") e numero 2 ("+ numero2 + ") são diferentes" ;

        System.out.println(verificacao);

        String nomePessoa1 = "Hian";
        String nomePessoa2 = "Hian";

        System.out.println(nomePessoa1 == nomePessoa2);

        String nomePessoa2New = new String("Hian");

        System.out.println(nomePessoa1 == nomePessoa2New); // resultado sera falso pois string != objeto string
        System.out.println(nomePessoa1.equals(nomePessoa2New)); // resultado positivo pois conteudo string == conteudo objeto string
    }
}
