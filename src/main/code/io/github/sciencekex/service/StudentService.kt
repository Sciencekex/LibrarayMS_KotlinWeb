package io.github.sciencekex.service

import io.github.sciencekex.entity.Student
import io.github.sciencekex.mapper.StudentMapper
import io.github.sciencekex.util.SqlUtil

class StudentService {
    companion object {
        fun addStudent() {
            // 为了安全?屎山代码!
            println("请输入需要插入的学生名称：")
            val name = readLine()?.trim() ?: ""
            println("请输入需要插入的学生性别（男/女）：")
            val gender = readLine()?.trim() ?: ""
            // 性别筛一下,不然SQL会报错中断程序
            println("请输入需要插入的学生年龄：")
            val ageInput = readLine()?.trim()
            val age = if (ageInput.isNullOrBlank()) 0 else ageInput.toIntOrNull() ?: 0
            val student: Student = Student(0, name, gender, age)
//            println(student)
            SqlUtil.doSqlWork(StudentMapper::class.java) { mapper ->
                val count = mapper.insertStudent(student)
                if (count > 0) {
                    println("用户信息插入成功！$student")
                } else {
                    println("用户信息插入失败！")
                }
            }
        }
    }

}