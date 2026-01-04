# IMC Analyzer

Aplicação desktop desenvolvida em Java com JavaFX para cálculo de IMC (Índice de Massa Corporal).

## 📋 Descrição

O IMC Analyzer é uma aplicação simples e intuitiva que permite calcular o Índice de Massa Corporal (IMC) a partir do peso e altura fornecidos pelo usuário. A aplicação possui interface gráfica moderna desenvolvida com JavaFX.

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **JavaFX** - Framework para interface gráfica
- **Eclipse** - IDE de desenvolvimento

## 📁 Estrutura do Projeto

```
IMC_Analyzer/
├── src/
│   └── br/
│       └── com/
│           └── imcAnalise/
│               ├── App.java                    # Classe principal
│               ├── controller/
│               │   └── HomeController.java     # Controlador da aplicação
│               ├── service/
│               │   ├── IImcApplication.java    # Interface do serviço
│               │   └── ImcApplication.java     # Implementação do serviço
│               └── view/
│                   └── Home.java               # Interface gráfica
└── bin/                                        # Arquivos compilados
```

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas:

- **View (Home.java)**: Camada de apresentação com interface gráfica JavaFX
- **Controller (HomeController.java)**: Camada de controle que gerencia a interação entre view e service
- **Service (ImcApplication.java)**: Camada de serviço que contém a lógica de negócio (parsing, validação e cálculo do IMC)

## 🚀 Como Executar

### Pré-requisitos

- Java JDK 8 ou superior
- JavaFX SDK (incluído no JDK 11+ ou disponível separadamente)
- Eclipse IDE (ou outra IDE compatível)

### Passos para Execução no Eclipse

1. Clone ou baixe o repositório
2. Abra o Eclipse IDE
3. Importe o projeto:
   - `File` → `Import` → `Existing Projects into Workspace`
   - Selecione a pasta do projeto
4. Configure o JavaFX (se necessário):
   - Para JDK 11+, o JavaFX pode precisar ser adicionado ao classpath
   - Para versões anteriores, certifique-se de ter o JavaFX SDK instalado
5. Execute a aplicação:
   - Clique com o botão direito em `App.java`
   - Selecione `Run As` → `Java Application`

### Executando via Linha de Comando

```bash
# Compilar os arquivos
javac --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls App.java

# Executar a aplicação
java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules javafx.controls App
```
Download do JavaFX é necessario para rodar o codigo acima:https://gluonhq.com/products/javafx/

## 💻 Funcionalidades

- ✅ Cálculo de IMC a partir de peso (kg) e altura (metros)
- ✅ Validação de entradas (valores devem ser maiores que zero)
- ✅ Suporte a vírgula ou ponto como separador decimal
- ✅ Tratamento de erros com mensagens amigáveis
- ✅ Interface gráfica intuitiva e responsiva

## 📝 Fórmula do IMC

```
IMC = Peso (kg) / (Altura (m)²)
```

## 👤 Autor

Desenvolvido como projeto de estudo em Java com JavaFX.

## 📄 Licença

Este projeto é de código aberto e está disponível para fins educacionais.

