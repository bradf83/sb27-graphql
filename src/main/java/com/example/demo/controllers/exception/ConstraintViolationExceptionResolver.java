package com.example.demo.controllers.exception;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.stereotype.Component;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import graphql.schema.DataFetchingEnvironment;

//TODO Improve this
/**
 * Catch ConstraintViolationExceptions and convert to a very basic error.
 * https://docs.spring.io/spring-graphql/docs/current/reference/html/#execution-exceptions
 */
@Component
public class ConstraintViolationExceptionResolver extends DataFetcherExceptionResolverAdapter {
    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        if (ex instanceof ConstraintViolationException) {
            return new GraphQLError() {

                @Override
                public String getMessage() {
                    return ex.getMessage();
                }

                @Override
                public List<SourceLocation> getLocations() {
                    // TODO Auto-generated method stub
                    return null;
                }

                @Override
                public ErrorClassification getErrorType() {
                    return ErrorType.BAD_REQUEST;
                }

            };

        }
        return null;
    }
}
