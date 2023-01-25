package com.exterro.Sampleseleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver", "C:\\Vigneshproject\\Sampleseleniumdemo\\webdriver\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        String url = "https://drp1release5.exterrocloud.info/fusion/ui/pages/login.htm";
        wd.get(url);
        wd.findElement(By.xpath("//*[@id='username']")).sendKeys("Karuna");
        wd.findElement(By.xpath("//*[@id='password']")).sendKeys("Exterro-123");
            wd.findElement(By.xpath("//*[@id='loginDiv']")).click();
            wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           
           //wd.findElement(By.xpath("//*[@id='createCompany']/span/i")).click();
            wd.findElement(By.xpath("//*[@id='appId2']/div[2]/i")).click();
            wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          //For dropdown button
            /*WebElement menu = wd.findElement(By.xpath("//span[contains(text(),'United Technologies Corporation')]"));
           //Move mouse pointer on dropdown button
            Actions actions=new Actions(wd);
            actions.moveToElement(menu).perform();
            wd.findElement(By.linkText("Milton")).click();*/
            Select drpCompany = new Select(wd.findElement(By.id("customstyle")));
    drpCompany.selectByVisibleText("Exterro Inc");
            wd.findElement(By.xpath("//*[@id='matterPopup_matterName']")).sendKeys("Product issue");
            wd.findElement(By.xpath("//*[@id='matterPopup_matterNumber']")).sendKeys("122340938509");
            wd.findElement(By.xpath("//*[@id'select2-drop-mask]")).sendKeys("Civil");
            wd.findElement(By.xpath("//*[@id'select2-drop-mask]")).click();
           
            wd.findElement(By.xpath("//*[@id='s2id_matterPopup_matterStatus']/span")).sendKeys("Active");
            wd.findElement(By.xpath("//*[@id='s2id_matterPopup_team']/span")).sendKeys("Data Matter Team01");
            wd.findElement(By.xpath("//*[@id='mattercustom__233']")).sendKeys("SampleRR");
            wd.findElement(By.xpath("//*[@id='FinishCreationBtn']/span")).click();
           System.out.println("Done");
           System.out.println("complete!!!");
           

    }

        
    }

