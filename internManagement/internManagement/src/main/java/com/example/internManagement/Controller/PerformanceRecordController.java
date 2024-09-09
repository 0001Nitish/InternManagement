package com.example.internManagement.Controller;

import com.example.internManagement.Enitity.PerformanceRecord;
import com.example.internManagement.Service.PerformanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/performance-records")
public class PerformanceRecordController {

    @Autowired
    private PerformanceRecordService performanceRecordService;

    @GetMapping
    public List<PerformanceRecord> getAllPerformanceRecords() {
        return performanceRecordService.getAllPerformanceRecords();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerformanceRecord> getPerformanceRecordById(@PathVariable Long id) {
        Optional<PerformanceRecord> performanceRecord = performanceRecordService.getPerformanceRecordById(id);
        return performanceRecord.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public PerformanceRecord createPerformanceRecord(@RequestBody PerformanceRecord performanceRecord) {
        return performanceRecordService.createPerformanceRecord(performanceRecord);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PerformanceRecord> updatePerformanceRecord(@PathVariable Long id, @RequestBody PerformanceRecord performanceRecord) {
        PerformanceRecord updatedPerformanceRecord = performanceRecordService.updatePerformanceRecord(id, performanceRecord);
        return updatedPerformanceRecord != null ? ResponseEntity.ok(updatedPerformanceRecord) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerformanceRecord(@PathVariable Long id) {
        performanceRecordService.deletePerformanceRecord(id);
        return ResponseEntity.noContent().build();
    }
}
