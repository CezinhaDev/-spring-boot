package com.example.Projeto.Spring_Boot.security;

import java.sql.Date;

import io.jsonwebtoken.Jwts;

public class JwtUtil {
    private static final Key Key =  Keys.secretKeyFor(SignatureAlgorithm.HS256);

    private static final long EXPIRATION_TIME = 86400000; // 1 dia em milissegundos


    public static String generateToken(String username){
        return Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(Key)
                .compact();
    }

}
