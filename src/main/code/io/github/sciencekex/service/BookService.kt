package io.github.sciencekex.service

import io.github.sciencekex.entity.Book
import io.github.sciencekex.mapper.BookMapper
import io.github.sciencekex.util.SqlUtil

class BookService {
    companion object {
        fun addBook() {
            // 为了安全?屎山代码!
            println("请输入需要插入的书本名称：")
            val title = readLine()?.trim() ?: ""
            println("请输入需要插入的书本简介：")
            val desc = readLine()?.trim() ?: ""
            val book = Book(0, title, desc)
//            println("即将插入的数据为：$book")
            SqlUtil.doSqlWork(BookMapper::class.java) { mapper ->
                val count = mapper.insertBook(book)
                if (count > 0) {
                    println("用户信息插入成功！$book")
                } else {
                    println("用户信息插入失败！")
                }
            }
        }
    }

}