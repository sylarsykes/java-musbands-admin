package org.sylrsykssoft.java.musbands.admin.users.exception;

import java.beans.ConstructorProperties;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.sylrsykssoft.coreapi.framework.library.error.exception.CoreApiFrameworkLibraryException;

/**
 * MusbandsAdminUsersException
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class MusbandsAdminUsersException extends CoreApiFrameworkLibraryException {
	private static final long serialVersionUID = 4594253434183319508L;

	/**
	 * Message constructor
	 * 
	 * @param message
	 */
	@ConstructorProperties({ "message"})
	public MusbandsAdminUsersException(final String message) {
		super(message);
	}

	/**
	 * AllArgsConstructor
	 * 
	 * @param message
	 * @param cause
	 */
	@ConstructorProperties({ "message", "cause"})
	public MusbandsAdminUsersException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Cause constructor
	 * 
	 * @param cause
	 */
	@ConstructorProperties({ "cause"})
	public MusbandsAdminUsersException(final Throwable cause) {
		super(cause);
	}

}
