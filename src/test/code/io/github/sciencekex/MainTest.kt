package io.github.sciencekex

import io.github.sciencekex.mapper.StudentMapper
import io.github.sciencekex.util.SqlUtil
import org.apache.ibatis.session.SqlSession
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

//class MainTest {
//    val session: SqlSession = SqlUtil.openSession()
//    @BeforeAll
//    @Test
//    fun test() {
//    }
//}
class MainTest {

    companion object {
        private lateinit var sqlSession: SqlSession
        private lateinit var studentMapper: StudentMapper

        @BeforeAll
        @JvmStatic
        fun init() {
            sqlSession = SqlUtil.openSession()
            studentMapper = sqlSession.getMapper(StudentMapper::class.java)
        }

        @AfterAll
        @JvmStatic
        fun close() {
            sqlSession.close()
        }
    }

    @Test
    fun test() {
        studentMapper.test()
    }
}