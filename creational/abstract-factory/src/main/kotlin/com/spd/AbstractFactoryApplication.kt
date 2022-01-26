package com.spd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AbstractFactoryApplication

fun main(args: Array<String>) {
	runApplication<AbstractFactoryApplication>(*args)
}
