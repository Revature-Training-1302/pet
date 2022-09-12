package com.revature.repository;

import com.revature.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    @Query(value = "SELECT * FROM pet where person_fk = ?1", nativeQuery = true)
    public List<Pet> findAdoptedPets(Long owner_id);

    // more on derived queries:
    // https://www.baeldung.com/spring-data-derived-queries
}
