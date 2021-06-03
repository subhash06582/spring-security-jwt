# Spring Security JWT
Spring Boot + Spring Security + JWT.

## Technologies
* Spring Boot
* Spring Security
* JWT

### API Endpoints

|     API        |     URL          |
| ------------- | ------------- |
| Endpoint to get JWT| http://localhost:8080/authenticate |
| Endpoint which need to be authrized| http://localhost:8080/hello |


#### authenticate POST Request Input
```
	{
	    "username": "foo",
            "password":"foo"
	} 
```

#### authenticate POST Request Output
```
	{
	    "jwt": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmb28iLCJleHAiOjE2MjI3Mzg2MTUsImlhdCI6MTYyMjcwMjYxNX0.17EGARRo1vktvlXf3jj8U4Ivhlh2xFBtX4Wmb0ymy8I"
	} 
```


#### hello GET Request Header
```
	Authorization : Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmb28iLCJleHAiOjE2MjI3Mzg2MTUsImlhdCI6MTYyMjcwMjYxNX0.17EGARRo1vktvlXf3jj8U4Ivhlh2xFBtX4Wmb0ymy8I 
```
