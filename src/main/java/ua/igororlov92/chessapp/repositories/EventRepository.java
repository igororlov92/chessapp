package ua.igororlov92.chessapp.repositories;

import org.springframework.data.repository.CrudRepository;

import ua.igororlov92.chessapp.model.Event;

public interface EventRepository extends CrudRepository<Event, Long> { }
