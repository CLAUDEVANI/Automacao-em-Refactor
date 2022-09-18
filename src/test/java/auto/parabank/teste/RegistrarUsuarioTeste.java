package auto.parabank.teste;

import org.junit.Before;
import org.junit.Test;

import auto.parabank.page.LoginUsuarioPage;
import auto.parabank.runner.Executa;

public class RegistrarUsuarioTeste {

	LoginUsuarioPage registrar = new LoginUsuarioPage();

	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();

	}

	@Test
	public void testeRegistrarUsuario() {

		registrar.acessarFormulario();
		registrar.enviarFormulario("Teste@12", "Teste@12", "Teste@12", "Teste@12", "Teste@12", "Teste@12", "Teste@12",
				"Teste@12", "Teste@12", "Teste@12", "Teste@12");

	}

	public void testeRegistrarUsuarioDadosEmBranco() {
		registrar.acessarFormulario();
		registrar.enviarFormulario(null, null, null, null, null, null, null, null, null, null, null);

	}

	public void testeRegistrarUsuarioSenhasDiferentes() {
		
		registrar.enviarFormulario("Teste@15", "Teste@15", "Teste@15", "Teste@15", "Teste@15", "Teste@15", "Teste@15",
				"Teste@15", "Teste@15", "Teste@15", "Teste@14");

	}

	public void testeRegistrarUsuarioJaCadastrado() {
		
		registrar.acessarFormulario();
		registrar.enviarFormulario("Teste@12", "Teste@12", "Teste@12", "Teste@12", "Teste@12", "Teste@12", "Teste@12",
				"Teste@12", "Teste@12", "Teste@12", "Teste@12");

	}

}
