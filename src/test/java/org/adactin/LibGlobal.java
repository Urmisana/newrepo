package org.adactin;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	 static WebDriver driver;

	public void browserFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void browserConfigChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void openUrl(String url) {
		driver.get(url);
	}

	public void printurl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public void title() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void maximize() {

		driver.manage().window().maximize();

	}

	public WebElement locateById(String Id) {
		WebElement findElement = driver.findElement(By.id(Id));
		return findElement;

	}

	public WebElement locateByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;

	}

	public WebElement locateByXpath(String xpathExpression) {
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;

	}
	public WebElement locateByClassName(String className) {
		WebElement findElement = driver.findElement(By.className(className));
		return findElement;
	}
	public WebElement locateByTagname(String tagName) {
		WebElement findElement = driver.findElement(By.tagName(tagName));
		return findElement;
	}
	
	public WebElement locateByCss(String cssSelector) {
		WebElement findElement = driver.findElement(By.cssSelector(cssSelector));
		return findElement;
	}
	public WebElement locateByLinktext(String linkText) {
		WebElement findElement = driver.findElement(By.linkText(linkText));
		return findElement;
	}

	public static void type(WebElement element, String data) {

		element.sendKeys(data);
	}

	public static void click(WebElement element) {

		element.click();

	}

	public void navigateBack() {

		driver.navigate().back();
	}

	public void quit() {
		driver.quit();

	}

	public void close() {
		driver.close();

	}


	public void navigateForword() {

		driver.navigate().forward();
	}

	public void refresh() {

		driver.navigate().refresh();
	}

	public void particularUrl(String url) {

		driver.navigate().to(url);
	}

	public void mouseOver(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}

	public void dragandDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public void doubleClick(WebElement target) {
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
	}

	public void rightClick(WebElement target) {
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
	}

	// keypress pending

	public void implicitWait(long arg) {
		driver.manage().timeouts().implicitlyWait(arg, TimeUnit.SECONDS);

	}

	public void webDriverWait(long arg, String xpathExpression) {

		WebDriverWait w = new WebDriverWait(driver, arg);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));

	}

	public void fluentWait(long arg0, long arg1, String xpathExpression) {
		Wait wa = new FluentWait(driver).withTimeout(Duration.ofSeconds(arg0)).pollingEvery(Duration.ofSeconds(arg1))
				.ignoring(NoSuchElementException.class);

		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));
	}

	public void selectByIndex(WebElement element, String index) {
		Select s = new Select(element);
		s.selectByValue(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public void selectByVisibletext(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public void deselectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public void deselectByValue(WebElement element, String value) {

		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public void deselectByVisibletext(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByVisibleText(value);
	}


	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	
	public void deteleCookie(Cookie arg) {
		driver.manage().deleteCookie(arg);
	}
}
