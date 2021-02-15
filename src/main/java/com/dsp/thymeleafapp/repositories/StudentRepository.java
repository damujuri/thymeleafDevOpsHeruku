package com.dsp.thymeleafapp.repositories;

import com.dsp.thymeleafapp.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
