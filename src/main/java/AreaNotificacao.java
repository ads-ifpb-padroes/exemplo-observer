import java.util.Date;
import java.util.List;

/**
 * Created by diogomoreira on 01/06/16.
 */
public class AreaNotificacao implements ObservadorApp {

	private int mensagensLidas;

	public void atualizar(App app) {
		if(mensagensLidas < app.getQtdeMensagens()) {
			for (int i=mensagensLidas;i<app.getQtdeMensagens();i++) {
				System.out.println(app.getNome() +": "+app.getMensagens().get(i)+" - "+new Date());
			}
			mensagensLidas = app.getQtdeMensagens();
	}

}
