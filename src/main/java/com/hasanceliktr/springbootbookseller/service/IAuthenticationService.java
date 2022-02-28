package com.hasanceliktr.springbootbookseller.service;

import com.hasanceliktr.springbootbookseller.model.User;

public interface IAuthenticationService {

	User signInAndReturnJWT(User signInRequest);

}
