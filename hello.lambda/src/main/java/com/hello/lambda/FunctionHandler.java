package com.hello.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class FunctionHandler implements RequestHandler<String, String> {

    public String handleRequest(String input, Context context) {
        // context.getLogger().log("Input: " + input);
    	StringBuilder builder = new StringBuilder();
    	builder.append("Hello ").append(input);
        return builder.toString();
    }
}
