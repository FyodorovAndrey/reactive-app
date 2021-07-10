package com.nvfredy.reactiveapp.repository;

import com.nvfredy.reactiveapp.entity.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
}
