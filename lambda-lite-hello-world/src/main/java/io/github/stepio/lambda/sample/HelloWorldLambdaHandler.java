package io.github.stepio.lambda.sample;

import io.github.stepio.lambda.LambdaHandler;
import io.github.stepio.lambda.enums.Method;

import static io.github.stepio.lambda.util.Responses.ok;

public class HelloWorldLambdaHandler extends LambdaHandler {

    public HelloWorldLambdaHandler() {
        register(Method.GET, requestContext -> ok("Hello, world!"));
    }
}
