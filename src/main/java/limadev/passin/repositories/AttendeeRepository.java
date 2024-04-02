package limadev.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import limadev.passin.domain.attendee.Attendee;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, String> {
}
