package org.faoxis.habrreactivemongo.service;

import org.faoxis.habrreactivemongo.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Flux<User> get();
    Mono<User> save(User user);
    Flux<User> getByLastName(final String lastName);
}
