package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.htp.inventory.domain.Monitor;
@Repository
public interface MonitorRepository extends JpaRepository<Monitor, Integer>{

}
