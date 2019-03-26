package ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks.n02_frequincies;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.qa.armada.n01_workWithWebElement.elementDecorator.CustomFieldDecorator;
import ru.qa.armada.n01_workWithWebElement.webPageElements.Button;
import ru.qa.armada.n01_workWithWebElement.webPageElements.TabElement;
import ru.qa.armada.n01_workWithWebElement.webPageElements.TextField;
import ru.qa.armada.n01_workWithWebElement.webPageElements.WaitElement;
import ru.qa.armada.n02_appManagerForTest.SingletonWaitingItem;
import ru.qa.armada.n02_appManagerForTest.SingletonWebDriver;

public class Frequincies{

  @FindBy(xpath = "//span[@class='x-tree3-node-text' and text()='Частоты']")
  private TabElement tabFrequency;
  @FindBy(xpath = "//span[@class='x-tab-strip-inner']//span[text()='Частоты']")
  private WaitElement bookmarkFrequency;
  @FindBy(xpath = "//em[@class='x-btn-arrow']//button[@class='x-btn-text ' and text()='Добавить']")
  private Button add;

  @FindBy(xpath = "//span[@id='ADD_FREQ-RcTaskDialogPresenter']")
  private Button frequency;

  @FindBy(xpath = "//span[text()='Добавление частоты']")
  private Button labelAddFrequency;

  @FindBy(xpath = "//input[@name='frequency.value']")
  private TextField frequencySet;
  @FindBy(xpath = "//input[@name='frequency.band']")
  private TextField bandSet;
  @FindBy(xpath = "//label[text()='Полоса, кГц*:']/ancestor::div[@class='x-window-bwrap']//button[text()='Сохранить']")
  private Button save;


  public Frequincies() {
    PageFactory.initElements(new CustomFieldDecorator(SingletonWebDriver.driver),this);
  }

  public void activateTabFrequency(){
    tabFrequency.click();
  }

  public void addFrequency(){
    activateTabFrequency();
    SingletonWaitingItem.waitElementVisibly(bookmarkFrequency);
    add.click();
    SingletonWaitingItem.waitElementVisibly(frequency);
    frequency.click();
    SingletonWaitingItem.waitElementVisibly(labelAddFrequency);
    String frequencyValue = "200";
    String bandValue = "200";
    frequencySet.setText(frequencyValue);
    bandSet.setText(bandValue);
    save.click();
  }
}
