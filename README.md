# :pushpin: Accademia Accenture 4.0 - Quality Assurance :pushpin:

O programa de capacitação e desenvolvimento é uma realização da parceria entre Accenture e Gama Academy.

## Descrição do desafio :page_with_curl:

Criar um projeto em Selenium Webdrive (Java) e Cucumber usando Page Objects. Para tanto, deve-se levar em conta as seguintes orientações:

<ul>
  <li>Entrar no site <http://sampleapp.tricentis.com/101/app.php></li>
  <li>Preencher o formulário, aba “Enter Vehicle Data” e pressione next</li>
  <li>Preencher o formulário, aba “Enter Insurant Data” e pressione next</li>
  <li>Preencher o formulário, aba “Enter Product Data” e pressione next</li>
  <li>Preencher o formulário, aba “Select Price Option” e pressione next</li>
  <li>Preencher o formulário, aba “Send Quote” e pressione Send</li>
  <li>Verificar a mensagem “Sending e-mail success!” na tela</li>
</ul>

--------------------------------------------------------------------------------

## Tecnologias utilizadas :wrench:

:heavy_check_mark: <b>Java</b> <br>
Linguagem de programação para desenvolvimento da aplicação <br>

:heavy_check_mark: <b>Maven</b> <br>
Gerenciador de dependências para o Java <br>

:heavy_check_mark: <b>Cucumber</b> <br>
Framework responsável por traduzir uma linguagem humana em código Java <br>

:heavy_check_mark: <b>Selenium</b> <br>
Framework responsável por fazer a integração do código Java com a linguagem Gherkin (Cucumber) <br>

--------------------------------------------------------------------------------

## Como utilizar :paperclip:

Clonar o projeto
```bash
git clone https://github.com/stehleao/qa-accenture-4-test.git
```

Entrar na pasta do projeto
```bash
cd qa-accenture-4-test
```

Configurar o selenium em sua máquina
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raíz do projeto: <br>https://chromedriver.chromium.org/downloads</br>

<br>Exemplo</br>
```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
```

Limpar e validar o Maven Unix
```bash
./mvnw clean
```

Limpar e validar o Maven Windows
```bash
./mvnw.cmd clean
```

Executando o teste no Unix
```bash
./test.sh
```
Executando o teste no Windows
```bash
test.bat
```






--------------------------------------------------------------------------------
