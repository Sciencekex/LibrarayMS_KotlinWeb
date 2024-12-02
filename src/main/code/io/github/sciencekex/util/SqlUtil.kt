package io.github.sciencekex.util

import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import org.apache.ibatis.io.Resources
import java.io.IOException
import java.util.logging.Logger
import java.util.function.Consumer  // 导入 Consumer 类


class SqlUtil {
    companion object {
        private var factory: SqlSessionFactory? = null
        private var sqlSession: SqlSession? = null

        init {
            try {
                // 加载 MyBatis 配置文件并初始化 SqlSessionFactory
                factory = SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"))
                sqlSession = factory?.openSession(true)  // autoCommit = true
            } catch (e: IOException) {
                Logger.getLogger(SqlUtil::class.java.name).warning("MyBatis 初始化失败: ${e.message}")
            }
        }
        // 执行数据库操作的方法
        // 为了安全?屎山代码!
        fun <T> doSqlWork(mapperClass: Class<T>, consumer: Consumer<T>) {
            sqlSession?.let { consumer.accept(it.getMapper(mapperClass)) }
        }
    }
}
