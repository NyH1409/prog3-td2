package com.example.demo.integration;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureMockMvc
public class TeamIT {

  @Test
  void read_students_ok() throws IOException, InterruptedException {
    HttpClient client = HttpClient.newBuilder().build();
    String basePath = "http://localhost:8080";

    HttpResponse<String> response = client.send(
        HttpRequest.newBuilder()
            .uri(URI.create(
                basePath + "/students"))
            .GET().build(),
        HttpResponse.BodyHandlers.ofString());

    assertEquals(HttpStatus.OK.value(), response.statusCode());
    assertNotNull(response.body());
  }

}
