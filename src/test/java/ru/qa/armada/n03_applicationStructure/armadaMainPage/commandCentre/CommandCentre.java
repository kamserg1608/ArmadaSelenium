package ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre;

import org.openqa.selenium.WebDriver;
import ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.n01_radioMonitoring.RadioMonitoring;

public class CommandCentre {

  private RadioMonitoring radioMonitoring;

  public CommandCentre() {
    radioMonitoring = new RadioMonitoring();
  }

  public RadioMonitoring getRadioMonitoring() {
    return radioMonitoring;
  }
}
