package scrmpro.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotePage extends OppPage{

	public QuotePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//*[@id='QuoteTbl']/tbody/tr[1]/td[2]")
	public static WebElement clk_editbtn;
	
	@FindBy(xpath="//div[@id='ContentPlaceHolder1")
	public static WebElement clk_QuotelineItemtab;
	
	@FindBy(id="ContentPlaceHolder1_AddQuote_btnSaveHidden")
	public static WebElement clk_Savebtn;
	
	@FindBy(id="ContentPlaceHolder1_AddOpp_lnkbtnConvert")
	public static WebElement clk_quotecovrt;

}
