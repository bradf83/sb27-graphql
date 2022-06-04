# Spring Boot 2.7 App Using GraphQL Starter

A POC application that I am using with `cra-sb27-graph` repository to test out the Spring Boot GraphQL starter

## Running The Application

I use VSCode as my editor of choice, you should be able to use the `launch.json` to run the application. You will need to fill in your environment properties:

```properties
SPRING_SECURITY_OAUTH2_RESOURCESERVER_JWT_JWK-SET-URI=<your URI>
```

You may also need to modify the CORS Bean in the `SecurityConfiguration` class.

## Built With

- Spring Boot 2.7
- Java 18
- Maven

## OAuth2 Provider

When developing I used a free account from OKTA as my OAuth2 provider.
