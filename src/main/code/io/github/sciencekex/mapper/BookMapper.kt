package io.github.sciencekex.mapper

import io.github.sciencekex.entity.Book
import io.github.sciencekex.entity.Student
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Select

interface BookMapper {
    @Insert("insert into db_book(title, description) values(#{title}, #{description})")
    fun insertBook(book: Book): Int

    @Select("select * from db_book")
    fun selectAllBooks(): List<Book>
}