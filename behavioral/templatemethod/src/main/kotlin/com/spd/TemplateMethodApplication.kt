package com.spd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TemplateMethodApplication

fun main(args: Array<String>) {
	runApplication<TemplateMethodApplication>(*args)
}
