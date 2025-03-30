package com.lagradost

data class Nation(private val url: String, private val name: String) {
    fun getPoster(): String {
        return "https://github.com/emcrisostomo/flags/raw/master/png/256/${
            url
                .substringAfterLast("/")
                .substringBeforeLast(".").uppercase()
        }.png"
    }

    fun getName(): String {
        return name
    }

    fun getUrl(): String {
        return url
    }
}
