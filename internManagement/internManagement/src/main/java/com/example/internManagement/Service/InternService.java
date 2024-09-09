package com.example.internManagement.Service;

import com.example.internManagement.Enitity.Intern;
import com.example.internManagement.Repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;

    public Intern createIntern(Intern intern) {
        return internRepository.save(intern);
    }

    public List<Intern> getAllInterns() {
        return internRepository.findAll();
    }

    public Optional<Intern> getInternById(Long id) {
        return internRepository.findById(id);
    }

    public Intern updateIntern(Long id, Intern internDetails) {
        Intern intern = internRepository.findById(id).orElseThrow();
        // Update fields as needed
        return internRepository.save(intern);
    }

    public void deleteIntern(Long id) {
        internRepository.deleteById(id);
    }
}
