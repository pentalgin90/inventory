package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.htp.inventory.domain.Computer;
@Repository
public interface ComputerRepository extends JpaRepository<Computer, Integer>{

}
