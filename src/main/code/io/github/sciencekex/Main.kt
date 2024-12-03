package io.github.sciencekex

import io.github.sciencekex.service.BookService
import io.github.sciencekex.service.BorrowService
import io.github.sciencekex.service.StudentService

fun main() {
    while (true) {
        println("========图书管理系统========")
        println("1. 录入学生信息")
        println("2. 录入书籍信息")
        println("3. 录入借阅信息")
        println("4. 查询学生信息")
        println("5. 查询书籍信息")
        println("6. 查询借阅信息")
        println("请输入以上序号进行操作(输入其它内容将退出系统)")
        val input = readLine()
        when (input) {
            "1" -> {
                StudentService.addStudent()
            }

            "2" -> {
                BookService.addBook()
            }

            "3" -> {
                BorrowService.addBorrow()
            }

            "4" -> {
                println("即将进行查询学生信息")
            }

            "5" -> {
                println("即将进行查询书籍信息")
            }

            "6" -> {
                println("即将进行查询借阅信息")
            }

            else -> {
                println("退出系统")
                break
            }
        }
    }


}