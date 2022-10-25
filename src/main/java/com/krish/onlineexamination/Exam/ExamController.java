package com.krish.onlineexamination.Exam;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExamController {

    @Autowired
    private ExamRepository examRepository;


    /**
     * to get all exam
     * @return list of {@link Exam}
     */
    @GetMapping("/exam")
    public List<Exam> getAllExam() {
        return (List<Exam>) this.examRepository.findAll();
    }

    /**
     * to get details of a particular exam
     * @param id
     * @return {@link Exam}
     */
    @GetMapping("/exam/{id}")
    public Exam getParticularExam(@PathVariable("id") int id) {
        Optional<Exam> optional = this.examRepository.findById(id);
        return optional.get();
    }

    /**
     * to add a new exam
     * @param exam
     * @return {@link Exam}
     */
    @PostMapping("/exam")
    public Exam addNewExam(@RequestBody Exam exam) {
        return this.examRepository.save(exam);
    }


}
