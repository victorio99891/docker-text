package pl.wiktor.dockerbuildtest.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@Getter
@Setter
@ToString
@Builder
public class Message {

    private String author;
    private String message;
    private LocalDateTime created;

    public Message() {
    }

    public Message(String author, String message, LocalDateTime created) {
        this.author = author;
        this.message = message;
        this.created = created;
    }
}
