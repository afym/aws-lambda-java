package com.thread.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.thread.lambda.model.*;

public class LambdaFunctionHandler implements RequestHandler<InputModel, OutputModel> {

    public OutputModel handleRequest(InputModel input, Context context) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Hashtable<String, LambdaThread> threads = new Hashtable<String, LambdaThread>();

        for (int index = 0; index <= input.getThreads(); index++) {
        	String threadKey = "lambda" + index;
        	LambdaThread lambda = new LambdaThread(threadKey, input.getIterator());
        	threads.put(threadKey, lambda);
        	executor.execute(lambda);
        }        

        executor.shutdown();

        Hashtable<String, String> responses = new Hashtable<String, String>();

        for (String threadKeyGet : threads.keySet()) {
        	responses.put(threadKeyGet, "total : " + threads.get(threadKeyGet).getTotal());
        }

        OutputModel output = new OutputModel();
        output.setInputModel(input);
        output.setThreads(responses);
        return output;
    }
}
