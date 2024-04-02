package limadev.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import limadev.passin.domain.checkin.CheckIn;

@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
}
