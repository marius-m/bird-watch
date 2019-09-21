package lt.markmerkk.birdwatch.controllers

import lt.markmerkk.birdwatch.entities.TwFeed
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.social.twitter.api.impl.TwitterTemplate
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {

    @Autowired
    lateinit var twitterTemplate: TwitterTemplate

    @RequestMapping(value = "/tweets")
    fun index(model: ModelMap): String {
        val profile = twitterTemplate
                .userOperations()
                .getUserProfile("@u3x")
        val feed = twitterTemplate
                .timelineOperations()
                .userTimeline
                .map { TwFeed.fromTweet(it) }
        model.addAttribute("tweets", feed)
        return "tweets"
    }

}