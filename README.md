<!DOCTYPE html>
<html>
<head>
    <title>Weather Forecast Application - README</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
        }
        h1, h2 {
            color: #333;
        }
        pre {
            background-color: #f4f4f4;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
            overflow-x: auto;
        }
        code {
            color: #d6336c;
        }
        ul {
            margin: 10px 0;
        }
    </style>
</head>
<body>

<h1>Weather Forecast Application</h1>
<p>A simple Spring Boot application that allows users to manage weather data for different cities through a RESTful API.</p>

<h2>Features</h2>
<ul>
    <li>Add weather data for a city</li>
    <li>Retrieve weather data for all cities</li>
    <li>Retrieve weather data for a specific city</li>
    <li>Update weather data</li>
    <li>Delete weather data</li>
</ul>

<h2>Technologies Used</h2>
<ul>
    <li>Java</li>
    <li>Spring Boot</li>
    <li>Spring Data JPA</li>
    <li>H2 Database</li>
    <li>REST API</li>
</ul>

<h2>Project Structure</h2>
<pre>
src/main/java/com/example/weather
    ├── model
    │    └── Weather.java
    ├── repository
    │    └── WeatherRepository.java
    ├── service
    │    └── WeatherService.java
    ├── controller
    │    └── WeatherController.java
    └── WeatherApplication.java
</pre>

<h2>Endpoints</h2>
<table border="1" cellpadding="5" cellspacing="0">
    <thead>
        <tr>
            <th>Method</th>
            <th>Endpoint</th>
            <th>Description</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>POST</td>
            <td><code>/weather</code></td>
            <td>Add a new weather entry</td>
        </tr>
        <tr>
            <td>GET</td>
            <td><code>/weather</code></td>
            <td>Retrieve all weather entries</td>
        </tr>
        <tr>
            <td>GET</td>
            <td><code>/weather/{city}</code></td>
            <td>Retrieve weather data for a specific city</td>
        </tr>
        <tr>
            <td>PUT</td>
            <td><code>/weather/{id}</code></td>
            <td>Update weather data</td>
        </tr>
        <tr>
            <td>DELETE</td>
            <td><code>/weather/{id}</code></td>
            <td>Delete weather data</td>
        </tr>
    </tbody>
</table>

<h2>Database Configuration</h2>
<p>This application uses an in-memory H2 database. You can configure it in <code>application.properties</code>:</p>
<pre>
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
</pre>

<h2>Running the Application</h2>
<ol>
    <li>Clone the repository.</li>
    <li>Open the project in your IDE.</li>
    <li>Run the main class <code>WeatherApplication</code>.</li>
    <li>Access the H2 database console at <code>http://localhost:8080/h2-console</code>.</li>
    <li>Test the API using Postman or another REST client.</li>
</ol>

<h2>Future Enhancements</h2>
<ul>
    <li>Integrate with a real weather API (e.g., OpenWeatherMap).</li>
    <li>Add user authentication and authorization.</li>
    <li>Implement unit and integration testing.</li>
    <li>Deploy the application to a cloud platform (e.g., AWS, Azure).</li>
</ul>

<h2>License</h2>
<p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>

</body>
</html>
