package ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks.n03_equipment.n01_rangeParameters;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.qa.armada.n01_workWithWebElement.elementDecorator.CustomFieldDecorator;
import ru.qa.armada.n01_workWithWebElement.webPageElements.Button;
import ru.qa.armada.n01_workWithWebElement.webPageElements.CheckBox;
import ru.qa.armada.n01_workWithWebElement.webPageElements.TextField;
import ru.qa.armada.n02_appManagerForTest.SingletonWaitingItem;
import ru.qa.armada.n02_appManagerForTest.SingletonWebDriver;

public class RangeParameters {

  @FindBy(xpath = "//table[@id='ADD_EQ_RANGE-RcTaskDialogPresenter']//button[text()='Добавить']")
  private Button add;
  @FindBy(xpath = "//input[@name='startValueUi']")
  private TextField leftRange;
  @FindBy(xpath = "//input[@name='endValueUi']")
  private TextField rightRange;
  @FindBy(xpath = "//input[@name='fixedThreshold']")
  private TextField fixedThreshold;
  @FindBy(xpath = "//input[@name='fixedThresholdUsed']")
  private CheckBox fixedThresholdUsed;
  @FindBy(xpath = "//input[@name='floatingThresholdUsed']")
  private CheckBox floatingThresholdUsed;
  @FindBy(xpath = "//input[@name='maskThresholdUsed']")
  private CheckBox maskThresholdUsed;
  @FindBy(xpath = "//table[@id='OK-RcTaskEquipmentRangeDialog']//button[text()='Сохранить']")
  private Button safeOfReceptionAndDetectionParametr;


  public RangeParameters() {
    PageFactory.initElements(new CustomFieldDecorator(SingletonWebDriver.driver),this);
  }

  public void addComplexRange(){
    addRange();
    SingletonWaitingItem.waitElementVisibly(leftRange);
    enteringRange();
    SingletonWaitingItem.sleep(2000);
    activateCheckBox();
    safe();
  }

  public void addRange(){
    add.click();
  }

  public void enteringRange(){
    String leftValueRange = "25";
    String rightValueRange = "3000";
    String fixedThresholdValue = "3000";
    leftRange.setText(leftValueRange);
    rightRange.setText(rightValueRange);
    fixedThreshold.setText(fixedThresholdValue);
  }

  public void activateCheckBox() {
    fixedThresholdUsed.setChecked(true);
    floatingThresholdUsed.setChecked(false);
    maskThresholdUsed.setChecked(false);
  }

  public void safe(){
    safeOfReceptionAndDetectionParametr.click();
  }



}
