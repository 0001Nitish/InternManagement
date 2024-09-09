package com.example.internManagement.Repository;

import com.example.internManagement.Enitity.PerformanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceRecordRepository extends JpaRepository<PerformanceRecord, Long> {
}
