package io.github.sciencekex.service

import io.github.sciencekex.entity.Borrow
import io.github.sciencekex.mapper.BorrowMapper
import io.github.sciencekex.util.SqlUtil

class BorrowService {
    companion object {
        fun addBorrow() {
            // 为了安全?屎山代码!
            println("请输入需要插入的学生学号：")
            val sidInput = readLine()?.trim()
            val sid = if (sidInput.isNullOrBlank()) 0 else sidInput.toIntOrNull() ?: 0
            println("请输入需要插入的书本编号：")
            val bidInput = readLine()?.trim()
            val bid = if (bidInput.isNullOrBlank()) 0 else bidInput.toIntOrNull() ?: 0

            val borrow: Borrow = Borrow(sid, bid)
//            println(borrow)
            SqlUtil.doSqlWork(BorrowMapper::class.java) { mapper ->
                val count = mapper.insertBorrow(borrow)
                if (count > 0) {
                    println("用户信息插入成功！$borrow")
                } else {
                    println("用户信息插入失败！")
                }
            }
        }
    }

}