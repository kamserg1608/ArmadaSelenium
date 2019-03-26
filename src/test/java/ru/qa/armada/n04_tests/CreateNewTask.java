package ru.qa.armada.n04_tests;

import org.testng.annotations.Test;
import ru.qa.armada.n02_appManagerForTest.TestBase;

public class CreateNewTask extends TestBase {

  @Test
  public void testCreateNewTask() {
    System.out.println("AAB");
    app.getArmadaMainPage().getCommandCentre().getRadioMonitoring().getTasks().addTask();
  }
}
