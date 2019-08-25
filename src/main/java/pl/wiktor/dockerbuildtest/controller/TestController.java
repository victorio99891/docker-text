package pl.wiktor.dockerbuildtest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.wiktor.dockerbuildtest.model.Message;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/msg")
    public @ResponseBody
    ResponseEntity<Message>
    getTestMessage() {
        return ResponseEntity.ok(Message.builder()
                .author("Wiktor-admin")
                .message("First test message")
                .created(LocalDateTime.now())
                .build());
    }

}
