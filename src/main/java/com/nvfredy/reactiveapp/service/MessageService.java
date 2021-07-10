package com.nvfredy.reactiveapp.service;

import com.nvfredy.reactiveapp.entity.Message;
import com.nvfredy.reactiveapp.repository.MessageRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Flux<Message> findAll() {
        return messageRepository.findAll();
    }

    public Mono<Message> saveMessage(Message message) {
        return messageRepository.save(message);
    }

    public Mono<Message> findMessageById(Long id) {
        return messageRepository.findById(id);
    }

}
