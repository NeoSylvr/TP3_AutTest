package test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rodrigue\\Desktop\\Projet_AutTest\\ChromeServer\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8000/base.html");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    @Order(1)
    public void testAddition() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement boutonPlus = driver.findElement(By.xpath("//input[@value='+']"));
        boutonPlus.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(2)
    public void testSoustraction() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement boutonMoins = driver.findElement(By.xpath("//input[@value='-']"));
        boutonMoins.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(3)
    public void testMultiplication() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement boutonMultiplication = driver.findElement(By.xpath("//input[@value='*']"));
        boutonMultiplication.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(4)
    public void testDivision() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement boutonDivision = driver.findElement(By.xpath("//input[@value='/']"));
        boutonDivision.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(5)
    public void testPress1() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement bouton1 = driver.findElement(By.xpath("//input[@value='1']"));
        bouton1.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(6)
    public void testPress2() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement bouton2 = driver.findElement(By.xpath("//input[@value='2']"));
        bouton2.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(7)
    public void testPress3() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement bouton3 = driver.findElement(By.xpath("//input[@value='3']"));
        bouton3.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(8)
    public void testPress4() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement bouton4 = driver.findElement(By.xpath("//input[@value='4']"));
        bouton4.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(9)
    public void testPress5() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement bouton5 = driver.findElement(By.xpath("//input[@value='5']"));
        bouton5.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(10)
    public void testPress6() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement bouton6 = driver.findElement(By.xpath("//input[@value='6']"));
        bouton6.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(11)
    public void testPress7() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement bouton7 = driver.findElement(By.xpath("//input[@value='7']"));
        bouton7.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(12)
    public void testPress8() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement bouton8 = driver.findElement(By.xpath("//input[@value='8']"));
        bouton8.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(13)
    public void testPress9() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement bouton9 = driver.findElement(By.xpath("//input[@value='9']"));
        bouton9.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(14)
    public void testPress0() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement bouton0 = driver.findElement(By.xpath("//input[@value='0']"));
        bouton0.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(15)
    public void testPressEgal() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement boutonEgal = driver.findElement(By.xpath("//input[@value='=']"));
        boutonEgal.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(16)
    public void testPressC() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(17)
    public void testPressDot() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        WebElement boutonDot = driver.findElement(By.xpath("//input[@value='.']"));
        boutonDot.click();
        Thread.sleep(5000);
    }

    @Test
    @Order(18)
    public void executeAddition() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        //appuyer sur le bouton, puis +, puis 2, puis =, puis vérifier que le résultat est 3
        WebElement bouton1 = driver.findElement(By.xpath("//input[@value='1']"));
        bouton1.click();
        WebElement boutonPlus = driver.findElement(By.xpath("//input[@value='+']"));
        boutonPlus.click();
        WebElement bouton2 = driver.findElement(By.xpath("//input[@value='2']"));
        bouton2.click();
        WebElement boutonEgal = driver.findElement(By.xpath("//input[@value='=']"));
        boutonEgal.click();

        WebElement displayField = driver.findElement(By.id("display"));
        String displayValue = displayField.getAttribute("value");
        assertEquals("3", displayValue);

        Thread.sleep(5000);
    }

    @Test
    @Order(19)
    public void executeSoustraction() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        //appuyer sur le bouton, puis -, puis 2, puis =, puis vérifier que le résultat est 1
        WebElement bouton3 = driver.findElement(By.xpath("//input[@value='3']"));
        bouton3.click();
        WebElement boutonMoins = driver.findElement(By.xpath("//input[@value='-']"));
        boutonMoins.click();
        WebElement bouton2 = driver.findElement(By.xpath("//input[@value='2']"));
        bouton2.click();
        WebElement boutonEgal = driver.findElement(By.xpath("//input[@value='=']"));
        boutonEgal.click();

        WebElement displayField = driver.findElement(By.id("display"));
        String displayValue = displayField.getAttribute("value");
        assertEquals("1", displayValue);

        Thread.sleep(5000);
    }

    @Test
    @Order(20)
    public void executeMultiplication() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        //appuyer sur le bouton, puis *, puis 2, puis =, puis vérifier que le résultat est 6
        WebElement bouton3 = driver.findElement(By.xpath("//input[@value='3']"));
        bouton3.click();
        WebElement boutonMultiplication = driver.findElement(By.xpath("//input[@value='*']"));
        boutonMultiplication.click();
        WebElement bouton2 = driver.findElement(By.xpath("//input[@value='2']"));
        bouton2.click();
        WebElement boutonEgal = driver.findElement(By.xpath("//input[@value='=']"));
        boutonEgal.click();

        WebElement displayField = driver.findElement(By.id("display"));
        String displayValue = displayField.getAttribute("value");
        assertEquals("6", displayValue);

        Thread.sleep(5000);
    }

    @Test
    @Order(21)
    public void executeDivision() throws InterruptedException {
        WebElement boutonClear = driver.findElement(By.xpath("//input[@value='Clear']"));
        boutonClear.click();
        //appuyer sur le bouton, puis /, puis 2, puis =, puis vérifier que le résultat est 2
        WebElement bouton6 = driver.findElement(By.xpath("//input[@value='6']"));
        bouton6.click();
        Thread.sleep(1000);
        WebElement boutonDivision = driver.findElement(By.xpath("//input[@value='/']"));
        boutonDivision.click();
        Thread.sleep(1000);
        WebElement bouton3 = driver.findElement(By.xpath("//input[@value='3']"));
        bouton3.click();
        Thread.sleep(1000);
        WebElement boutonEgal = driver.findElement(By.xpath("//input[@value='=']"));
        boutonEgal.click();

        WebElement displayField = driver.findElement(By.id("display"));
        String displayValue = displayField.getAttribute("value");
        assertEquals("2", displayValue);

        Thread.sleep(5000);
    }

}

