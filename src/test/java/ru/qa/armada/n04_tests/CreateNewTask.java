package ru.qa.armada.n04_tests;

import org.testng.annotations.Test;
import ru.qa.armada.n02_appManagerForTest.TestBase;
import ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks.Tasks;

public class CreateNewTask extends TestBase {

  @Test
  public void testCreateNewTask() {
    System.out.println("AAB");
//    app.getArmadaMainPage().getCommandCentre().getRadioMonitoring().getTasks().addTask();
    Tasks addFirstTask = new Tasks();
    addFirstTask.addTask1();




  }
}
