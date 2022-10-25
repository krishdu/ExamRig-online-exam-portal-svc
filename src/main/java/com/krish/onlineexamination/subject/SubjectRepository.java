package com.krish.onlineexamination.subject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface SubjectRepository extends CrudRepository<Subject, String> {

    /**
     * delete user by name
     * @param name
     * @return record/row id
     */
    @Transactional
    public int deleteByName(String name);

}
