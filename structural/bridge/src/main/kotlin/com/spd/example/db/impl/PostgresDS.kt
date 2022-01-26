package com.spd.example.db.impl

import com.spd.common.db.DataHolder
import com.spd.example.db.DataSource

class PostgresDS : DataSource {

    private val db: DataHolder = DataHolder()

    override fun save(data: String) {
        return DataHolder.save(data)
    }

    override fun get(): String {
        return DataHolder.read()
    }

}