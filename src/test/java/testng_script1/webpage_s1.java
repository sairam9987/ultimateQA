package testng_script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webpage_s1 {

	WebDriver driver;

	@BeforeTest
	public void opening_wedpage() throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Sairam\\eclipse-workspace\\webautomationscript1\\resorces\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Open ultimateqa homepage
		driver.get("https://ultimateqa.com/");
		Thread.sleep(2000);
		System.out.println("Browser loaded successfully");
		// driver.findElement(By.xpath("//*[@id=\"tve_editor\"]/div/a")).click();
	}

	@Test(priority = 1)
	public void home_page() throws InterruptedException {

		String verify_title = driver.getTitle();
		if (verify_title.equals("Homepage - Ultimate QA")) {
			System.out.println("Title is verified");

		} else {
			System.out.println(
					" title canot be verify (Condition fail so code does not  be exist reverify the code once in title script block)");
		}

	}// checking the service page elements

	@Test(priority = 2)
	public void open_page() throws InterruptedException {
		WebElement nav_icon_text = driver.findElement(By.xpath("//img[@title='hero-image']"));
		if (nav_icon_text.isDisplayed()) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@id='menu-main-menu']//a[normalize-space()='Services']")).click();
			Thread.sleep(5000);

		} else {
			System.out.println("pagefailed");
		}
	}

	@Test(priority = 3)
	public void services_page_container1() throws InterruptedException {
		WebElement services_page_heading = driver.findElement(By.xpath("//h1[@class='et_pb_module_heading']"));
		if (services_page_heading.isDisplayed()) {

			System.out.println("Service Page was Loaded Successfully");

			Thread.sleep(3000);
			WebElement smc_heading = driver.findElement(By.xpath("//h1[@class='et_pb_module_heading']"));
			if (smc_heading.isDisplayed()) {
				Thread.sleep(3000);
				WebElement smc_Paragraph = driver.findElement(By.xpath("//p[@class='p1']"));
				if (smc_Paragraph.isDisplayed()) {
					Thread.sleep(3000);
					WebElement smc_schdulebutton = driver
							.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_light']"));
					if (smc_schdulebutton.isDisplayed() && smc_schdulebutton.isEnabled()) {
						Thread.sleep(3000);
						WebElement smc_image = driver.findElement(By.xpath("//img[@title='Header']"));
						if (smc_image.isDisplayed()) {
							Thread.sleep(3000);
							System.out.println("Services Page container1 Loaded Sucessfull ");
						}
					}
				}
			}
		} else {
			System.out.println("Services Page container1 Loading failed");
		}

	}

	@Test(priority = 4)
	public void scrollintoview1() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrollview = driver.findElement(
				By.xpath("//div[@class='et_pb_section et_pb_section_1 et_pb_with_background et_section_regular']"));
		js.executeScript("arguments[0].scrollIntoView(true);", scrollview);

	}

	@Test(priority = 5)
	public void service_page_container2() throws InterruptedException {

		WebElement services_page_heading2 = driver
				.findElement(By.xpath("//h2[normalize-space()='Our Professional Services']"));
		if (services_page_heading2.isDisplayed()) {
			Thread.sleep(3000);
			WebElement smc_pragraph2 = driver.findElement(
					By.xpath("//p[contains(text(),'is the cost of potential software downtime (Gartne')]"));
			if (smc_pragraph2.isDisplayed()) {
				Thread.sleep(3000);
				WebElement smc_Paragraph3 = driver
						.findElement(By.xpath("//strong[normalize-space()='We mitigate downtime!']"));
				if (smc_Paragraph3.isDisplayed()) {
					Thread.sleep(3000);
					WebElement smc_seletedicon1 = driver.findElement(By.xpath(
							"//div[@class='et_builder_inner_content et_pb_gutters2']//div[1]//div[1]//div[1]//div[2]//h2[1]"));
					if (smc_seletedicon1.isDisplayed()) {
						Thread.sleep(3000);
						WebElement smc_seletedicon2 = driver.findElement(By.xpath(
								"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]"));
						if (smc_seletedicon2.isDisplayed()) {
							Thread.sleep(3000);
							WebElement smc_seletedicon3 = driver.findElement(By.xpath(
									"//span[contains(text(),'Crafting a successful testing strategy is a corner')]"));
							if (smc_seletedicon3.isDisplayed()) {
								Thread.sleep(3000);
								WebElement smc_seletedicon4 = driver.findElement(By.xpath(
										"//span[contains(text(),'Empower your team with the latest skills and knowl')]"));
								if (smc_seletedicon4.isDisplayed()) {
									Thread.sleep(3000);
									WebElement smc_seletedicon5 = driver.findElement(By.xpath(
											"//span[contains(text(),'At UltimateQA, we specialize in automating web, mo')]"));
									if (smc_seletedicon5.isDisplayed()) {
										Thread.sleep(3000);
										WebElement smc_seletedicon6 = driver.findElement(By.xpath(
												"//div[contains(@class,'et_pb_row et_pb_row_2 et_pb_gutters1 et_pb_row_6col')]//div[contains(@class,'et_pb_css_mix_blend_mode_passthrough et-last-child')]//div[contains(@class,'et_pb_blurb_position_top et_pb_bg_layout_light')]"));
										if (smc_seletedicon6.isDisplayed()) {
											Thread.sleep(3000);
											System.out.println("Services Page container2 Loaded Sucessfull ");
										}
									}
								}
							}
						}

					}
				}
			}

		} else {
			System.out.println("Services Page container2 Loading Failed ");
		}
	}

	@Test(priority = 6)
	public void scrollintoview2() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrollview2 = driver.findElement(By.xpath(
				"//div[@class='et_pb_section et_pb_section_2 about-section et_pb_with_background et_section_regular']"));
		js.executeScript("arguments[0].scrollIntoView(true);", scrollview2);

	}

	@Test(priority = 7)
	public void service_page_container3() throws InterruptedException {

		WebElement services_page_heading3 = driver
				.findElement(By.xpath("//h2[normalize-space()='Leading the World In Automated Testing']"));
		if (services_page_heading3.isDisplayed()) {
			Thread.sleep(3000);
			WebElement smc_pragraph3 = driver.findElement(
					By.xpath("//p[contains(text(),'Ultimate QA is your one-stop solution for all your')]"));
			if (smc_pragraph3.isDisplayed()) {
				Thread.sleep(3000);
				WebElement smc_image1 = driver.findElement(By.xpath("//img[contains(@title,'about - enterprise')]"));
				if (smc_image1.isDisplayed()) {
					Thread.sleep(3000);
					WebElement smc_image2 = driver.findElement(By.xpath("//img[@title='about - enterprise']"));
					if (smc_image2.isDisplayed()) {
						Thread.sleep(3000);
						WebElement smc_seletediconi1 = driver.findElement(By.xpath(
								"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]"));
						if (smc_seletediconi1.isDisplayed()) {
							Thread.sleep(3000);
							WebElement smc_seletediconi2 = driver.findElement(By.xpath(
									"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]/div[1]"));
							if (smc_seletediconi2.isDisplayed()) {
								Thread.sleep(3000);
								WebElement smc_seletedicon5 = driver.findElement(By.xpath(
										"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/a[1]"));
								if (smc_seletedicon5.isDisplayed() && smc_seletedicon5.isEnabled()) {
									Thread.sleep(3000);

									System.out.println("Services Page container3 Loaded Sucessfull ");

								}
							}
						}
					}

				}
			}

		} else {
			System.out.println("Services Page container3 Loading Failed ");
		}
	}

	@Test(priority = 8)
	public void scrollintoview3() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrollview3 = driver.findElement(
				By.xpath("//div[@class='et_pb_section et_pb_section_3 et_pb_with_background et_section_regular']"));
		js.executeScript("arguments[0].scrollIntoView(true);", scrollview3);

	}

	@Test(priority = 9)
	public void service_page_container4() throws InterruptedException {

		WebElement services_page_heading4 = driver
				.findElement(By.xpath("//h2[normalize-space()='Just some of our results']"));
		if (services_page_heading4.isDisplayed()) {
			Thread.sleep(3000);
			WebElement smc_pragraph4 = driver
					.findElement(By.xpath("//div[contains(@class,'et_pb_row et_pb_row_7')]//p"));
			if (smc_pragraph4.isDisplayed()) {
				Thread.sleep(3000);
				WebElement smc_image11 = driver.findElement(By.xpath("//img[@title='workplace']"));
				if (smc_image11.isDisplayed()) {
					Thread.sleep(3000);
					WebElement services_page_heading41 = driver
							.findElement(By.xpath("//h3[normalize-space()='AUTOMATION PROGRAM FROM SCRATCH']"));
					if (services_page_heading41.isDisplayed()) {
						Thread.sleep(3000);
						WebElement smc_pragraph41 = driver.findElement(
								By.xpath("//p[contains(text(),'Achieved 8-Hour Daily Time Savings and 4-Minute Fe')]"));
						if (smc_pragraph41.isDisplayed()) {
							Thread.sleep(3000);
							WebElement smc_link1 = driver.findElement(By.xpath(
									"//a[@class='et_pb_button et_pb_button_3 show-full-story et_pb_bg_layout_light']"));
							if (smc_link1.isDisplayed() && smc_link1.isEnabled()) {
								Thread.sleep(3000);
								smc_link1.click();
								Thread.sleep(3000);
								JavascriptExecutor js = (JavascriptExecutor) driver;
								WebElement scrollviewi1 = driver.findElement(By.xpath(
										"/html[1]/body[1]/div[1]/div[1]/div[1]/footer[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
								js.executeScript("arguments[0].scrollIntoView(true);", scrollviewi1);
								Thread.sleep(3000);

								driver.navigate().back();

								System.out.println("Services Page container4 Loaded Sucessfull ");

							}
						}
					}
				}

			}
		}

		else {
			System.out.println("Services Page container4 Loading Failed ");
		}
	}

	@Test(priority = 10)
	public void service_page_container5() throws InterruptedException {
		WebElement smc_headdingi13 = driver
				.findElement(By.xpath("//h3[contains(text(),'Insurance company reduces feedback cycle by 82% us')]"));
		if (smc_headdingi13.isDisplayed()) {
			Thread.sleep(3000);
			WebElement smc_paragraphi13 = driver.findElement(
					By.xpath("//p[contains(text(),'An insurance company sped up its test feedback loo')]"));
			if (smc_paragraphi13.isDisplayed()) {
				Thread.sleep(3000);
				WebElement smc_imagei13 = driver.findElement(By.xpath("//img[contains(@title,'firm')]"));
				if (smc_imagei13.isDisplayed()) {
					Thread.sleep(3000);
					WebElement smc_seletediconi13 = driver.findElement(By
							.xpath("//a[@class='et_pb_button et_pb_button_4 show-full-story et_pb_bg_layout_light']"));
					if (smc_seletediconi13.isDisplayed() && smc_seletediconi13.isEnabled()) {
						Thread.sleep(3000);
						smc_seletediconi13.click();
						Thread.sleep(3000);
						JavascriptExecutor js = (JavascriptExecutor) driver;
						WebElement scrollviewi13 = driver.findElement(By.xpath(
								"//div[@class='et_pb_section et_pb_section_0_tb_footer et_pb_with_background et_section_regular et_pb_section--with-menu']"));
						js.executeScript("arguments[0].scrollIntoView(true);", scrollviewi13);
						Thread.sleep(3000);

						driver.navigate().back();
						System.out.println("Services Page container5 Loaded Sucessfull ");

					}
				}
			}

		}

		else {
			System.out.println("Services Page container5 Loading Failed ");
		}

	}

	@Test(priority = 11)
	public void service_page_container6() throws InterruptedException {
		WebElement smc_headdingi14 = driver.findElement(By.xpath("//h3[normalize-space()='66% FASTER FEEDBACK LOOP']"));
		if (smc_headdingi14.isDisplayed()) {
			Thread.sleep(3000);
			WebElement smc_paragraphi14 = driver.findElement(
					By.xpath("//p[contains(text(),'Automation Elevated a Hospitality Business by Cutt')]"));
			if (smc_paragraphi14.isDisplayed()) {
				Thread.sleep(3000);
				WebElement smc_imagei14 = driver.findElement(By.xpath("//img[contains(@title,'laptop')]"));
				if (smc_imagei14.isDisplayed()) {
					Thread.sleep(3000);
					WebElement smc_seletediconi14 = driver.findElement(By
							.xpath("//a[@class='et_pb_button et_pb_button_7 show-full-story et_pb_bg_layout_light']"));
					if (smc_seletediconi14.isDisplayed() && smc_seletediconi14.isEnabled()) {
						Thread.sleep(3000);
						smc_seletediconi14.click();
						Thread.sleep(3000);
						JavascriptExecutor js = (JavascriptExecutor) driver;
						WebElement scrollviewi14 = driver.findElement(By.xpath(
								"//div[@class='et_pb_section et_pb_section_0_tb_footer et_pb_with_background et_section_regular et_pb_section--with-menu']"));
						js.executeScript("arguments[0].scrollIntoView(true);", scrollviewi14);
						Thread.sleep(3000);

						driver.navigate().back();
						System.out.println("Services Page container6 Loaded Sucessfull ");

					}
				}
			}

		}

		else {
			System.out.println("Services Page container6 Loading Failed ");
		}

	}

	@Test(priority = 12)
	public void scrollintoview4() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrollview4 = driver.findElement(By.xpath(
				"//div[@class='et_pb_button_module_wrapper et_pb_button_13_wrapper et_pb_button_alignment_center et_pb_module ']"));
		js.executeScript("arguments[0].scrollIntoView(true);", scrollview4);

	}

	@Test(priority = 13)
	public void footer_tab() throws InterruptedException {
		WebElement smc_headdingi14 = driver.findElement(By.xpath(
				"//div[contains(@class,'et_pb_section et_pb_section_0_tb_footer et_pb_with_background et_section_regular et_pb_section--with-menu')]"));
		if (smc_headdingi14.isDisplayed()) {
			Thread.sleep(3000);
			WebElement smc_paragraphi14 = driver
					.findElement(By.xpath("//div[@class='et_pb_row et_pb_row_1_tb_footer']//div[1]//div[1]//div[1]"));
			if (smc_paragraphi14.isDisplayed()) {
				Thread.sleep(3000);
				System.out.println("Services Page footertab Loaded Sucessfully ");
				driver.navigate().back();
			}

		} else {
			System.out.println("Services Page footertab Loading Failed ");
		}

	}

	@AfterTest
	public void closing_page() {
		System.out.println("Services page testcases was Completed ");
		driver.quit();// closing the browser
	}
}
