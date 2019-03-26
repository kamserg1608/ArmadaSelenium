package ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks.n03_equipment;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.qa.armada.n01_workWithWebElement.elementDecorator.CustomFieldDecorator;
import ru.qa.armada.n01_workWithWebElement.webPageElements.Button;
import ru.qa.armada.n01_workWithWebElement.webPageElements.TabElement;
import ru.qa.armada.n02_appManagerForTest.SingletonWaitingItem;
import ru.qa.armada.n02_appManagerForTest.SingletonWebDriver;
import ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks.n03_equipment.n01_rangeParameters.RangeParameters;

public class Equipment{

  private RangeParameters rangeParameters;

  @FindBy(xpath = "//span[@class='x-tree3-node-text' and text()='Оборудование']")
  private TabElement tabEquipment;
  @FindBy(xpath = "//span[text()='Заводской номер']/ancestor::tbody//td[1]/div")
  private Button nameOfEquipment;

  public Equipment() {
    PageFactory.initElements(new CustomFieldDecorator(SingletonWebDriver.driver),this);
    rangeParameters = new RangeParameters();
  }

  public void activateTabEquipment(){
    tabEquipment.click();
  }

  public void selectEquipment(){
    nameOfEquipment.click();
  }

  public void addEquipment(){
    activateTabEquipment();
    SingletonWaitingItem.sleep(2000);
    selectEquipment();
    SingletonWaitingItem.sleep(2000);
    rangeParameters.addComplexRange();
  }


}
