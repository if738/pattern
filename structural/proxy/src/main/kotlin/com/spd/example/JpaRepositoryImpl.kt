package com.spd.example

import com.spd.common.db.ListDataHolder

class JpaRepositoryImpl : JpaRepository {
    override fun save(name: String): String {
        return ListDataHolder.save(name)
    }

    override fun findAll(): List<String> {
        return ListDataHolder.findAll()
    }

    override fun find(name: String): String {
        return ListDataHolder.findByName(name)
    }
}