Feature: Unsuccessful Company Registration

  Scenario: User provides empty company name
    Given User provides empty company name
    When User sends registration request
    Then The response should be not successful
    And The user should receive the following messages
      | ENGLISH | Specify the company name |
      | SPANISH | Indique el nombre de la compañía |

  Scenario: User provides empty email
    Given User provides empty email
    When User sends registration request
    Then The response should be not successful
    And The user should receive the following messages
      | ENGLISH | Please specify your email |
      | SPANISH | Ingresa tu correo electrónico |

  Scenario: User provides existent email
    Given User provides existent email
    When User sends registration request
    Then The response should be not successful
    And The user should receive the following messages
      | ENGLISH | This email is already being used on Monedero Bingo. |
      | SPANISH | Este correo ya se esta utilizando en Monedero Bingo. |
