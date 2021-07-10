package com.nvfredy.reactiveapp.controller;

import com.nvfredy.reactiveapp.entity.Message;
import com.nvfredy.reactiveapp.service.MessageService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/all")
    public Flux<Message> findAllMessage() {
        return messageService.findAll();
    }

    @PostMapping
    public Mono<Message> saveMessage(@RequestBody Message message) {
        return messageService.saveMessage(message);
    }
}
