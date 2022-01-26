package com.spd.example.service

import com.spd.example.db.DataSource

class ConcreteService(private var dataSource: DataSource) : Service {

    override fun makeVeryHardJob(data: String): String {
        //Abstraction logic....
        dataSource.save("$data modified by ConcreteService")
        return dataSource.get()
    }


}