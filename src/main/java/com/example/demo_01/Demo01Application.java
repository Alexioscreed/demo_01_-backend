package com.example.demo_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo01Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo01Application.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Welcome Page</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        margin: 0;
                        padding: 0;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        background-color: #f5f5f5;
                    }
                    .container {
                        text-align: center;
                        background: white;
                        padding: 2rem;
                        border-radius: 10px;
                        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
                    }
                    h1 {
                        color: #333;
                    }
                    p {
                        color: #666;
                        margin-top: 1rem;
                        line-height: 1.5;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>Hello Lhusajo</h1>
                    <p>
                        Welcome to our application! We're thrilled to have you here. 
                        This web application is designed to provide you with an exceptional user experience, 
                        combining cutting-edge technology with a beautiful and responsive user interface. 
                        Take your time to explore and enjoy our features. Have a great day!
                    </p>
                </div>
            </body>
            </html>
            """;
    }
}
