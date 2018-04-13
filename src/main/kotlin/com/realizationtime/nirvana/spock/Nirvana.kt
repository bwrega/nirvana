package com.gene.bioinfo.ms.barcodePrinter.nirvana

class Nirvana {
	String firstName
	String secondName
	Integer age

	void validate() {
		if (age < 0) {
			throw new NirvanaValidationException()
		}
	}

	boolean isEnlighted() {
		return age > 666
	}

	static class NirvanaValidationException extends RuntimeException {}
}
