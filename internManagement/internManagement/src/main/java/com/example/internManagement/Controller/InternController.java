package com.example.internManagement.Controller;

import com.example.internManagement.Enitity.Intern;
import com.example.internManagement.Service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/interns")
public class InternController {

    @Autowired
    private InternService internService;

    @PostMapping
    public ResponseEntity<Intern> createIntern(@RequestBody Intern intern) {
        return ResponseEntity.ok(internService.createIntern(intern));
    }

    @GetMapping
    public ResponseEntity<List<Intern>> getAllInterns() {
        return ResponseEntity.ok(internService.getAllInterns());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Intern> getInternById(@PathVariable Long id) {
        Optional<Intern> intern = internService.getInternById(id);
        return intern.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Intern> updateIntern(@PathVariable Long id, @RequestBody Intern internDetails) {
        return ResponseEntity.ok(internService.updateIntern(id, internDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIntern(@PathVariable Long id) {
        internService.deleteIntern(id);
        return ResponseEntity.noContent().build();
    }
}
