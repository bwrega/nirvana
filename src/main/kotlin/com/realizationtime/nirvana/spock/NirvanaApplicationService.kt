package com.realizationtime.nirvana.spock

data class NirvanaApplicationService(val repository: NirvanaRepository) {

    fun createNew(firstName: String, secondName: String, age: Int): Nirvana {
        val nirvana = Nirvana(firstName, secondName, age)
        nirvana.validate()
        return this.repository.save(nirvana)
    }

}
