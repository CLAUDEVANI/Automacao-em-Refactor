package auto.parabank.runner;

import org.openqa.selenium.chrome.ChromeDriver;

import auto.parabank.drivers.Drivers;

public class Executa extends Drivers {

	/**
	 * Metodo para abrir o navegador
	 * 
	 * @author claudevani.pereira
	 */

	public static void abrirNavegador() {

		String url = "https://parabank.parasoft.com/parabank/index.htm";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
