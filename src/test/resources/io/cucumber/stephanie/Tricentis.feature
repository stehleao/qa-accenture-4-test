# language: pt
# @ignore

Funcionalidade: Formulário de solicitação de seguro
  Rotina de testes aplicadas a validação de um formulário de solicitação de seguro para veículos

  Cenário: Preenchimento do formulario de solicitacao de seguro

  Dado que estou na pagina do formulario "http://sampleapp.tricentis.com/101/app.php"

    Quando eu estou na aba "Enter Vehicle Data" do formulario
    E preencho os campos com os valores do veiculo
        | campos                      | valores          |
        | make                        | Audi             |
        | model                       | Scooter          |
        | cylindercapacity            | 200              |
        | engineperformance           | 450              |
        | dateofmanufacture           | 01/07/2001       |
        | numberofseats               | 2                |
        | righthanddrive              | No               |
        | numberofseatsmotorcycle     | 2                |
        | fuel                        | Diesel           |
        | payload                     | 200              |
        | totalweight                 | 1100             |
        | listprice                   | 4000             |
        | licenseplatenumber          | ABC-1258         |
        | annualmileage               | 5000             |
    E clico no botao next de veiculo
    Entao eu vou para a aba "Enter Insurant Data"

    
    Quando eu estou na aba "Enter Insurant Data" do formulario
    E preencho os campos com os valores do seguro
        | campos                      | valores          |
        | firstname                   | Bruna            |
        | lastname                    | Maciel           |
        | birthdate                   | 04/08/1999       |
        | gender                      | Female           |
        | streetaddress               | R. Teste         |
        | country                     | Brazil           |
        | zipcode                     | 89655555         |
        | city                        | Londrina         |
        | occupation                  | Employee         |
        | hobbies                     | Speeding,Other   |
        | website                     | www.teste.com    |
    E clico no botao next de seguro
    Entao eu vou para a aba "Enter Product Data"


    Quando eu estou na aba "Enter Product Data" do formulario
    E preencho os campos com os valores do produto
        | campos                      | valores          |
        | startdate                   | 10/04/2021       |
        | insurancesum                | 5.000.000,00     |
        | meritrating                 | Bonus 1          |
        | damageinsurance             | No Coverage      |
        | optionalproducts            | Euro Protection  |
        | courtesycar                 | No               |
    E clico no botao next de produto
    Entao eu vou para a aba "Select Price Option"

    Quando eu estou na aba "Select Price Option" do formulario
    E seleciono uma opcao
    E clico no botao next de price
    Entao eu vou para a aba "Send Quote"

    Quando eu estou na aba "Send Quote" do formulario
    E preencho os campos com os valores de quote
        | campos                      | valores          |
        | email                       | teste@gmail.com  |
        | phone                       | 25899857         |
        | username                    | teste            |
        | password                    | testePassword#1  |
        | confirmpassword             | testePassword#1  |
        | comments                    | teste            |
    E clico no botao send de quote
    Entao eu recebo a mensagem de sucesso





