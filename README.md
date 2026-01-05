Amazon Automation Test with Selenium
Overview
This project automates basic Amazon operations using Selenium WebDriver with Java.
It includes:

Searching for a product (e.g., "laptop")
Clicking the first search result
Switching to the product page tab
Scrolling to and clicking the Add to Cart button
Taking screenshots before and after adding to cart
Handling dynamic waits for page elements
Prerequisites
Java 17+ installed
Maven (optional, if using Maven project)
Chrome browser installed
ChromeDriver compatible with your Chrome version
Selenium Java 3.141.59 or higher
Setup Instructions
Clone the repository (or copy project to your local machine)

Download ChromeDriver compatible with your Chrome version:

Add ChromeDriver to PATH or specify the path in BaseTest.java:

System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

```java
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
