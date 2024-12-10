package day47;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//... (imports and class definition remain the same)

public class ApmosysLoginAutomation {
 public static void main(String[] args) {
     // Initialize the WebDriver
     WebDriver driver = new ChromeDriver();
     
     // Set an implicit wait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     try {
         // Step 1: Log in to mail.apmosys.com
         driver.get("https://mail.apmosys.com");
         System.out.println("Navigated to mail.apmosys.com");

         WebElement mailUsername = driver.findElement(By.xpath("//input[@type='email']"));
         WebElement mailNextButton = driver.findElement(By.xpath("//button[@name='next']"));
         
         mailUsername.sendKeys("rajendra.samantaray@apmosys.com");
         mailNextButton.click();
         
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         
         WebElement mailPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
         mailPassword.sendKeys("Sept@2024");
         
         WebElement mailSignin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='next']")));
         mailSignin.click();
         
         // Step 2: Navigate to Ishine Portal
         ((ChromeDriver) driver).executeScript("window.open('https://ishine.apmosys.com/', '_blank');");
         
         ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
         driver.switchTo().window(tabs.get(1));
         System.out.println("Navigated to Ishine portal");
         
         WebElement ishineUser = driver.findElement(By.xpath("//input[@id='username']"));
         WebElement ishinePass = driver.findElement(By.xpath("//input[@type='password']"));
         WebElement ishineSign = driver.findElement(By.xpath("//button[@type='submit']"));
         
         ishineUser.sendKeys("rajendra.samantaray@apmosys.com");
         ishinePass.sendKeys("Jamukoli@1");
         ishineSign.click();
         
         // Switch back to mail to fetch the OTP
         driver.switchTo().window(tabs.get(0));
         
         Thread.sleep(10000);  // Wait for the email to arrive
         
         WebElement latestMail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'col_SUBJECT') and contains(text(), 'Regarding otp')]")));
         latestMail.click();
         
         WebElement emailBody = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='body_container']")));
         String emailText = emailBody.getText();
         
         // Debug: Print the email content
         System.out.println("Email content: " + emailText);  // Print the entire email body for debugging
         
         String otp = extractOTP(emailText);
         System.out.println("Extracted OTP: " + otp);
         
         driver.switchTo().window(tabs.get(1));
         
         // Additional login logic for Ishine portal if needed

     } catch (Exception e) {
         e.printStackTrace();
     } finally {
         // Close the browser after completion
         driver.quit();
     }
 }

 private static String extractOTP(String emailText) {
     String otp = "";
     String otpPrefix = "Please find your otp ";  // Adjust this as necessary
     
     System.out.println("Extracting OTP from email: " + emailText); // Debugging output
     
     if (emailText.contains(otpPrefix)) {
         int startIndex = emailText.indexOf(otpPrefix) + otpPrefix.length();
         int endIndex = startIndex + 6;  // Assuming the OTP is always 6 digits
         otp = emailText.substring(startIndex, endIndex);
         
         // Optional: Check if the extracted OTP is numeric
         if (!otp.matches("\\d{6}")) {
             otp = "Invalid OTP format";  // Handle unexpected formats
         }
     } else {
         otp = "OTP not found in email";
     }
     
     return otp;
 }
}
