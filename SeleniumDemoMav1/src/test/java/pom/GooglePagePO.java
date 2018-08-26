package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class GooglePagePO extends BasePage {

	public GooglePagePO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="q")
	private WebElement searchTxtBx;
	public WebElement searchTxtBx() {
		return searchTxtBx;
		
	}
	
/*	@FindBy(id="gsr")
	private WebElement fbLink;
	public WebElement fblink() {
		return fbLink;
		
	} */
	
	 @FindBy(name="btnk")
	private WebElement clkBtn;
	public WebElement clkBtn() {
		return clkBtn;
		
	}
	
}
