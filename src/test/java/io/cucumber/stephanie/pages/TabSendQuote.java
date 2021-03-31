package io.cucumber.stephanie.pages;
import io.cucumber.stephanie.services.Settings;

import java.util.Map;
import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import io.cucumber.datatable.DataTable;

public class TabSendQuote {
  
  @Quando("preencho os campos com os valores de quote")
  public void preencho_os_campos_com_os_valores_de_quote(DataTable dataTable) {
    Map<String,String> dataTableAsMap = dataTable.asMap(String.class, String.class);

    Settings.browser.findElement(By.id("email")).sendKeys(dataTableAsMap.get("email"));
    Settings.browser.findElement(By.id("phone")).sendKeys(dataTableAsMap.get("phone"));
    Settings.browser.findElement(By.id("username")).sendKeys(dataTableAsMap.get("username"));
    Settings.browser.findElement(By.id("password")).sendKeys(dataTableAsMap.get("password"));
    Settings.browser.findElement(By.id("confirmpassword")).sendKeys(dataTableAsMap.get("confirmpassword"));

    Settings.browser.findElement(By.id("Comments")).sendKeys(dataTableAsMap.get("comments"));
  }

  @Quando("clico no botao send de quote")
  public void clico_no_botao_next_de_quote() {
    Settings.browser.findElement(By.cssSelector("#sendemail")).click();
  }
  @Entao("eu recebo a mensagem de sucesso")
  public void eu_recebo_a_mensagem_de_sucesso() throws InterruptedException {
    Thread.sleep(10000);
    Settings.browser.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button")).click();
    Settings.close();
  }
}
