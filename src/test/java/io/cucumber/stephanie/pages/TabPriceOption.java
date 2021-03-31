package io.cucumber.stephanie.pages;
import io.cucumber.stephanie.services.Settings;

import io.cucumber.java.pt.*;
import org.openqa.selenium.By;

public class TabPriceOption {
  
  @Quando("seleciono uma opcao")
  public void seleciono_uma_opcao() {
    Settings.browser.findElement(By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1)")).click();
  }

  @Quando("clico no botao next de price")
  public void clico_no_botao_next_de_price() throws InterruptedException {
    Thread.sleep(2000);
    Settings.browser.findElement(By.cssSelector("#nextsendquote")).click();
  }
}
