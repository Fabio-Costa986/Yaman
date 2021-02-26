package elementos;

import org.openqa.selenium.By;

public class Elem {
	
	private By pesquisar = By.id("search-input");
	private By produto = By.cssSelector("#item-list > div > div:nth-child(1) > div.item-card__images > a");
	private By tamanho = By.cssSelector("#buy-box > section.product-size-selector > div > ul > li:nth-child(3) > a");
	private By comprar = By.id("buy-button-now");
	private By  escolherMaisProduto = By.cssSelector("body > div.main > div.cart.breakpoint.main > div.cart__content > div.cart__summary > div.summary > div > a.btn.btn--secondary.btn--block");
	private By produtoF = By.cssSelector("#item-list > div.wrapper > div:nth-child(1) > div.item-card__images > a > img");
	private By sacola = By.cssSelector("#header-content > header > div > div > section.count > a > span.cart-label");
	private By continuar = By.cssSelector("body > div.main > div.cart.breakpoint.main > div.cart__content > div.cart__summary > div.summary > div > a.btn.btn--primary.btn--block");
	private By nome = By.id("person-name");
	private By sobreNome = By.id("person-last-name");
	private By sexo = By.id("label-male");
	private By dia = By.id("dateofbirth-day");
	private By mes = By.id("dateofbirth-month");
	private By ano = By.id("dateofbirth-year");
	private By cpf = By.id("cpf");
	private By cep = By.id("address-zipcode");
	private By tipoEndereço = By.id("address-street-type");
	private By nomeRua = By.id("address-name");
	private By numero = By.id("address-number");
	private By bairro = By.id("neighborhood");
	private By estado = By.id("address-state");
	private By cidade = By.id("city");
	private By tel = By.id("phones-home");
	private By senha = By.id("password");
	private By email = By.id("sign-up-username");
	private By prossegir = By.id("verify-email-button");
	private By continuarOp = By.id("save-register-natural");
	
	
	
	public By getPesquisar() {
		return pesquisar;
	}

	public By getProduto() {
		return produto;
	}

	public By getTamanho() {
		return tamanho;
	}

	public By getComprar() {
		return comprar;
	}

	public By getProdutoF() {
		return produtoF;
	}

	public By getSacola() {
		return sacola;
	}

	public By getEscolherMaisProduto() {
		return escolherMaisProduto;
	}

	public By getNome() {
		return nome;
	}

	public By getSobreNome() {
		return sobreNome;
	}

	public By getSexo() {
		return sexo;
	}

	public By getDia() {
		return dia;
	}

	public By getMes() {
		return mes;
	}

	public By getAno() {
		return ano;
	}

	public By getCpf() {
		return cpf;
	}

	public By getCep() {
		return cep;
	}

	public By getNumero() {
		return numero;
	}

	public By getTel() {
		return tel;
	}

	public By getSenha() {
		return senha;
	}

	public By getContinuar() {
		return continuar;
	}

	public By getEmail() {
		return email;
	}

	public By getProssegir() {
		return prossegir;
	}

	public By getTipoEndereço() {
		return tipoEndereço;
	}

	public By getNomeRua() {
		return nomeRua;
	}

	public By getBairro() {
		return bairro;
	}

	public By getEstado() {
		return estado;
	}

	public By getCidade() {
		return cidade;
	}

	public By getContinuarOp() {
		return continuarOp;
	}
	
	
	

}
