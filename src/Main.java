import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver","E:\\qaProjects\\chromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://calculator.net");
        String title = webDriver.getTitle();
        System.out.println("web site title is :-"+title);
        String url = webDriver.getCurrentUrl();
        System.out.println("the url  is ="+url);
        Thread.sleep(1000);
        WebElement input  = webDriver.findElement(By.id("calcSearchTerm"));
        input.sendKeys("BMI");
        Thread.sleep(3000);
        //input.findElement(By.id("search-icon-legacy")).click();
        input.submit();
        Thread.sleep(3000);
        webDriver.close();

    }
}