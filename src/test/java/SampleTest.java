import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class SampleTest {
    @Test
    public void get(){
        WebDriverManager.edgedriver().setup();
        WebDriver web = new EdgeDriver();
        web.get("https://github.com/");
        web.manage().window().maximize();
        web.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/a")).click();
        web.findElement(By.xpath("/html/body/div[3]/main/div/div[4]/form/input[2]")).sendKeys("ravi1149");
        web.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("******");
        web.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).click();
        web.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary")).click();
        web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        web.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/a[1]")).click();
        web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div")).click();
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div/details/details-dialog/form/div[1]/button")).click();
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[2]/div[2]/button")).click();
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[1]/input")).clear();
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[1]/input")).sendKeys("RavisBot");
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[2]/text-expander/textarea")).clear();
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[2]/text-expander/textarea")).sendKeys("I'm bot. I can do anything.");
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[3]/input")).clear();
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[3]/input")).sendKeys("Student");
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[4]/input")).clear();
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[4]/input")).sendKeys("Earth");
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[5]/input")).clear();
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[5]/input")).sendKeys("https://github.com/ravi1149");
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[6]/input")).clear();
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[6]/input")).sendKeys("Ravisbot");
        web.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/form/div[7]/button[1]")).click();
        web.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary")).click();
        web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        web.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/form/button")).click();
        web.close();
    }
}
