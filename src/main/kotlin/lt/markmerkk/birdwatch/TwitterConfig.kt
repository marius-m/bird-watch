package lt.markmerkk.birdwatch

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.social.twitter.api.impl.TwitterTemplate

@Configuration
class TwitterConfig {

    @Value("\${spring.social.twitter.appId}")
    lateinit var consumerKey: String

    @Value("\${spring.social.twitter.appSecret}")
    private lateinit var consumerSecret: String

    @Value("\${twitter.access.token}")
    lateinit var accessToken: String

    @Value("\${twitter.access.token.secret}")
    lateinit var accessTokenSecret: String

    @Bean
    fun twitterTemplate(): TwitterTemplate {
        return TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret)
    }
}

