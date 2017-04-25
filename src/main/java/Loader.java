/**
 * Created by diogomoreira on 01/06/16.
 */
public class Loader {

	public static void main(String[] args) throws InterruptedException {
		App app = new App("Whatsapp");
		app.receberNovaMensagem("Olá");
		app.addObservador(new AreaNotificacao());
		app.receberNovaMensagem("Eoq");

		Thread.sleep(1000L);
		app.receberNovaMensagem("toca raul!");
	}
}
