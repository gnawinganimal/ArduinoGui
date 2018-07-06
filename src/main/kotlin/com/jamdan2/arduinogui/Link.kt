package com.jamdan2.arduinogui

import org.ardulink.core.Link
import org.ardulink.core.convenience.Links

val link: Link = Links.getDefault()

fun Link.setServoAngle(angle: Int) {
    when {
        angle < 10 -> sendCustomMessage("ssrv", "00$angle")
        angle < 100 -> sendCustomMessage("ssrv", "0$angle")
        else -> sendCustomMessage("ssrv", "$angle")
    }
}
