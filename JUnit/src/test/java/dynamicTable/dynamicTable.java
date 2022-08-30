package dynamicTable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class dynamicTable {
    public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();

    driver.get("http://demo.guru99.com/test/web-table-element.php");
        List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[16]/td")); // columns
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")); // rows
        System.out.println("column size"+columns.size());
        System.out.println("rows size"+rows.size());

        for( WebElement eachcolumn:columns){
            System.out.println(eachcolumn.getText());
        }

        for (WebElement eachrows:rows){
            System.out.println(eachrows.getText());

            if (eachrows.getText().equals("Navin Fluorine Inter"));
            eachrows.click();




        }
        Assert.assertEquals(5,columns.size());
        Assert.assertEquals(26,rows.size());
        driver.close();
            }

    }
