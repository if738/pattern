package com.spd.common.db

class DataHolder {
    companion object {

        private var data: String = ""

        fun save(data: String) {
                this.data = data
        }

        fun read(): String = data

    }
}