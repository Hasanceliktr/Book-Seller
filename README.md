#Spring Boot Book Seller

### Endpoints

#### Sign-Up

'''
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Authorization: Basic dXNlcm5hbWU6cGFzc3dvcmQ=
Content-Type: application/json
Cookie: JSESSIONID=C08C33DD903A3544F2B6B8D48099F76A
Content-Length: 73

{
    "name":"user",
    "username":"user",
    "password":"user"

}
'''
#### Sign-In

'''

POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Cookie: JSESSIONID=C08C33DD903A3544F2B6B8D48099F76A
Content-Length: 51

{
    "username":"user",
    "password":"user"
}

'''
# Book-Seller
