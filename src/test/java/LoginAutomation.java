// Importing necessary Selenium WebDriver classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Class for automating the login process
public class LoginAutomation {

    public static void main(String[] args) {

        // Setting the system property to specify the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        // URL of the login page
        String url = "https://efining.000webhostapp.com/admin";

        // Creating a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Opening the specified URL in the Chrome browser
            driver.get(url);

            // Locating the input fields for police ID and password by their 'name' attribute
            WebElement policeIdInput = driver.findElement(By.name("police_id"));
            WebElement passwordInput = driver.findElement(By.name("password"));

            // Entering values into the police ID and password input fields
            policeIdInput.sendKeys("10000");
            passwordInput.sendKeys("Ousl@123");

            // Locating the login button using a CSS selector and clicking it
            WebElement loginButton = driver.findElement(By.cssSelector(".login-button"));
            loginButton.click();

        } finally {
            // Ensuring that the WebDriver is closed, regardless of whether the test passes or fails
            driver.quit();
        }
    }
}
