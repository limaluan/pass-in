package limadev.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import limadev.passin.domain.event.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {
}
