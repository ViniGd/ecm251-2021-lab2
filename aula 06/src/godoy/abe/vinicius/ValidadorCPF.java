package godoy.abe.vinicius;

public class ValidadorCPF {
    private static String[] invalidosConhecidos = {




    };
    private static final int[] multiplicadoresPrimeiroDigito = {
            10,9,8,7,6,5,4,3,2
    };
    private static final int[] multiplicadoresSegundoDigito = {
            11,10,9,8,7,6,5,4,3,2
    };

    private static int TAMANHO_CPF = 11;
    public static boolean validarCpf(String cpf){
        cpf = cpf.replace( target: ".", replacement: "");
        cpf = cpf.replace( target: "-", replacement: "");
        if(cpf.length() != 11)
            return false;

        for (String cpfInvalido : invalidosConhecidos){
            if (cpfInvalido.equals(cpf))
                return false;

        }

        int somatoriaPrimeiroDigito = 0/

        return true;
    }

    private static int validarDigito(int[] multiplicadores, String cpf){
        int somatorio = 0;
        for(int i = 0; i < multiplicadores.length; i++) {
            somatorio += multiplicadores[i] * cpf.charAt(i);
        }
    }
    //Validação do primeiro e do segundo digito
        if (validarDigito(multiplicadoresPrimeiroDigito,cpf) && validarDigito(multiplicadoresSegundoDigito, cpf))
            return true;

}
