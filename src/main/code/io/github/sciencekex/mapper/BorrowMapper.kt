package io.github.sciencekex.mapper

import io.github.sciencekex.entity.Borrow
import org.apache.ibatis.annotations.Insert

interface BorrowMapper {
    @Insert("insert into db_borrow(sid,bid) values(#{sid}, #{bid})")
    fun insertBorrow(borrow: Borrow): Int
}