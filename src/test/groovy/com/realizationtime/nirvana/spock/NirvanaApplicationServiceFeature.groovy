package com.realizationtime.nirvana.spock

import spock.lang.Specification

class NirvanaApplicationServiceFeature extends Specification {

	NirvanaRepository repository = Mock()
	NirvanaApplicationService service = new NirvanaApplicationService(repository)

	def 'createNew() should return new Nirvana with firstName: #firstName, secondName: #secondName, age: #age'(
			String firstName, String secondName, Integer age
	) {
		given:
		repository.save(_) >> { Nirvana nirvana -> nirvana}

		when:
		Nirvana newEntity = service.createNew(firstName, secondName, age)

		then:
//		1 * repository.save(_)
		newEntity.firstName == firstName
		newEntity.secondName == secondName
		newEntity.age == age

		where:
		firstName | secondName | age
		"Curt"    | "Cobain"   | 33
		"Bartek"  | "Wręga"    | 1110
	}

	def 'createNew() should invalidate age < 0'() {
		given:
		def age = -5

		when:
		service.createNew("John", "Smith", age)

		then:
		thrown(Nirvana.NirvanaValidationException)
		0 * repository.save(_)
	}
}
