package org.example.service;

import org.example.domain.Message;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DataStore {

    Mono<Message> saveMessage(Message message);

    Flux<Message> loadMessages(String roomId);

    Flux<Message> loadAllMessages();
}
