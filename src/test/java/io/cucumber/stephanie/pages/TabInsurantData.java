package io.cucumber.stephanie.pages;
import io.cucumber.stephanie.services.Settings;

import java.util.Map;
import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.support.ui.Select;

public class TabInsurantData {
  
  @Quando("preencho os campos com os valores do seguro")
  public void preencho_os_campos_com_os_valores_do_seguro(DataTable dataTable) throws InterruptedException {
    Thread.sleep(2000);
    Map<String,String> dataTableAsMap = dataTable.asMap(String.class, String.class);

    Settings.browser.findElement(By.id("firstname")).sendKeys(dataTableAsMap.get("firstname"));
    Settings.browser.findElement(By.id("lastname")).sendKeys(dataTableAsMap.get("lastname"));
    Settings.browser.findElement(By.id("birthdate")).sendKeys(dataTableAsMap.get("birthdate"));

    String gender = dataTableAsMap.get("gender");
    WebElement male = Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span"));
    WebElement female = Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span"));
    
    if (gender.contains("Male"))
      male.click();
    female.click();

    Settings.browser.findElement(By.id("streetaddress")).sendKeys(dataTableAsMap.get("streetaddress"));

    Select country = new Select(Settings.browser.findElement(By.id("country")));
    country.selectByVisibleText(dataTableAsMap.get("country"));

    Settings.browser.findElement(By.id("zipcode")).sendKeys(dataTableAsMap.get("zipcode"));
    Settings.browser.findElement(By.id("city")).sendKeys(dataTableAsMap.get("city"));

    Select occupation = new Select(Settings.browser.findElement(By.id("occupation")));
    occupation.selectByVisibleText(dataTableAsMap.get("occupation"));

    String[] hobbies = dataTableAsMap.get("hobbies").split(",");
    for(int i = 0; i < hobbies.length; i++){
      if(hobbies[i].equals("Speeding")) {
        Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span")).click();
      } else if (hobbies[i].equals("Bungee Jumping")) {
        Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span")).click();
      } else if (hobbies[i].equals("Cliff Diving")) {
        Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(3) > span")).click();
      } else if (hobbies[i].equals("Skydiving")) {
        Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(4) > span")).click();
      } else if (hobbies[i].equals("Other")) {
        Settings.browser.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5) > span")).click();
      }
    }

    Settings.browser.findElement(By.id("website")).sendKeys(dataTableAsMap.get("website"));

  }  

  @Quando("clico no botao next de seguro")
  public void clico_no_botao_next_de_seguro() {
    Settings.browser.findElement(By.cssSelector("#nextenterproductdata")).click();
  }
}
