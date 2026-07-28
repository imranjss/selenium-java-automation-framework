# Selenium Java Automation Framework

A recruiter-ready **Selenium + Java + TestNG** test automation framework using **Page Object Model (POM)** and CI via **GitHub Actions**.

## 🚀 Tech Stack
- Java 17
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- GitHub Actions

## 📁 Folder Structure
```text
src
├── main
│   └── java/com/imran/framework
│       ├── base
│       ├── factory
│       ├── pages
│       └── utils
└── test
    ├── java/com/imran/tests
    └── resources/config.properties
```

## ✅ Key Features
- POM-based clean architecture
- Reusable BaseTest/BasePage utilities
- Configurable browser/base URL/headless mode
- CI pipeline for PR and push validation
- Sample login smoke tests

## 🛠️ Setup
### Prerequisites
- Java 17+
- Maven 3.8+

### Install
```bash
mvn clean install -DskipTests
```

## ▶️ Run tests
```bash
mvn test
```

or with suite:
```bash
mvn test -DsuiteXmlFile=testng.xml
```

## ⚙️ Configuration
Edit:
`src/test/resources/config.properties`

Example:
```properties
baseUrl=https://www.saucedemo.com/
browser=chrome
headless=true
implicitWaitSeconds=5
explicitWaitSeconds=15
```

## 🔄 CI/CD
Workflow file:
`.github/workflows/ci.yml`

It automatically runs tests on:
- Push to `main` / `master`
- Pull requests to `main` / `master`

## 📌 Next Enhancements
- Allure/Extent reporting
- Retry analyzer for flaky tests
- Parallel cross-browser execution
- API automation module (REST Assured)
- Dockerized Selenium Grid
