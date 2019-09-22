package components.SignUp;

import org.openqa.selenium.WebElement;

import com.keyword.Keyword1;

public class SignUpPage { 
	public WebElement logo; 
	public WebElement enter_EmailOrPhone; 
	public WebElement enter_password; 
	public WebElement Log_In_Button; 	
	
	public WebElement enter_EmailOrPhone(String LocatorType, String LocatorValue,String textToSend) {
		enter_EmailOrPhone=Keyword1.getWebElement(LocatorType, LocatorValue);
		return enter_EmailOrPhone;
	}
} 
   

 
