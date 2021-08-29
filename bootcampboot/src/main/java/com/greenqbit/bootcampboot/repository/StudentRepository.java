package com.greenqbit.bootcampboot.repository;

import com.greenqbit.bootcampboot.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Spring Beans(Object) => Spring Managed Objects
//SingleTon Bean: only one instance(object) in whole app
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
