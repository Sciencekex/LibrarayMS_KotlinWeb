package io.github.sciencekex.mapper

import io.github.sciencekex.entity.Book
import org.apache.ibatis.annotations.Insert

interface BookMapper {
    @Insert("insert into db_book(title, description) values(#{title}, #{description})")
    fun insertBook(book: Book): Int
}