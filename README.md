<div align="center">
  <img src="https://github.com/ferjosegonza/OracleJavaExchangeCalculator/assets/96452620/1b95dc99-c552-43b9-abb6-ce1fe6751fac" alt="ExchangeCalculatorLogo">
</div>

<div align="center">
  <h1 align="center">
    ORACLE JAVA EXCHANGE CALCULATOR
  </h1>
</div>

# 💻 Tech Stack:
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![TeamCity](https://img.shields.io/badge/teamcity-000000.svg?style=for-the-badge&logo=teamcity&logoColor=white) ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white) ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white) ![Trello](https://img.shields.io/badge/Trello-%23026AA7.svg?style=for-the-badge&logo=Trello&logoColor=white)

# 🔭 Project's Description:
This Java project is a currency converter that allows you to convert between different currencies using real-time exchange rates. The supported currency pairs are:

- Dólar to Peso argentino
- Peso argentino to Dólar
- Dólar to Real brasileño
- Real brasileño to Dólar
- Dólar to Peso colombiano
- Peso colombiano to Dólar

## The project consists of three Java files and a Gson library:

<b>Main.java:</b> The main class contains the main method to run the application. It displays a menu to select the currency pair and amount to convert. The conversion is performed using the ConsultaConversion class, and the result is displayed to the user.

<b>Conversion.java:</b> A record class that represents the conversion result, including the base and target currencies, conversion rate, and result. It uses a record, which is a new feature in Java 14, to simplify the creation of immutable classes.

<b>ConsultaConversion.java:</b> A class that handles the API request to fetch the exchange rate and converts the response to a Conversion object. It uses the HttpClient class to send a GET request to the API endpoint and parse the response using the Gson library.

<b>gson-2.10.1.jar:</b> A library used to parse JSON data from the API response. It is included in the project as a JAR file and is used by the ConsultaConversion class to parse the API response.
Here's an explanation on how to integrate it working with IntelliJ IDEA:
<b>First download it from mvnrepository.com the 2.10.1 version</b>
![image](https://github.com/ferjosegonza/OracleJavaExchangeCalculator/assets/96452620/9abd8b62-93cb-47ef-b1e3-f7c7d178074c)
  
<b>Then in your IntelliJ IDEA click in the order suggested by the numbers:</b>
1) click on "Project Structure"
2) click on "Modules"
3) click on "Dependencies"
4) click on the "+" icon
5) Select "JARs or Directories..."
6) Search the gson-2.10.1.jar file where you download it, and click OK
7) Click on the checkbox, and click OK
That's it!
![gson paso a paso](https://github.com/ferjosegonza/OracleJavaExchangeCalculator/assets/96452620/b260584f-38e6-4b7d-9576-d91deeed387a)


To run the project, you need to compile and run the Main class. You can use the following command to compile the project:

Edit
Full Screen
Copy code
javac -cp gson-2.10.1.jar src/Main.java src/Conversion.java src/ConsultaConversion.java
And then run the compiled Main class:

Edit
Full Screen
Copy code
java -cp .:gson-2.10.1.jar Main
Note: The classpath separator (:) may differ depending on your operating system. On Windows, use ; instead of :.

Overall, this project demonstrates how to use the HttpClient class to send API requests and parse the response using Gson. It also shows how to use records, a new feature in Java 14, to simplify the creation of immutable classes.

Feel free to:
✍️ Write me to ask or suggest anything to: fer.jose.gonza@gmail.com
💾 Download it, play with it, break it
