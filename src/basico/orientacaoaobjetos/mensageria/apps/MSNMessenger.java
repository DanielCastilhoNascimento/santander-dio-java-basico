package orientacaoaobjetos.mensageria.apps;

public class MSNMessenger extends ServicoMensageria{

    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}

}
