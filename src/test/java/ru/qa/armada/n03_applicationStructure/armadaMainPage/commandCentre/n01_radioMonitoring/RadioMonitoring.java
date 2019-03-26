package ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring;

import org.openqa.selenium.WebDriver;
import ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.n01_tasks.Tasks;

public class RadioMonitoring {


  private Tasks tasks;

  public RadioMonitoring() {

    tasks = new Tasks();
  }

  public Tasks getTasks() {
    return tasks;
  }
}
