package scrmpro.appmethods.com;

import scrmpro.pom.com.QuotePage;

public class QuoteMethod extends OppMethods{
	
	public void clickEditButtn(){
		
		QuotePage.clk_editbtn.click();
	}
	
	public void clkSavebtn(){
		QuotePage.clk_Savebtn.click();
	}
	
	public void clkQuotelin(){
		QuotePage.clk_QuotelineItemtab.click();
	}

	
	public void quoteConvert(){
		
		QuotePage.clk_quotecovrt.click();
	}
}
