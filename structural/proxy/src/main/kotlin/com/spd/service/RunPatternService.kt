package com.spd.service

import com.spd.example.CacheJpaRepository
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import kotlin.random.Random

@Component
class RunPatternService {

    @PostConstruct
    fun runIt() {

        val cacheJpaRepository = CacheJpaRepository()
        for (i in 1..5000)
        cacheJpaRepository.save("one")
        cacheJpaRepository.save("two")
        cacheJpaRepository.save("three")
        cacheJpaRepository.save("four")

        println(cacheJpaRepository.find("two"))
        println(cacheJpaRepository.find("one"))
        println(cacheJpaRepository.find("one"))
        println(cacheJpaRepository.find("one"))
        println(cacheJpaRepository.find("four"))
        println(cacheJpaRepository.find("four"))
        println(cacheJpaRepository.find("two"))
    }

}
