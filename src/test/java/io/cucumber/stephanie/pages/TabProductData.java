package io.cucumber.stephanie.pages;
import io.cucumber.stephanie.services.Settings;

import java.util.Map;
import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.support.ui.Select;

public class TabProductData {
  
  @Quando("preencho os campos com os valores do produto")
  public void preencho_os_campos_com_os_valores_do_produto(DataTable dataTable) {
    Map<String,String> dataTableAsMap = dataTable.asMap(String.class, String.class);

    Settings.browser.findElement(By.id("startdate")).sendKeys(dataTableAsMap.get("startdate"));

    Select insurancesum = new Select(Settings.browser.findElement(By.id("insurancesum")));
    insurancesum.selectByVisibleText(dataTableAsMap.get("insurancesum"));

    Select meritrating = new Select(Settings.browser.findElement(By.id("meritrating")));
    meritrating.selectByVisibleText(dataTableAsMap.get("meritrating"));

    Select damageinsurance = new Select(Settings.browser.findElement(By.id("damageinsurance")));
    damageinsurance.selectByVisibleText(dataTableAsMap.get("damageinsurance"));

    String[] optionalproducts = dataTableAsMap.get("optionalproducts").split(",");
    for(int i = 0; i < optionalproducts.length; i++){
      if(optionalproducts[i].equals("Euro Protection")) {
        Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span")).click();
      } else if (optionalproducts[i].equals("Legal Defense Insurance")) {
        Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span")).click();
      } 
    }

    Select courtesycar = new Select(Settings.browser.findElement(By.id("courtesycar")));
    courtesycar.selectByVisibleText(dataTableAsMap.get("courtesycar"));    
  }

  @Quando("clico no botao next de produto")
  public void clico_no_botao_next_de_produto() {
    Settings.browser.findElement(By.cssSelector("#nextselectpriceoption")).click();
  }
}
