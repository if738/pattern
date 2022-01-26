package com.spd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlyweightApplication

fun main(args: Array<String>) {
	runApplication<FlyweightApplication>(*args)
}
