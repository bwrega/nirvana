package com.gene.bioinfo.ms.barcodePrinter.nirvana

class NirvanaRepository {

	Nirvana save(Nirvana nirvana) {
		throw new NirvanaUnsupportedException()
	}

	static class NirvanaUnsupportedException extends UnsupportedOperationException {
		NirvanaUnsupportedException() {
			super("Sorry, Curt!")
		}
	}
}
