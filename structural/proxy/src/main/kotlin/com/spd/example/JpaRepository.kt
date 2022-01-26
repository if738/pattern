package com.spd.example

interface JpaRepository {

    fun save(name: String): String
    fun findAll(): List<String>
    fun find(name: String): String

}