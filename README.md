# Java-REST-API-Client



ompany name : CODTECH IT SOLUTIONS PVT. LTD


INTERN ID : CTO8DH682

NAME : M.MUTHU ARULNITHI 

DOMAIN : JAVA PROGRAMMING 

START DATE : 29 june

END DATE : 29 july 

MENTOR : Neela santhos kumar







🎯 Objective:
To build a Java application that connects to a public REST API (e.g., WeatherAPI), sends an HTTP GET request, receives the JSON response, and displays the extracted data in a structured, human-readable format.

📘 Project Overview:
This Java console application demonstrates how to:

Send HTTP GET requests using HttpURLConnection

Parse JSON responses using the org.json library

Display structured weather information (like location, temperature, condition, and wind speed)

The project connects to the free endpoint of WeatherAPI (or any REST API), fetches current weather details for a predefined location (e.g., London), and prints them to the terminal.

This serves as a foundational project for learning:

REST API integration

HTTP request handling

JSON parsing in Java

Exception handling and real-time data display

📂 Project Deliverable:
A working Java program: WeatherAPIClient.java

Uses:

HttpURLConnection for making HTTP requests

org.json.JSONObject for parsing the response

💻 Sample Output:




When you run the application:

yaml
Copy
Edit
📡 Weather Data Fetched Successfully!
🌍 Location: London
🌤️ Condition: Partly cloudy
🌡️ Temperature (Celsius): 20.5
💨 Wind (kph): 12.0
If the API fails:

javascript
Copy
Edit
❌ Error fetching data: [Error Message]
