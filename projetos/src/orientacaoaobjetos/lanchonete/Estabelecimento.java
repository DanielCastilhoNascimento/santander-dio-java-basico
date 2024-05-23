
package orientacaoaobjetos.lanchonete;
import orientacaoaobjetos.lanchonete.atendimento.cozinha.Almoxarife;
import orientacaoaobjetos.lanchonete.atendimento.cozinha.Cozinheiro;
import orientacaoaobjetos.lanchonete.area.cliente.Cliente;

public class Estabelecimento {

    public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
			
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
	
	}

}
