package ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks.n01_typicalTask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.qa.armada.n01_workWithWebElement.elementDecorator.CustomFieldDecorator;
import ru.qa.armada.n01_workWithWebElement.webPageElements.Button;
import ru.qa.armada.n01_workWithWebElement.webPageElements.TabElement;
import ru.qa.armada.n01_workWithWebElement.webPageElements.TextField;
import ru.qa.armada.n01_workWithWebElement.webPageElements.WaitElement;
import ru.qa.armada.n02_appManagerForTest.SingletonWaitingItem;
import ru.qa.armada.n02_appManagerForTest.SingletonWebDriver;

public class TypicalTask {

  @FindBy(xpath = "//span[@class='x-tree3-node-text' and text()='Типовая задача']")
  private TabElement tabTask;

  @FindBy(xpath = "//input[@id='testid_name_typical_task_RcTaskDialog-input']")
  private TextField taskNameField;

  @FindBy(xpath = "//table[@id='testid_select_commonTaskDialogSelectorField_RcTaskDialog']//td[@class='x-btn-mc']//button")
  private Button openSampleTasks;

  @FindBy(xpath = "//div[starts-with(text(),'Измерение па') and contains(@class, 'x-grid3-col-name')]/ancestor::div[1]")
  private Button measurementSignalParameters;

  @FindBy(xpath = "//span[text()='Выбор типовой задачи']")
  private WaitElement taskSelectionPanel;

  @FindBy(xpath = "//button[@class='x-btn-text ' and contains(text(),'Выбрать')]")
  private Button applyTypicalTaskSelection;

//div[starts-with(text(),'Измерение') and contains(@class, 'x-grid3-col-name')]/ancestor::div[contains(@class,'x-grid3-row-selected')]
  public TypicalTask() {
    PageFactory.initElements(new CustomFieldDecorator(SingletonWebDriver.driver),this);
  }

  public void activateTabTask(){
    tabTask.click();
  }

  public void chooseTypicalTask(){
    String taskName = "AZAZ";
    taskNameField.setText(taskName);
    openSampleTasks.click();
    SingletonWaitingItem.waitElementVisibly(measurementSignalParameters);
    measurementSignalParameters.click();
    try {
      SingletonWaitingItem.waitElementAttributeContain(measurementSignalParameters,"class", "x-grid3-highlightrow");
    } catch (Exception e) {
      System.out.println(e);
    }
    applyTypicalTaskSelection.click();
  }
}
