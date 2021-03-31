package io.cucumber.stephanie.pages;
import io.cucumber.stephanie.services.Settings;

import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;

public class Shared {

  @Dado("que estou na pagina do formulario {string}")
  public void que_estou_na_pagina_do_formulario(String string) {
    Settings.open(string);
  }

  @Quando("eu estou na aba {string} do formulario")
  public void eu_estou_na_aba_do_formulario(String string) {
    String tab = Settings.browser.findElement(By.cssSelector("#idealsteps-nav > ul > li.idealsteps-step-active")).getText();
    assertEquals(string, (tab.split("\n")[0]));
  }

  @Entao("eu vou para a aba {string}")
  public void eu_vou_para_a_aba(String string) {
    String tab = Settings.browser.findElement(By.cssSelector("#idealsteps-nav > ul > li.idealsteps-step-active")).getText();
    assertEquals(string, (tab.split("\n")[0]));
  }
}
