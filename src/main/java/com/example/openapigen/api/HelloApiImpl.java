package com.example.openapigen.api;

import com.example.openapigen.model.GreetingRequest;
import com.example.openapigen.model.GreetingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiImpl implements HelloApi {
    @PostMapping("/hello")
    @Override
    public ResponseEntity<GreetingResponse> helloPost(GreetingRequest greetingRequest) throws Exception {
        return ResponseEntity.ok(new GreetingResponse().message("Hello, " + greetingRequest.getName()));
    }
}
