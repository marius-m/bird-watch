package lt.markmerkk.birdwatch.entities

import org.springframework.social.twitter.api.Tweet

data class TwFeed(val user: String, val text: String, val createAt: String) {
    companion object {
        fun fromTweet(tweet: Tweet): TwFeed {
            return TwFeed(
                    user = tweet.fromUser,
                    text = tweet.text,
                    createAt = tweet.createdAt.toString()
            )
        }
    }
}