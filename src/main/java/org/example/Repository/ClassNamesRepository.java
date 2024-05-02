package org.example.Repository;

import org.example.Entity.ClassNames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassNamesRepository extends JpaRepository<ClassNames, Integer> {
}
