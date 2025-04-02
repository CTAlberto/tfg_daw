package com.tfg.backend.exceptions;

public class UserAlreadyExistsException extends RuntimeException {

	// Constructor sin parámetros
	public UserAlreadyExistsException() {
		super("El usuario con este correo electrónico ya existe.");
	}

	// Constructor con mensaje personalizado
	public UserAlreadyExistsException(String message) {
		super(message);
	}

	// Constructor con mensaje y causa
	public UserAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	// Constructor con causa
	public UserAlreadyExistsException(Throwable cause) {
		super(cause);
	}
}

