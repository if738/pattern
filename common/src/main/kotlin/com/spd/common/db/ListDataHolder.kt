package com.spd.common.db

class ListDataHolder {
    companion object {

        private var data: MutableList<String> = ArrayList()

        fun save(data: String): String {
            this.data.add(data)
            return data
        }

        fun findAll(): List<String> {
            return data
        }

        fun findByName(name: String): String {
            return data.find { it == name } ?: ""
        }

    }
}