package com.tiooooo.flappybee.util

enum class Platform{
    Android,
    iOS,
    Desktop,
    Web,
}

expect fun getPlatform(): Platform