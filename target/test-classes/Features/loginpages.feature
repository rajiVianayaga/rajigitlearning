Feature: Verifying adactin details

  Scenario Outline: Verifying adactin login with valid credentials
    Given User is on the adactin page
    When User should enter "<username>" and "<password>"
    And User should enter search hotels by "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>"
    And User should enter payment details by "<firstname>","<lastname>","<billingAddress>","<ccNum>","<ccType>","<expMonth>","<expYear>","<cvvNum>"

    Examples: 
      | username     | password | location | hotels        | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstname   | lastname    | billingAddress                  | ccNum            | ccType | expMonth | expYear | cvvNum |
      | Rajalakshmi1 | DRFT3T   | Paris    | Hotel Cornice | Deluxe   | 3 - Three | 13/10/2021  | 15/10/2021   | 3 - Three     | 1 - One         | Rajalakshmi | Athikesavan | No.18,Vinayagar street, Vellore | 1234567891234567 | VISA   | July     |    2022 |    123 |
      | Rajalakshmi1 | DRFT3T   | Paris    | Hotel Cornice | Deluxe   | 3 - Three | 13/10/2021  | 15/10/2021   | 3 - Three     | 1 - One         | Rajalakshmi | Athikesavan | No.18,Vinayagar street, Vellore | 1234567891234567 | VISA   | July     |    2022 |    123 |
      | Rajalakshmi1 | DRFT3T   | Paris    | Hotel Cornice | Deluxe   | 3 - Three | 13/10/2021  | 15/10/2021   | 3 - Three     | 1 - One         | Rajalakshmi | Athikesavan | No.18,Vinayagar street, Vellore | 1234567891234567 | VISA   | July     |    2022 |    123 |
