package com.larezard.pontinhobatebate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {

  @GetMapping
  public ResponseEntity<String> health() {
    return ResponseEntity.ok("UP");
  }

  @GetMapping("/test/{value}")
  public ResponseEntity<String> health(@PathVariable String value) {
    return ResponseEntity.ok(value);
  }

}
