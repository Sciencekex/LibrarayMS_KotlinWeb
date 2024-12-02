package io.github.sciencekex.mapper

import org.apache.ibatis.annotations.Insert

interface StudentMapper {
    @Insert("insert into db_student(name, gender, age) values('小刚', '男', 19)")
    fun test()

}