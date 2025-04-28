package pageTest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseUtill.BaseClass;
import io.restassured.RestAssured;

public class UnitTest extends BaseClass {
	@Test

	public void test01() {
		driver.get("https://www.selenium.dev/documentation/webdriver/troubleshooting/errors");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links  : " + links.size());

		for (WebElement element : links) {
			System.out.println(element.getAttribute("href"));
		}
	}

	@Test

	public void test02() {
		driver.get("https://www.selenium.dev/documentation/webdriver/troubleshooting/errors");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links  : " + links.size());
		
		int brokenLinksSize = 0;

		for (WebElement element : links) {
			String link = element.getAttribute("href");
			System.out.println(link);
			if (link.length() == 0) {// Empty link or broken link
				brokenLinksSize++;

			}
		}

		System.err.println("Total broken link =" + brokenLinksSize);

	}

	// Google - java net get request
	@Test

	public void test_with_restAssured() {
		driver.get("https://www.selenium.dev/documentation/webdriver/troubleshooting/errors");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.err.println("Number of links  : " + links.size());

		
	//int brokenLinksSize = 0;

		List<String> brokenLinkUrls = new ArrayList<>();

		for (WebElement element : links) {
			String link = element.getAttribute("href");
			System.out.println(link);
			
			if (link.length() == 0) {	 
				//brokenLinksSize++;
				brokenLinkUrls.add(link);

			} else {

				int statusCode = RestAssured.given().get(link).andReturn().statusCode();

				if (statusCode != 200) {//if it is not 200 so it will to the  broken
					System.err.println("Status code  - " + statusCode);
				// brokenLinksSize++;
					brokenLinkUrls.add(link);
				}
			}
		}
		// System.out.println("Total broken link =" + brokenLinksSize);
		System.err.println("Total size of brokenLinkUrls : " + brokenLinkUrls.size());
		System.out.println("Total size of brokenLinkUrls : " + brokenLinkUrls);
		// RestAssured in dependencies

	}

	@Test(enabled = false)

	public void testin_build_java() throws IOException, InterruptedException {
		driver.get("https://www.selenium.dev/documentation/webdriver/troubleshooting/errors");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links  : " + links.size());

		
//	int brokenLinksSize = 0;
		List<String> brokenLinkUrls = new ArrayList<>();

		for (WebElement element : links) {
			String link = element.getAttribute("href");
			System.out.println(link);
			if (link.length() == 0) {
//	 brokenLinksSize++;
				brokenLinkUrls.add(link);

			} else {
//Google= java.net get request = inBuild Library
				// A=A stand for Abstrac class
				// 1. Create an HttpClient
				HttpClient client = HttpClient.newHttpClient();
				// 2. Build the HttpRequest
				HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link)).GET().build();
				
                // 3. Send the request and handle the response 
				HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
				
              // 4. Process the response
				//System.out.println(response.statusCode());
				//System.out.println(response.body());
				
				int statusCode = response.statusCode();

				if (statusCode != 200) {
					System.out.println("Status code  - " + statusCode);
					// brokenLinksSize++;
					brokenLinkUrls.add(link);
				}
			}
		}
		// System.out.println("Total broken link =" + brokenLinksSize);
		System.err.println("Total size of brokenLinkUrls : " + brokenLinkUrls.size());
		System.out.println("Total size of brokenLinkUrls : " + brokenLinkUrls);
		// RestAssured in dependencies

	}

	@Test(enabled = false)

	public void testin_build_java_try_catch() {
		driver.get("https://www.selenium.dev/documentation/webdriver/troubleshooting/errors");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links  : " + links.size());

		

//	int brokenLinksSize = 0;
		List<String> brokenLinkUrls = new ArrayList<>();

		for (WebElement element : links) {
			String link = element.getAttribute("href");
			System.out.println(link);
			if (link.length() == 0) {
//	 brokenLinksSize++;
				brokenLinkUrls.add(link);

			} else {
				int statusCode = 0;
				try {
					HttpClient client = HttpClient.newHttpClient();
					HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link)).GET().build();

					HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
					statusCode = response.statusCode();
				} catch (Exception e) {
				}
				if (statusCode != 200) {
					System.out.println("Status code  - " + statusCode);
					brokenLinkUrls.add(link);
				}

			}
		}
		// System.out.println("Total broken link =" + brokenLinksSize);
		System.err.println("Total size of brokenLinkUrls : " + brokenLinkUrls.size());
		System.out.println("Total size of brokenLinkUrls : " + brokenLinkUrls);
		// RestAssured in dependencies

	}
}
