package namaste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dib {

	public dib() {
		
	}
	 public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\12142\\OneDrive\\Documents\\chromedriver.exe");
			WebDriver git = new ChromeDriver();
			
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        git.get(baseUrl);

	        actualTitle = git.getTitle();
 
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        git.close();
	       
	    }

	}

