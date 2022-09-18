package auto.parabank.metodos;

import org.openqa.selenium.By;

import auto.parabank.drivers.Drivers;

public class Metodos extends Drivers {
	
	/**
	 * Metodo clica em um elemento web passando uma class
	 * @param elemento
	 * @param passoTeste
	 * @author claudevani.pereira
	 */

	
	public void clicar(By elemento, String passoTeste) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.err.println("****** Erro no " + passoTeste + "******");
			System.out.println("****** Causa do erro ****** " + e.getCause());
			System.out.println("****** Mensagem de erro ****** " + e.getMessage());

		}

	}
	
	/**
	 * * Metodo preencher em um elemento web passando uma class
	 * @param elemento
	 * @param texto
	 * @param passoTeste
	 * @author claudevani.pereira
	 */

	public void preencher(By elemento, String texto, String passoTeste) {

		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {

			System.err.println("****** Erro no " + passoTeste + "******");
			System.out.println("****** Causa do erro ****** " + e.getCause());
			System.out.println("****** Mensagem de erro ****** " + e.getMessage());

		}

	}
}
