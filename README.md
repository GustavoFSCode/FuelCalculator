<h1 align="center"> FuelCalculator </h1>

<p align="center">
Uma calculadora de combustível para Android, desenvolvida com Kotlin e XML. <br/>
</p>

<br>

<p align="center">
  <img alt="Telas do aplicativo FuelCalculator" src=".github/telas_calculadora_combustivel.png" width="100%">
</p>

## 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias e ferramentas:

- Kotlin
- XML
- Android SDK
- Material Components
- Gradle
- Android Studio

## 💻 Projeto

O **FuelCalculator** é um aplicativo Android que calcula o gasto estimado com combustível de uma viagem, considerando a distância do percurso, o consumo médio do veículo e o preço por litro.

O preenchimento é dividido em etapas, com uma tela para cada informação. Ao final, o aplicativo apresenta um resumo dos valores informados e o custo estimado da viagem.

O projeto foi desenvolvido para praticar o desenvolvimento Android com **Kotlin** e a construção de interfaces com **XML**.

### Funcionalidades e conceitos aplicados

- **Preenchimento em etapas:** telas para informar distância, consumo médio e preço do combustível, utilizando Activities e Intents para navegação e passagem de dados.
- **Validação dos campos:** tratamento das entradas para evitar valores vazios, inválidos ou menores ou iguais a zero.
- **Controle das casas decimais:** filtro personalizado para limitar os valores digitados a duas casas decimais.
- **Resumo da viagem:** apresentação da distância, consumo, preço por litro e custo estimado, com formatação dos valores numéricos.
- **Novo cálculo:** opção de retornar à tela inicial e iniciar outra simulação.
- **Interface em XML:** organização dos elementos com ConstraintLayout, recursos visuais personalizados e temas e componentes do Material Components.

## ▶️ Como rodar o projeto

### Pré-requisitos

- [Git](https://git-scm.com/)
- Android Studio compatível com as versões do Gradle e do plugin Android do projeto
- Android SDK Platform 36.1
- JDK 21 para executar o Gradle
- Emulador ou celular com Android 7.0 (API 24) ou superior

### Clonando o repositório

```bash
git clone https://github.com/GustavoFSCode/FuelCalculator.git
cd FuelCalculator
```

### Executando pelo Android Studio

1. Abra a pasta `FuelCalculator` no Android Studio.
2. Aguarde a sincronização do Gradle e instale os componentes do SDK solicitados.
3. No **Device Manager**, crie e inicie um emulador. Você também pode conectar um celular com **depuração USB** habilitada.
4. Selecione o dispositivo e clique em **Run ▶**.

### Executando pelo terminal

Com o JDK e o Android SDK configurados e um emulador iniciado ou celular conectado, execute na raiz do projeto:

**Windows — PowerShell:**

```powershell
.\gradlew.bat installDebug
```

**Linux ou macOS:**

```bash
chmod +x gradlew
./gradlew installDebug
```

Após a instalação, abra o **FuelCalculator** na lista de aplicativos do dispositivo.

Esses comandos também podem ser executados pelo terminal do VS Code ou Cursor, desde que o ambiente Android esteja configurado.
