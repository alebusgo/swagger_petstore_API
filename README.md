# VISA Swagger Pet Store API Test Automation

This repo contains API's test on the swagger-petstore project
 
### The project is based on:
 
- Karate
- Gradle
- CucumberJS
- Intellij Idea


The syntax of the scenarios is written in Gherkin.
 
## Tests include in the project and notes
 
The project includes smoke and regression tests on the following sections of the app:
 
- pet
    - Add New Pet endpoint
    - Delete By Id endpoint
    - Find By Id endpoint
    - Find By Status endpoint
    - Update Existing Pet endpoint
    - Update Pet With Form endpoint
- store
    - Delete Order endpoint
    - Find Order endpoint
    - Inventory endpoint
    - Place Order endpoint
- user
    - Create User endpoint
    - Delete User endpoint
    - Find User By Name endpoint
    - Login User endpoint
    - Logout User endpoint
    - Update User

The project has a total of 32 tests/gherkin scenarios.
 
## Required Configuration
 
1. You must have the following programs installed on your Windows PC (This Installation only works on Windows OS, if you need to configure in a MacOs PC, please contact abustos@cbtw.tech for support), please follow these steps:
 
    - [Download and install git](https://github.com/git-guides/install-git#:~:text=To%20install%20Git%2C%20navigate%20to,installation%20by%20typing%3A%20git%20version%20.)
    - [Download and install JAVA JDK 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
      - Set JAVA_HOME:
          - Right click My Computer and select Properties.
          - On the Advanced tab, select Environment Variables, and then create or edit JAVA_HOME System Variable to point to where the JDK software is located, like: "C:\Program Files\Amazon Corretto\jdk17.0.7_7".
          - Open the Path option from System and create a new Environment Variable %JAVA_HOME%\bin
          - You can check it by typing $ java -version command at the command prompt.
   - [Donwload Gradle (Binary_only)](https://gradle.org/install/)
     - Unzip the file, create a Gradle folder in C:\ and paste the Gradle inside
     - Right click My Computer and select Properties.
     - On the Advanced tab, select Environment Variables.
     - Open the Path option from System and create a new Environment Variable add to point to where the Gradle bin is located like "C:\Gradle\gradle-8.1.1\bin"
   - [Download and install Intellij IDEA Community](https://www.jetbrains.com/idea/)
      - Open Intellij IDEA and install:
        - "Gherkin" from JetBrains plug in
        - "Cucumber for Java" from JetBrains plug in 

2. Clone this project locally
    ```git
        git clone https://github.com/alebusgo/swagger_petstore_API.git
    ```
 
3. Open the project in Intellij IDEA and rebuild it 
 
## Running Auto Tests

1. Run All Smoke (Walkthrough) Test in QA environment, just go to the root of the project, and write this via the command line:
   ```bash
        gradle clean test --tests *ParallelRunnerWalkthroughs -Dkarate.env="qa" -i
   ```
2. Run one by one Smoke (Walkthrough) Test in QA environment, just go to the root of the project, and write this via the command line: 
   ```bash
        gradle clean test --tests AddNewPetToTheStoreWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests DeleteAPetByIdWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests FindPetByIdWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests FindsPetsByStatusWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests UpdateAnExistingPetWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests UpdateAnExistingPetWithFormDataWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests DeleteOrderByIdWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests FindOrderByIdWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests ReturnsPetInventoryByStatusWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests PlaceOrderFoAPetWalkthroughRunner.java -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests createUserWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests DeleteUserWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests FindUserByNameWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests LoginUserWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests LogoutUserWalkthroughRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests UpdateUserWalkthroughRunner -Dkarate.env="qa" -i
   ```
4. Run All Regression Test in QA environment, just go to the root of the project, and write this via the command line:
   ```bash
        gradle clean test --tests *ParallelRunnerRegression -Dkarate.env="qa" -i
   ```
5. Run one by one Regression Test in PROD environment, just go to the root of the project, and write this via the command line:
   ```bash
        gradle clean test --tests AddNewPetToTheStoreRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests DeleteAPetByIdRegressionhRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests FindPetByIdRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests FindsPetsByStatusRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests UpdateAnExistingPetRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests UpdateAnExistingPetWithFormDataRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests DeleteOrderByIdRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests FindOrderByIdRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests ReturnsPetInventoryByStatusRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests PlaceOrderFoAPetRegressionRunner.java -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests createUserRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests DeleteUserRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests FindUserByNameRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests LoginUserRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests LogoutUserRegressionRunner -Dkarate.env="qa" -i
   ```
   ```bash
        gradle clean test --tests UpdateUserRegressionRunner -Dkarate.env="qa" -i
   ```
## Karate Repports

### The execution report folder is located following the path:

build/karate-reports/karate-summary.html   