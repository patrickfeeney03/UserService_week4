# UserService_week4
First run the three projects at the same time.
Use some API tool such as Talend API Tester to send a POST request with a body.
The URI is `http://localhost:8081/confirm-and-register`\
The body should contain a name and email. Example:
```Json
{
  "name": "Patrick",
  "email": "patrick@email.com"
}

```
After sending the request, the UserService communicates with the RegistrationService, which 'registers' the user. After that, the RegistrationService POSTs to NotificationService that sends a Json back to the user to tell the user about the registered details.<br><br>
The notification sent by NotificationService should look like the image below:
![image](https://github.com/patrickfeeney03/UserService_week4/assets/20804021/820bbeff-548f-45d0-982f-444c53687372)

