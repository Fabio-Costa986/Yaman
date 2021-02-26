#Author: fcosta_zo@yahoo.com.br

Feature: Pesquisar produto
  Eu como usuario quero acessar o site shoestock e incluir produto no carrinho

		Background: acessar site shoestock
		Given que eu esteja no site "https:/www.shoestock.com.br"
  
  Scenario: Pesquisar produto
   
    When incluir produtos no carrinho " " 
    Then validar os produtos incluidos no carrinho
    

 