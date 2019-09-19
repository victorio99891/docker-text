package pl.wiktor.dockerbuildtest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wiktor.dockerbuildtest.model.Message;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/test")
@Slf4j
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


    @PostMapping("/log")
    public void logItem(@RequestBody String message) {
        log.error(message);
    }

}
