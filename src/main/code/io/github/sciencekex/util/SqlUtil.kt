package io.github.sciencekex.util

import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import java.io.IOException
import java.io.InputStream
import java.util.logging.Logger

class SqlUtil {
    companion object {
        private val log: Logger = Logger.getLogger(SqlUtil::class.java.name)
        private val factory: SqlSessionFactory by lazy {
            try {
                SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"))
            } catch (e: IOException) {
                log.warning("初始化失败: ${e.message}")
                throw e
            }
        }

        fun openSession(): SqlSession {
            return factory.openSession(true)
        }
    }
}
