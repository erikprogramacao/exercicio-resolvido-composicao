# Exercicio Resolvido de Composição

Este repositório contém um exercício prático desenvolvido em **Java** focado no conceito de **Composição de Objetos** e **Enumerações**. O projeto foi construído com base nas aulas do curso de *Java Completo Programação Orientada a Objetos* do professor Nélio Alves.

---

## 🎯 Sobre o Projeto

Este programa simula um sistema de faturação e sumário de pedidos de uma loja. O utilizador insere os dados de um cliente, o estado do pedido e adiciona vários itens (compostos por produtos e quantidades). No final, o sistema exibe um resumo completo com os subtotais e o valor total do pedido.

### 🚀 A Minha Jornada com Java
Estou atualmente a iniciar o meu percurso no desenvolvimento de software e a estudar a **Programação Orientada a Objetos (POO)**. Desenvolver este exercício foi um marco muito importante para mim:
* **Entendimento claro:** Consegui compreender perfeitamente como diferentes objetos se relacionam e comunicam entre si.
* **Evolução prática:** Ver os conceitos teóricos transformarem-se num sistema real deu-me muita motivação.
* **Entusiasmo:** Estou a gostar imenso da linguagem Java e muito animado para continuar a aprender e a construir projetos cada vez mais complexos!

---

## 🛠️ Conceitos de POO Aplicados

* **Composição de Objetos:** A classe `Order` possui uma lista de `OrderItem`, e cada item possui um `Product`. Além disso, o pedido está associado a um `Client`.
* **Enumerações:** Utilização do enum `OrderStatus` para controlar de forma segura os estados do pedido (`PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, `DELIVERED`).
* **Encapsulamento:** Todos os atributos das entidades foram definidos como privados (`private`) e são acedidos através de métodos *getters* e *setters*.
* **Manipulação de Datas:** Uso das classes modernas `LocalDate` e `LocalDateTime`, juntamente com `DateTimeFormatter` para formatação de texto.

---

## 💻 Tecnologias e Ferramentas

* **Linguagem:** Java (versão 17 ou superior)
* **IDE utilizada:** Eclipse

---

## 📁 Estrutura de Classes do Projeto

O projeto está dividido nos seguintes pacotes:

```text
src/
├── application/
│   └── Program.java          # Classe principal que executa o fluxo do sistema
└── entities/
    ├── Client.java           # Representa o cliente (Nome, Email, Data de Nascimento)
    ├── Product.java          # Representa o produto (Nome, Preço)
    ├── OrderItem.java        # Associa um produto à sua quantidade e calcula o subtotal
    ├── Order.java            # Controla o pedido, lista de itens e calcula o valor total
    └── enums/
        └── OrderStatus.java  # Enumeração com os estados possíveis do pedido
```

---

## 📈 Exemplo de Execução no Terminal

```text
Enter cliente data:
Name: Alex Green
Email: alex@gmail.com
Birth date (DD/MM/YYYY): 15/03/1985
Enter order data: 
PROCESSING
How many items to this order? 2
Enter item #1 data: 
Product name: TV
Product price: 1000.00
Quantity: 1
Enter item #2 data: 
Product name: Mouse
Product price: 40.00
Quantity: 2


ORDER SUMMARY:
Order moment: 25/05/2026 12:38:00
Order status: PROCESSING
Cliente: Alex Green - alex@gmail.com
Order items:
TV, 1000.0, Quantity: 1, Subtotal: 1000.0
Mouse, 40.0, Quantity: 2, Subtotal: 80.0
Total price: 1080.0
```

---

## 🔧 Como Executar Localmente

1. Faça o clone deste repositório:
   ```bash
   git clone https://github.com
   ```
2. Abra o **Eclipse**.
3. Vá em `File -> Import -> General -> Existing Projects into Workspace`.
4. Selecione a pasta do projeto clonado.
5. Abra o ficheiro `Program.java` e execute (*Run*).

---

## ✉️ Contacto

Se quiser acompanhar a minha evolução ou trocar ideias sobre programação Java, sinta-se à vontade para entrar em contacto!

* **GitHub:** [Erik](https://github.com/erikprogramacao)
