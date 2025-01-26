package org.example.repository;

import org.example.domain.Message;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {

    @Query("select * from message where room_id = :room_id order by id")
    Flux<Message> findByRoomId(@Param("roomId") String roomId);

    Flux<Message> findAll();
}
