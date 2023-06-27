package com.example.repository;

import com.example.documents.Contacto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ContactoRepository extends ReactiveMongoRepository<Contacto,String> {

    Mono<Contacto> findFirstByEmail(String email);

    Mono<Contacto> findAllByTelefonoOrNombre(String telefonoOrNombre);
}
