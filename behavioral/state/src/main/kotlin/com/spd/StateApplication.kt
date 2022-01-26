package com.spd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StateApplication

fun main(args: Array<String>) {
	runApplication<StateApplication>(*args)
}
