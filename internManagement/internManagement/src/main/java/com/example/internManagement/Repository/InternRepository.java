package com.example.internManagement.Repository;

import com.example.internManagement.Enitity.Intern;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternRepository extends JpaRepository<Intern, Long> {
    // Add custom queries if needed
}
