Feature: sample karate test script

Background:
* url urls.eps

Scenario: get all users and then get the first user by id

Given path 'users'
When method get
Then status 200

#  * def foo = read('properties-qa.yaml')
#  * print foo

* def expResponse = read('classpath:Response.json')
* print response


* def jsonFromYaml = read('classpath:properties-qa.yaml')
* print ' ******************'+urls.eps
* def first = response[0]
* print ' asdfasdfasdfasddddddddsddddd'+first.address.geo.lat

Given path 'users', first.id
When method get
Then status 200
Then match first == expResponse

Scenario: create a user and then get it by id

* def user =
"""
{
    "name": "Test User",
    "username": "testuser",
    "email": "test@user.com",
    "address": {
      "street": "Has No Name",
      "suite": "Apt. 123",
      "city": "Electri",
      "zipcode": "54321-6789"
    }
}
"""

Given url 'https://jsonplaceholder.typicode.com/users'
And request user
When method post
Then status 201

* def id = response.id
* print 'created id is: ' + id

Given path id
# When method get
# Then status 200
# And match response contains user

