<div align="center">
  <img src="https://github.com/ferjosegonza/OracleJavaExchangeCalculator/assets/96452620/1b95dc99-c552-43b9-abb6-ce1fe6751fac" alt="ExchangeCalculatorLogo">
</div>

![ExchangeCalculatorLogo](https://github.com/ferjosegonza/OracleJavaExchangeCalculator/assets/96452620/1b95dc99-c552-43b9-abb6-ce1fe6751fac)

<div align="center">
  <h1 align="center">
    ORACLE JAVA EXCHANGE CALCULATOR
  </h1>
</div>

This Java project is a currency converter that allows you to convert between different currencies using real-time exchange rates. The supported currency pairs are:

Dólar to Peso argentino
Peso argentino to Dólar
Dólar to Real brasileño
Real brasileño to Dólar
Dólar to Peso colombiano
Peso colombiano to Dólar
The project consists of three Java files and a Gson library:

src/Main.java: The main class that contains the main method to run the application. It displays a menu to select the currency pair and amount to convert.
src/Conversion.java: A record class that represents the conversion result, including the base and target currencies, conversion rate, and result.
src/ConsultaConversion.java: A class that handles the API request to fetch the exchange rate and converts the response to a Conversion object.
gson-2.10.1.jar: A library used to parse JSON data from the API response.
Here's a breakdown of each Java file:

src/Main.java
This class contains the main method that starts the application. It uses a Scanner to read user input and display a menu to select the currency pair and amount to convert. The conversion is performed using the ConsultaConversion class, and the result is displayed to the user.

src/Conversion.java
This record class represents the conversion result, including the base and target currencies, conversion rate, and result. It uses a record, which is a new feature in Java 14, to simplify the creation of immutable classes.

src/ConsultaConversion.java
This class handles the API request to fetch the exchange rate and converts the response to a Conversion object. It uses the HttpClient class to send a GET request to the API endpoint and parse the response using the Gson library.

The ConsultaConversion class contains a single method, conversion, that takes the base and target currencies and the amount to convert as parameters. It constructs the API URL, sends a GET request to the API endpoint, and parses the response using Gson. If the response is a valid JSON object, it returns a Conversion object with the conversion result.

gson-2.10.1.jar
This is a library used to parse JSON data from the API response. It is included in the project as a JAR file and is used by the ConsultaConversion class to parse the API response.

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
