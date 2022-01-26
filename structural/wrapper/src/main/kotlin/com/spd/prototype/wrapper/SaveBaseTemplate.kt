package com.spd.prototype.wrapper

import com.spd.common.db.DataHolder


class SaveBaseTemplate() : Template {

    override fun save(data: String) {
        DataHolder.save(data)
    }

    override fun read(): String = DataHolder.read()
}