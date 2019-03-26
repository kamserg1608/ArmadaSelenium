package ru.qa.armada.n03_applicationStructure.loginPage;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.qa.armada.n01_workWithWebElement.elementDecorator.CustomFieldDecorator;
import ru.qa.armada.n01_workWithWebElement.webPageElements.Button;
import ru.qa.armada.n01_workWithWebElement.webPageElements.TextField;
import ru.qa.armada.n01_workWithWebElement.webPageElements.WaitElement;
import ru.qa.armada.n02_appManagerForTest.SingletonWaitingItem;
import ru.qa.armada.n02_appManagerForTest.SingletonWebDriver;

public class LoginPage {

  @FindBy(xpath = "//span[text()='Пункт управления']")
  private WaitElement commandCentre;
  @FindBy(id = "j_username")
  private TextField loginLocator;
  @FindBy(id = "j_password")
  private TextField passwordLocator;
  @FindBy(id = "loginButton")
  private Button buttonLogin;
  @FindBy(xpath = "//h2[contains(text(),'Доступ запрещен, необходима авторизация.')]")
  private TextField incorrectMessage;

  public LoginPage() {
    PageFactory.initElements(new CustomFieldDecorator(SingletonWebDriver.driver), this);
  }

  public void writeUserName(String username) {
    loginLocator.setText(username);
  }

  public void writePassword(String password) {
    passwordLocator.setText(password);
  }

  public void submitLogin() {
    buttonLogin.click();
  }

  public void waitMainPage() {
    SingletonWaitingItem.waitElementVisibly(commandCentre);
  }

  public void submitAutorization(String username, String password) {
    writeUserName(username);
    writePassword(password);
    submitLogin();
    waitMainPage();
  }
}
