package godoy.abe.vinicius;

public class Conta {
    //Atributos das classes
    Cliente cliente;
    double saldo;
    int numero;

    //Metodos da classe
    void depositar(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
        // os dois funcionam do mesmo jeito
    }

    boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
        // metodo sacar em boolean para retornar um valor true ou false
        //O if tem como função de evitar sacar um valor maior do que o saldo
    }

    boolean transferirdinheiro(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    void visualizarsaldo() {
        System.out.println("Seu saldo é de: " + this.saldo);
        // O this é uma auto-referencia, ele olha o objeto que esta sendo usado
        // sem o this ele busca variavel local
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}
