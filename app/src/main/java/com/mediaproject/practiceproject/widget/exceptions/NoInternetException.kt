package com.mediaproject.practiceproject.widget.exceptions

import java.io.IOException

class NoInternetException : IOException() {

    override val message: String
        get() = "The network is not connected"

}