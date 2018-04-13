package com.realizationtime.nirvana.spock

open class NirvanaRepository {

	open fun save(nirvana: Nirvana): Nirvana {
		throw NirvanaUnsupportedException()
	}

	class NirvanaUnsupportedException: UnsupportedOperationException("Sorry, Curt!")

}
