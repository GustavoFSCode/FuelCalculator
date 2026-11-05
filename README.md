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

O FuelCalculator é um aplicativo Android para calcular o gasto estimado com combustível em uma viagem. O usuário informa a distância a percorrer, o consumo do veículo em quilômetros por litro e o preço do litro do combustível. Ao final, o aplicativo apresenta um resumo dos dados e o custo total estimado, com a opção de iniciar um novo cálculo.

O projeto foi desenvolvido para praticar o desenvolvimento Android com Kotlin, a criação de interfaces com XML e a navegação entre telas.

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
