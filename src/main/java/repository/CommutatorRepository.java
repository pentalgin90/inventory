package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.htp.inventory.domain.Commutator;
@Repository
public interface CommutatorRepository extends JpaRepository<Commutator, Integer> {

}
