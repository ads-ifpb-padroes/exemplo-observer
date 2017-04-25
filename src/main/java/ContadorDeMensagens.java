import java.util.Date;

/**
 * Created by diogomoreira on 01/06/16.
 */
public class ContadorDeMensagens implements ObservadorApp {

	public void atualizar(App app) {
		System.out.println("Whatsapp tem "+app.getQtdeMensagens()+" mensagem(s)");
	}
}
