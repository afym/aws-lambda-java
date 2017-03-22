### Stepts before work

* Create a IAM role in your AWS account
* Export the project in a *.jar / export > java > jar file
* Create a Lambda function in your AWS account

### Parameters to configure your lambda function

* Role : Choose an existing role
* Runtime : Java 8
* Upload a .ZIP or JAR file : your.jar
* Existing role : The role you have created
* Handler : com.hello.lambda.LambdaFunctionHandler
* Advance settings : Memory 128 MB

### How to invoke?

In the Input test event try with this:

```
{
    "threads": 5,
    "iterator": 4
}
```

You must to expect something like:

```
{
  "inputModel": {
    "threads": 5,
    "iterator": 4
  },
  "threads": {
    "lambda5": "total : 20",
    "lambda4": "total : 46",
    "lambda3": "total : 37",
    "lambda2": "total : 49",
    "lambda1": "total : 48",
    "lambda0": "total : 37"
  }
}
```

### What does it do?

It generates many threads as posible to measure the performance of lambda using parallel tasks.

threads : How many threads do you want to make
iterator : How many iterations do you wanto per thread (each thread has a random extra sleep time)