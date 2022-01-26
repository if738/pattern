package com.spd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BridgeApplication

fun main(args: Array<String>) {
	runApplication<BridgeApplication>(*args)
}
