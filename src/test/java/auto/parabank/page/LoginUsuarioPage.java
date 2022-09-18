package auto.parabank.page;

import auto.parabank.elementos.Elementos;
import auto.parabank.metodos.Metodos;

public class LoginUsuarioPage {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void acessarFormulario() {
		metodos.clicar(el.menuRegister, "abrindo o formulario pelo menu register da home");

	}

	public void enviarFormulario(String firtsName, String lastName, String address, String city, String state,
			String zipCode, String phone, String ssn, String userName, String password, String confPassword) {
		metodos.preencher(el.firstName, firtsName, "preencher o campo firtsName");
		metodos.preencher(el.lastName, lastName, "preencher o campo lastName");
		metodos.preencher(el.address, address, "preencher o campo address");
		metodos.preencher(el.city, city, "preencher o campo city");
		metodos.preencher(el.state, state, "preencher o campo state");
		metodos.preencher(el.zipCode, zipCode, "preencher o campo state");
		metodos.preencher(el.phone, phone, "preencher o campo phone");
		metodos.preencher(el.ssn, ssn, "preencher o campo ssn");
		metodos.preencher(el.username, userName, "preencher o campo userName");
		metodos.preencher(el.password, password, "preencher o campo password");
		metodos.preencher(el.confpassword, confPassword, "preencher o campo confpassword");
		metodos.clicar(el.btnRegister, "clicando no botão register para enviar o formulario");

	}

}
