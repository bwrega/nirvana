package com.realizationtime.nirvana.spock

data class Nirvana(val firstName: String, val secondName: String, val age: Int) {

    fun validate(): Unit {
        if (age < 0) {
            throw NirvanaValidationException()
        }
    }

    fun isEnlighted(): Boolean {
        return age > 666
    }

    class NirvanaValidationException : RuntimeException()
}
