package repositories;

import java.io.File;
import java.io.IOException;

public class CriarDados {
	public void criarDados() {
		try {
//			create files
			File criarBanco = new File("dados/banco.txt");
			File criarAgencia = new File("dados/agencia.txt");
			criarBanco.createNewFile();
			criarAgencia.createNewFile();
			
			File criarPessoa = new File("dados/pessoa.txt");
			File criarFuncionario = new File("dados/funcionario.txt");
			File criarCliente = new File("dados/cliente.txt");
			criarPessoa.createNewFile();
			criarFuncionario.createNewFile();
			criarCliente.createNewFile();
			
			File criarConta = new File("dados/conta.txt");
			File criarTipoConta = new File("dados/tipoConta.txt");
			File criarContaCorrente = new File("dados/contaCorrente.txt");
			File criarContaPoupanca = new File("dados/contaPoupanca.txt");
			File criarTransacao = new File("dados/transacao.txt");
			criarConta.createNewFile();
			criarTipoConta.createNewFile();
			criarContaCorrente.createNewFile();
			criarContaPoupanca.createNewFile();
			criarTransacao.createNewFile();
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
