package lt.markmerkk.birdwatch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BirdWatchApplication

fun main(args: Array<String>) {
	runApplication<BirdWatchApplication>(*args)
}
