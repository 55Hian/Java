public class MinhaClasse {
    
    public static void main(String[] args) {
        String primeiroNome = "Hian";
        String segundoNome = "Damaceno";

        String nomeCompleto = metodoNomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }

    public static String metodoNomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

    

}
