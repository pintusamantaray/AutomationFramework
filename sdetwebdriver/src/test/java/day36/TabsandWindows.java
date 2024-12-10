package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabsandWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//open email and login
		driver.get("https://mail.apmosys.com");
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("rajendra.samantaray@apmosys.com");
		driver.findElement(By.xpath("//button[@name=\"next\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Sept@2024");
		driver.findElement(By.xpath("//button[@name=\"next\"]")).click();
		Thread.sleep(5000);
		
		//open new tab for ishine
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://ishine.apmosys.com/#/login");
		
		//Switch to new tab //List<String> this will store the id of the tabs in the ids variable
		List<String> ids = new ArrayList<String>(driver.getWindowHandles());
		
		//New To ishine login tab
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("rajendra.samantaray@apmosys.com");
		driver.findElement(By.xpath("//input[@id=\"userPassword\"]")).sendKeys("Jamukoli@1");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		//Switch back to email
		driver.switchTo().window(ids.get(0));
		Thread.sleep(2000);
		//Open the latest email (adjust the XPath as needed)
		driver.findElement(By.xpath("//*[@id=\"gui.frm_main.filter#loader\"]")).click();
		
//		WebElement frame1=driver.findElement(By.xpath("//td[@class='body_container']"));
//		driver.switchTo().frame(frame1);
//		
		
		// Wait for the email content to load and extract OTP
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String emailBody = driver.findElement(By.xpath("//iframe[@id='gui.frm_main.main.mailview#frame']")).getText(); // Adjust the XPath based on actual email structure
//		String emailBody = emailBodyElement.getText();
		
//		// Debug: Print the email content to ensure you're capturing it
//		System.out.println("Email Body: " + emailBody);
		
		// Define regex pattern to extract OTP (update the pattern as needed)
		Pattern pattern = Pattern.compile("Please find your otp (\\d{6})"); // Modify this pattern if the OTP has letters or a different format
        Matcher matcher = pattern.matcher(emailBody);
        
        String otp = "";
        if (matcher.find()) {
            otp = matcher.group(1); // Extracted OTP
            System.out.println("Extracted OTP: " + otp);
        } else {
            System.out.println("OTP not found in email body.");
        }

        // If OTP was found, switch back to iShine tab to enter OTP
        if (!otp.isEmpty()) {
            driver.switchTo().window(ids.get(1));
            Thread.sleep(2000);

            // Wait for OTP field and input OTP
            WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userOtp']")));
            otpField.sendKeys(otp);

            // Submit the OTP form
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        } else {
            System.out.println("No OTP to enter.");
        }

        // Continue with further logic if needed...
      //  Thread.sleep(5000);
        //driver.quit(); // Close the browser session
    }
}
        