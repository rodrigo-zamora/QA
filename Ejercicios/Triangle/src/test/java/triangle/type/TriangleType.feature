Feature: Calculates the triangle type. 

Background:
    * url 'http://localhost:8080/'
Scenario: Scalene triangle 
    * def escaleno = 
    """
    {
        "sideA" : 2,
        "sideB" : 3,
        "sideC" : 4
    }
    """

    Given path '/type'
    And request escaleno
    When method post
    Then status 200
    * def type = response.type
    * print type 
    And match type contains 'SCALENE'

Scenario: Isosceles triangle
    * def isosceles =
    """
    {
        "sideA" : 2,
        "sideB" : 2,
        "sideC" : 3
    }
    """

    Given path '/type'
    And request isosceles
    When method post
    Then status 200
    * def type = response.type
    * print type
    And match type contains 'ISOSCELES'

Scenario: Equilateral triangle
    * def equilatero =
    """
    {
        "sideA" : 2,
        "sideB" : 2,
        "sideC" : 2
    }
    """

    Given path '/type'
    And request equilatero
    When method post
    Then status 200
    * def type = response.type
    * print type
    And match type contains 'EQUILATERAL'

Scenario: Not a triangle
    * def notTriangle =
    """
    {
        "sideA" : 2,
        "sideB" : 2,
        "sideC" : 4
    }
    """

    Given path '/type'
    And request notTriangle
    When method post
    Then status 500