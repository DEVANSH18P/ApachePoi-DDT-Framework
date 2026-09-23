# Data-Driven Testing (DDT) Framework with Selenium, TestNG & Apache POI

An automated Data-Driven Testing framework built using **Selenium WebDriver**, **TestNG**, and **Apache POI**. The framework parameterizes authentication scenarios against the SauceDemo web application by parsing test datasets dynamically from external Microsoft Excel workbooks (`.xlsx`).

---

## Architecture & Execution Flow

```text
Excel Workbook (.xlsx)
        │
        ▼
   Apache POI (XSSF API & DataFormatter)
        │
        ▼
ExcelReader Utility (Dynamic Row & Column parsing)
        │
        ▼
TestNG DataProvider (@DataProvider returning Object[][])
        │
        ▼
BaseTest Setup (@BeforeMethod WebDriver initialization)
        │
        ▼
LoginTest Execution (@Test parameterized verification)
        │
        ▼
Assertions & BaseTest Teardown (@AfterMethod driver.quit())


Tech Stack & Dependencies
Language: Java

Automation Library: Selenium WebDriver 4.35.0

Test Runner / Parameterization: TestNG 7.11.0

Spreadsheet Parsing: Apache POI poi-ooxml 5.4.1

Build Management: Apache Maven


ApachePoi
├── pom.xml
├── README.md
├── .gitignore
├── src/test/resources/
│   └── Apache_POI_Data_Driven_Login_Practice.xlsx
└── src/test/java/
    ├── base/
    │   └── BaseTest.java              # Manages browser setup & teardown per test iteration
    ├── dataProviders/
    │   └── LoginDataProvider.java    # Bridges Excel data to TestNG Object[][]
    ├── utilities/
    │   ├── ExcelReader.java          # POI-based cell reading and dimension helpers
    │   └── TestExcelReader.java      # Independent smoke verification for Excel data
    └── tests/
        └── LoginTest.java            # Parameterized assertions against SauceDemo
