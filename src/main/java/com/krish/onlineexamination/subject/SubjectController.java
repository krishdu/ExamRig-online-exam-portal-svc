package com.krish.onlineexamination.subject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;

    /**
     * to get all subject
     * @return List of {@link Subject}
     */
    @GetMapping("/subject")
    public List<Subject> getAllSubjects() {
        return (List<Subject>) this.subjectRepository.findAll();
    }

    /**
     * to add a new subject
     * @param subject
     * @return {@link Subject}
     */
    @PostMapping("/subject")
    public Subject addNewSubject(@RequestBody Subject subject) {
        return this.subjectRepository.save(subject);
    }

    /**
     * to delete a subject
     * @param name
     * @return deleted message
     */
    @DeleteMapping("/subject/{name}")
    public String deleteSubject(@PathVariable("name") String name) {
        int row = this.subjectRepository.deleteByName(name);
        return row + " row get deleted";
    }

}
