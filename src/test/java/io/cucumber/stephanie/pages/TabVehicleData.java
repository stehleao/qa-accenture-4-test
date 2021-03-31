package io.cucumber.stephanie.pages;
import io.cucumber.stephanie.services.Settings;

import java.util.Map;
import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.support.ui.Select;

public class TabVehicleData {
  
  @Quando("preencho os campos com os valores do veiculo")
  public void preencho_os_campos_com_os_valores_do_veiculo(DataTable dataTable) {
    Map<String,String> dataTableAsMap = dataTable.asMap(String.class, String.class);

    Select make = new Select(Settings.browser.findElement(By.id("make")));
    make.selectByVisibleText(dataTableAsMap.get("make"));

    Select model = new Select(Settings.browser.findElement(By.id("model")));
    model.selectByVisibleText(dataTableAsMap.get("model"));

    Settings.browser.findElement(By.id("cylindercapacity")).sendKeys(dataTableAsMap.get("cylindercapacity"));
    Settings.browser.findElement(By.id("engineperformance")).sendKeys(dataTableAsMap.get("engineperformance"));
    Settings.browser.findElement(By.id("dateofmanufacture")).sendKeys(dataTableAsMap.get("dateofmanufacture"));
    
    Select numberofseats = new Select(Settings.browser.findElement(By.id("numberofseats")));
    numberofseats.selectByVisibleText(dataTableAsMap.get("numberofseats"));

    String righthanddrive = dataTableAsMap.get("righthanddrive");
    WebElement yes = Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span"));
    WebElement no = Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span"));
    
    if (righthanddrive.contains("Yes"))
      yes.click();
    no.click();
      
    Select numberofseatsmotorcycle = new Select(Settings.browser.findElement(By.id("numberofseatsmotorcycle")));
    numberofseatsmotorcycle.selectByVisibleText(dataTableAsMap.get("numberofseatsmotorcycle"));

    Select fuel = new Select(Settings.browser.findElement(By.id("fuel")));
    fuel.selectByVisibleText(dataTableAsMap.get("fuel"));

    Settings.browser.findElement(By.id("payload")).sendKeys(dataTableAsMap.get("payload"));
    Settings.browser.findElement(By.id("totalweight")).sendKeys(dataTableAsMap.get("totalweight"));
    Settings.browser.findElement(By.id("listprice")).sendKeys(dataTableAsMap.get("listprice"));
    Settings.browser.findElement(By.id("licenseplatenumber")).sendKeys(dataTableAsMap.get("licenseplatenumber"));
    Settings.browser.findElement(By.id("annualmileage")).sendKeys(dataTableAsMap.get("annualmileage"));

  }

  @Quando("clico no botao next de veiculo")
  public void clico_no_botao_next_de_veiculo() {
    Settings.browser.findElement(By.cssSelector("#nextenterinsurantdata")).click();
  }
}
