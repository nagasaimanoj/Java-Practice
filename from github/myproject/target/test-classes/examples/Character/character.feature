Feature: title
  In order to value
  As a role
  I want feature

Scenario: create a user

* def user =
"""
  {
    "name": "dobby",
    "id": 4
  }
"""
Given url 'http://localhost:8080/api/characters'
And request user
When method post
Then status 200