# 📄 Sistema de Parcelamento de Contratos

Este é um sistema simples de parcelamento de contratos, desenvolvido em Java, que permite calcular e adicionar parcelas a um contrato com base em um serviço de pagamento online.

## 🔧 Funcionalidades

- Calcula parcelas de contratos com base em um número de meses especificado.
- Utiliza um serviço de pagamento online para calcular taxas de pagamento e juros.
- Fornece implementações de serviço de pagamento.

## 📋 Requisitos

- JDK (Java Development Kit) 8 ou superior
- Eclipse IDE (opcional)

## 🚀 Como usar

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto em sua IDE Java preferida (por exemplo, Eclipse).
3. Execute o método `main` na classe `Program` para iniciar o programa.
4. Siga as instruções no console para inserir os dados do contrato e o número de parcelas desejado.
5. O programa calculará e exibirá as parcelas do contrato.

## 📁 Estrutura do Projeto

O projeto possui as seguintes classes principais:

- `Contract`: Representa um contrato com número, data, valor total e parcelas.
- `Installment`: Representa uma parcela de contrato com data de vencimento e valor.
- `ContractService`: Responsável por processar contratos e calcular parcelas.
- `OnlinePaymentService`: Interface para serviços de pagamento online.
- `PaypalService`: Implementação do serviço de pagamento online utilizando PayPal.

## 🤝 Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.
