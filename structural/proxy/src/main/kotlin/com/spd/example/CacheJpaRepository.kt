package com.spd.example

import com.spd.common.db.ListDataHolder

class CacheJpaRepository : JpaRepository {

    private val cache: MutableList<String> = ArrayList()

    override fun save(name: String): String {
        return ListDataHolder.save(name)
    }

    override fun findAll(): List<String> {
        val findAll = ListDataHolder.findAll()
        cache.clear()
        cache.addAll(findAll)
        return findAll
    }

    override fun find(name: String): String {
        return getFromCache(name)
    }

    private fun getFromCache(value: String): String {
        val cache = cache.find { it == value }
        if (cache != null) {
            return "$cache RETRIVED FROM CASHE"
        }
        val db = ListDataHolder.findByName(value)
        this.cache.add(db)
        return db
    }
}