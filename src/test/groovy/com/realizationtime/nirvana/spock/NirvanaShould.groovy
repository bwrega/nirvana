package com.gene.bioinfo.ms.barcodePrinter.nirvana

import spock.lang.Specification
import spock.lang.Unroll

class NirvanaShould extends Specification {

	@Unroll
	def 'isEnlighted() should be #enlighted for age #age'(Integer age, Boolean enlighted) {
		expect:
		new Nirvana(firstName: "John", secondName: "Smith", age: age).isEnlighted() == enlighted

		where:
		age  || enlighted
		1    || false
		108  || false
		666  || false
		667  || true
		1110 || true
	}
}
