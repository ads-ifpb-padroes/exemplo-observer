import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by diogomoreira on 01/06/16.
 */
public class App {

	private String nome;
	private List<String> mensagens;

	private List<ObservadorApp> observadores;

	public App(String nome) {
		this.nome = nome;
		this.mensagens = new LinkedList<String>();
		this.observadores = new LinkedList<ObservadorApp>();
	}

	public void receberNovaMensagem(String mensagem) {
		mensagens.add(new Date() + " - " + mensagem);
		notificarObservadores();
	}

	public void addObservador(ObservadorApp observador) {
		this.observadores.add(observador);
	}

	public void remObservador(ObservadorApp observador) {
		this.observadores.remove(observador);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getMensagens() {
		return Collections.unmodifiableList(mensagens);
	}

	public int getQtdeMensagens() {
		return this.mensagens.size();
	}

	private void notificarObservadores() {
		for (ObservadorApp observador : this.observadores) {
			observador.atualizar(this);
		}
	}
}