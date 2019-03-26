package ru.qa.armada.n02_appManagerForTest;

import ru.qa.armada.n03_applicationStructure.armadaMainPage.ArmadaMainPage;
import ru.qa.armada.n03_applicationStructure.loginPage.LoginPage;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private LoginPage loginPage;
  private ArmadaMainPage armadaMainPage;

  public void init() {
    SingletonWebDriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    SingletonWebDriver.driver.manage().window().maximize();
    SingletonWebDriver.driver.navigate().to("http://localhost:8080/armada");

    loginPage = new LoginPage();
    armadaMainPage = new ArmadaMainPage();
    loginPage.submitAutorization("admin", "admin");
  }

  public void stop() {
    SingletonWebDriver.driver.quit();
  }

  public LoginPage getLoginPage() {
    return loginPage;
  }

  public ArmadaMainPage getArmadaMainPage() {
    return armadaMainPage;
  }
}
