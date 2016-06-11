package rs.ac.uns.ftn.informatika.xmldb.rest.baseX;

/**
 * Klasa sadrzi set podrzanih HTTP metoda.
 * 
 * @author Igor Cverdelj-Fogarasi
 *
 */
public enum RequestMethod {

	PUT {
		@Override
		public String toString() {
			return "PUT";
		}
	},
	GET {
		@Override
		public String toString() {
			return "GET";
		}
	},
	POST {
		@Override
		public String toString() {
			return "POST";
		}
	},
	DELETE {
		@Override
		public String toString() {
			return "DELETE";
		}
	}

}
