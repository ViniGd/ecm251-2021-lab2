package godoy.abe.vinicius;

public class Main {

    public static void main(String[] args) {
	// cria um objeto do tipo conta
        Conta c1;
        //Instancia (cria) um objeto conta
        c1 = new Conta(); // pode fazer na mesma linha (linha 7)

        //Pede para visualizar o saldo
        c1.visualizarsaldo();

        //Modificar o saldo
        c1.saldo = 100;  // nome do objeto . metodo
        c1.visualizarsaldo();

        //Cria um novo objeto tipo conta
        Conta c2 = new Conta();
        c2.saldo = 200;

        c1.depositar(200);
        c2.depositar(200);

        c1.visualizarsaldo();
        c2.visualizarsaldo();
        // Eles não interferem nos atributos um do outro

//        if(c1.sacar(50)){
//            System.out.println("Foi");
//        }else {
//            System.out.println("não foi");
//        } //saber se realizou ou nao a operação
//

        if(c1.transferirdinheiro(c2, 2500)){
            System.out.println("sucesso");
        } else {
            System.out.println("Não foi");
        }

        c1.visualizarsaldo();
        c2.visualizarsaldo();

        c1.cliente = new Cliente();
        c2.cliente = new Cliente();

        System.out.println("nome do cliente: " +c1.cliente.nome);
        System.out.println("nome do cliente: " +c2.cliente.nome);

        c1.cliente.nome = "Midoria";
        c1.cliente.sobrenome = "Izuku";
        c1.numero = 9;
        System.out.println("c1: " + c1.toString());
    }
}
