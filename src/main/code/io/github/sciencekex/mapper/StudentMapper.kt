package io.github.sciencekex.mapper

import io.github.sciencekex.entity.Student
import org.apache.ibatis.annotations.Insert

interface StudentMapper {
    @Insert("insert into db_student(name, gender, age) values(#{name}, #{gender}, #{age})")
    fun insertStudent(student: Student): Int
}