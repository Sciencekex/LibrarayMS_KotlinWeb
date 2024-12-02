package io.github.sciencekex.service

class StudentService {
    fun addStudent(){
        print("请输入需要插入的学生名称：")
        val student = readLine()
        print("请输入需要插入的学生性别（男/女）：")
        val gender = readLine()
        print("请输入需要插入的学生年龄：")
        val age = readLine()
    }
}