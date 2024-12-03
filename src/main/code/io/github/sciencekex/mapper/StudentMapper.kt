package io.github.sciencekex.mapper

import io.github.sciencekex.entity.Student
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Select

interface StudentMapper {
    @Insert("insert into db_student(name, gender, age) values(#{name}, #{gender}, #{age})")
    fun insertStudent(student: Student): Int

    @Select("select * from db_student")
    fun selectAllStudents(): List<Student>
}