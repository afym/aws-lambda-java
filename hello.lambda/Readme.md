### Stepts before work

* Create a IAM role in your AWS account
* Export the project in a *.jar / export > java > jar file
* Create a Lambda function in your AWS account

### Parameters to configure your lambda function

Role : Choose an existing role
Existing role : The role you have created
Handler : com.hello.lambda.FunctionHandler

### How to invoke?

In the Input test event try with this:

```
"Angel"
```

You must to expect something like:

```
"Hello Angel"
```