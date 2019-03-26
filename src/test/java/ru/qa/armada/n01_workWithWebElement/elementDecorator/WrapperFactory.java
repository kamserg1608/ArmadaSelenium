package ru.qa.armada.n01_workWithWebElement.elementDecorator;

import org.openqa.selenium.WebElement;

public class WrapperFactory {
  /**
   * Создает экземпляр класса,
   * реализующий IElement интерфейс,
   * вызывая конструктор с аргументом WebElement
   */
  public static IElement createInstance(Class<IElement> clazz, WebElement element) {
    try {
      return clazz.getConstructor(WebElement.class).
              newInstance(element);
    } catch (Exception e) {
      throw new AssertionError("WebElement can't be represented as " + clazz);
    }
  }
}
