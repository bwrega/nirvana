package com.gene.bioinfo.ms.barcodePrinter.nirvana

import groovy.transform.Canonical

@Canonical
class NirvanaApplicationService {

	final NirvanaRepository repository

	Nirvana createNew(String firstName, String secondName, Integer age) {
		Nirvana nirvana = new Nirvana(firstName: firstName, secondName: secondName, age: age)
		nirvana.validate()
		return repository.save(nirvana)
	}

}
