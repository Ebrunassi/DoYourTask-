package br.com.personal.doyourtask

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DoYourTaskApplication

fun main(args: Array<String>) {
	runApplication<DoYourTaskApplication>(*args)
}
