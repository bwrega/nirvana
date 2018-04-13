package com.realizationtime.nirvana.spock

import spock.lang.Specification
import spock.lang.Unroll

class NirvanaShould extends Specification {

	@Unroll
	def 'isEnlighted() should be #enlighted for age #age'(Integer age, Boolean enlighted) {
		expect:
		new Nirvana("John", "Smith", age).isEnlighted() == enlighted

		where:
		age  || enlighted
		1    || false
		108  || false
		666  || false
		667  || true
		1110 || true
	}

	def 'age < 0 is invalid'() {
		given:
		Nirvana nirvana = new Nirvana("John", "Smith", -6)

		when:
		nirvana.validate()

		then:
		thrown(Nirvana.NirvanaValidationException)
	}

	@Unroll
	def 'age #age is valid'(Integer age) {
		given:
		Nirvana nirvana = new Nirvana("John", "Smith", age)

		when:
		nirvana.validate()

		then:
		notThrown(Nirvana.NirvanaValidationException)

		where:
		age << [0, 1, 66, 77, 112]
	}
}
