package com.e1858.building.interfaces;

import com.e1858.building.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    /**
     * 根据name查询
     * @param name
     * @return
     */
    public List<Student> findByName(String name);

}