package com.spd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FacadeApplication

fun main(args: Array<String>) {
	runApplication<FacadeApplication>(*args)
}
