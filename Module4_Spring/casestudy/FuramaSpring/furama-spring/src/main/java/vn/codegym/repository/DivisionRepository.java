package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import vn.codegym.model.Division;

@Service
public interface DivisionRepository extends JpaRepository<Division,Integer> {
}
