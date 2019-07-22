@login
Feature: As a GE user, I login

  Background:
    Given I am running something before every scenario

    @indu
  Scenario: As a GE User, I do something
    When I do something
      | url                  | credentials             |
      | http://www.gmail.com | indu@gmail.com, indu123 |


  Scenario Outline: As a GE user, I do something else

    When I do something
      | url   | credentials  |
      | <url> | <crdentials> |

    @mohan
    Examples:
      | url                  | crdentials                    |
      | http://www.gmail.com | mohan.bla@gmail.com, mohan123 |

    @hemanth
    Examples:
      | url                  | crdentials                        |
      | http://www.gmail.com | hemanth.bla@gmail.com, hemanth123 |


