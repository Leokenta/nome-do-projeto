package org.example.EXERCICIO6;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(Double saldo, String titular){
        super(saldo, titular);
    }

    @Override
    public void sacar(Double valor){
        super.sacar(valor);

        if(valor > saldo){
            System.out.println("Saque indisponivel");
        }else {
           valor = (valor * 0.05) + valor;
           saldo = saldo - valor;
            System.out.println("Saque de "+valor+ " efetuado com sucesso, saldo : "+saldo);
        }
    }

}
