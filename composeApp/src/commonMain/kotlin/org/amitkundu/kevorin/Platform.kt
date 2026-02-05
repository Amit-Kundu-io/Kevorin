package org.amitkundu.kevorin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform