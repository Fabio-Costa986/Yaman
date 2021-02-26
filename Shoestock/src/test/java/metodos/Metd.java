package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metd {
	
	
	WebDriver driver;
	
	public void abrirNavegador(String url, String navegador) {
		
		if(navegador == "Chrome") {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		
	} else if (navegador == "firefox"){
		System.setProperty("webdriver.chrome.driver", "./Drivers/geckodriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	} else {
		
		System.out.println("navegador inválido, Chrome ou firefox");
	}
	
		
		
	}	
	
	public void fechar() {
		
		driver.quit();
	}
	
	public void escrever(By elemento, String texto) {
		
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void Submit(By elemento ) {
		
		driver.findElement(elemento).submit();
	}

	public void clicar(By elemento) {
		
		driver.findElement(elemento).click();
	}
	
	public void esperaImplicita() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
	public void validarProduto() {

		String produto1 = "Bota Couro Shoestock Cano Médio Masculina";
		String produto2 = "Bota Coturno Shoestock Couro Fivelas Feminina";
		
		assertEquals(produto1, driver.findElement(By.cssSelector("#payment-information > div.payment-content > div > div > div > ul > li.product-item.O01-2931-219-39 > div.product-info > strong")).getText());
		assertEquals(produto2, driver.findElement(By.cssSelector("#payment-information > div.payment-content > div > div > div > ul > li.product-item.O01-1623-006-35 > div.product-info > strong")).getText());
		
	
	
	}
	
	public void screenShot(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}
}