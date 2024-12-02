package io.github.sciencekex

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
                println("即将进行录入学生信息")
            }

            "2" -> {
                println("即将进行录入书籍信息")
            }

            "3" -> {
                println("即将进行查询学生信息")
            }

            "4" -> {
                println("即将进行查询书籍信息")
            }

            else -> {
                println("退出系统")
                break
            }
        }
    }


}