package ru.qa.armada.n03_applicationStructure.armadaMainPage;

import ru.qa.armada.n03_applicationStructure.armadaMainPage.commandCentre.CommandCentre;
import ru.qa.armada.n03_applicationStructure.armadaMainPage.upperRightPanel.UpperRightPanel;

public class ArmadaMainPage {
  private CommandCentre commandCentre;
  private UpperRightPanel upperRightPanel;

  public ArmadaMainPage() {
    commandCentre = new CommandCentre();
    upperRightPanel = new UpperRightPanel();
  }

  public CommandCentre getCommandCentre() {
    return commandCentre;
  }
  public UpperRightPanel getUpperRightPanel() {
    return upperRightPanel;
  }
}
