package com.spd.service

import com.spd.example.SomeCollection
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        val someCollection = SomeCollection()
        val iterator = someCollection.getIterator()
        while (iterator.hasNext()){
            println("name: ${iterator.next()}")
        }

    }

}
