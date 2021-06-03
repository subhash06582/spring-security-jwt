package io.javabrains.models;
import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

	private static final long serialVersionUID = 8702465797928335534L;
	
	private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}