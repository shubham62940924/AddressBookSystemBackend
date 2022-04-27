package com.blz.addressbook.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.stereotype.Component;

@Component
public class TokenUtil {
    private static final String SECRET = "1234567890";


    public String createToken(long l) {
        String token = null;
        try {
            token = JWT.create().withClaim("id", l).sign(Algorithm.HMAC512(SECRET));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return token;
    }

    public Long decodeToken(String jwt) {
        Long userId = (long) 0;
        try {
            if (jwt != null) {
                userId = JWT.require(Algorithm.HMAC512(SECRET)).build().verify(jwt).getClaim("id").asLong();
                return userId;
            }

        } catch (JWTVerificationException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return userId;

    }
}






