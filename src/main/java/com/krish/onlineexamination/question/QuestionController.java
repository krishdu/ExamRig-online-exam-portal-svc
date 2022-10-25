package com.krish.onlineexamination.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;


    /**
     * to show all question present in database
     * @return list of {@link Question}
     */
    @GetMapping("/question")
    public List<Question> getAllQuestion() {
        return (List<Question>) this.questionRepository.findAll();
    }


    /**
     * add a question in a particular exam
     * @param question
     * @return {@link Question}
     */
    @PostMapping("/question")
    public Question addNewQuestion(@RequestBody Question question) {
        return this.questionRepository.save(question);
    }


    /**
     * to get details of all question of that particular exam  (using exam_id)
     * @param id
     * @return list of {@link Question}
     */
    @GetMapping("/exam/{id}/question")
    public List<Question> getAllQuestionForExam(@PathVariable("id") int id) {
        return this.questionRepository.findByEnameId(id);
    }

    /**
     * edit a question in a particular exam
     * @param id
     * @param question
     * @return {@link Question}
     */
    @PutMapping("/question/{id}")
    public Question updateQuestion(@PathVariable("id") int id, @RequestBody Question question) {
        question.setId(id);
        return this.questionRepository.save(question);
    }


    /**
     * delete a question in a particular exam
     * @param id
     */
    @DeleteMapping("/question/{id}")
    public void deleteQuestion(@PathVariable("id") int id) {
        this.questionRepository.deleteById(id);
    }


}
