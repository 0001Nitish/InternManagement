package com.example.internManagement.Service;

import com.example.internManagement.Enitity.PerformanceRecord;
import com.example.internManagement.Repository.PerformanceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerformanceRecordService {

    @Autowired
    private PerformanceRecordRepository performanceRecordRepository;

    public List<PerformanceRecord> getAllPerformanceRecords() {
        return performanceRecordRepository.findAll();
    }

    public Optional<PerformanceRecord> getPerformanceRecordById(Long id) {
        return performanceRecordRepository.findById(id);
    }

    public PerformanceRecord createPerformanceRecord(PerformanceRecord performanceRecord) {
        return performanceRecordRepository.save(performanceRecord);
    }

    public PerformanceRecord updatePerformanceRecord(Long id, PerformanceRecord performanceRecord) {
        if (performanceRecordRepository.existsById(id)) {
            performanceRecord.setId(id);
            return performanceRecordRepository.save(performanceRecord);
        }
        return null;
    }

    public void deletePerformanceRecord(Long id) {
        performanceRecordRepository.deleteById(id);
    }
}
