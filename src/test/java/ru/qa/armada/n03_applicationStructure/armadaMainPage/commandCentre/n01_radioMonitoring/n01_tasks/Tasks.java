package ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.qa.armada.n01_workWithWebElement.elementDecorator.CustomFieldDecorator;
import ru.qa.armada.n01_workWithWebElement.webPageElements.Button;
import ru.qa.armada.n01_workWithWebElement.webPageElements.TabElement;
import ru.qa.armada.n01_workWithWebElement.webPageElements.WaitElement;
import ru.qa.armada.n02_appManagerForTest.SingletonWaitingItem;
import ru.qa.armada.n02_appManagerForTest.SingletonWebDriver;
import ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks.n01_typicalTask.TypicalTask;
import ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks.n02_frequincies.Frequincies;
import ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks.n03_equipment.Equipment;

public class Tasks{

  private TypicalTask typicalTask;
  private Frequincies frequincies;
  private Equipment equipment;

  @FindBy(xpath = "//span[text()='Задания']")
  private TabElement tabTask;
  @FindBy(xpath = "//label[text()='Задания']")
  private WaitElement labelTask;
  @FindBy(xpath = "//button[text()='Добавить']")
  private Button buttonAddTask;
  @FindBy(xpath = "//table[@id='OK-RcTaskDialog']//button[text()='Сохранить']")
  private Button safeCreateTaskRadioControl;
  @FindBy(xpath = "//input[@id='testid_name_typical_task_RcTaskDialog-input']")
  private WaitElement taskNameField;

  public TypicalTask getTypicalTask() {
    return typicalTask;
  }

  public Tasks() {
    PageFactory.initElements(new CustomFieldDecorator(SingletonWebDriver.driver),this);
    typicalTask = new TypicalTask();
    frequincies = new Frequincies();
    equipment = new Equipment();
  }

  public void addTask(){
    tabTask.click();
    SingletonWaitingItem.waitElementVisibly(labelTask);
    buttonAddTask.click();
    SingletonWaitingItem.waitElementVisibly(taskNameField);
    typicalTask.chooseTypicalTask();
    frequincies.addFrequency();
    equipment.addEquipment();
    safeCreateTaskRadioControl.click();
  }
}
