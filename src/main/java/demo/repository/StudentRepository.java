package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.entity.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long> {

}
