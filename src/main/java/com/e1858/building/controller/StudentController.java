package com.e1858.building.controller;

import com.e1858.building.models.Student;
import com.e1858.building.interfaces.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
*@Author Feng2018
*@Date 2018/3/2
*/
@RestController
public class StudentController {
    @Autowired
    private StudentRepo mStudentRepo;
    @RequestMapping("/findAllStudent")
    public List<Student> findAllStudent(){
        return mStudentRepo.findAll();
    }

    /**
     * 添加一个student,使用postMapping接收post请求
     * @return
     */
    @PostMapping("/addStudent")
    public Student addStudent(@RequestParam("name") String name, @RequestParam("age") Integer age){
        Student student=new Student();
        student.setName(name);
        student.setAge(age);
        return mStudentRepo.save(student);
    }
    /**
     * 根据ID获取student，接收ID参数
     * @param id
     * @return
     */
    @GetMapping("/getStudent/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Integer id){
        return mStudentRepo.findById(id);
    }

    /**
     * 根据id更新student
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable("id") Integer id,@RequestParam("name") String name,@RequestParam("age") Integer age){
        Student student=new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        return mStudentRepo.save(student);
    }

    /**
     * 根据id删除student
     * @param id
     */
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        mStudentRepo.deleteById(id);
    }
    /**
     * 根据name获取student
     * @param name
     * @return
     */
    @GetMapping("/getStudentByName/{id}")
    public List<Student> getStudentById(@PathVariable("id") String name){
        return mStudentRepo.findByName(name);
    }

}
