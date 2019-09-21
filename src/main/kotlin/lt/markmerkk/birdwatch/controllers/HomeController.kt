package lt.markmerkk.birdwatch.controllers

import org.springframework.stereotype.Controller

@Controller
class HomeController {

    fun index(): String {
        return "index"
    }

}