package com.spd.example.db

interface DataSource {

    fun save(data: String)
    fun get(): String

}