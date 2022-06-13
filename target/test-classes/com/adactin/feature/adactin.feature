Feature: Booking Hotel Room Functionality in WebApplication
Scenario Outline: Login Functionality of the Application
Given User lanches the Application
When User enters the "<username>" in the username
And User enters the "<password>" in the password
And User clicks the login button
Then User validates the navigation from logoin page to search hotel page


Examples:
|username|password|
|Senthura|Senthuran@12|
|senthuran|senthuan@12|
|Sethuran|senthuran@15|
|senthuran|Senthuran@12|


Scenario: verify user in the search hotel page
When user selects the location in the location field
And  user selects the hotels in the hotel field 
And  user selects the roomtype in the roomtype field
And  user selects the numberofroom in the nof field
And  user selects the checkindate in the checkin field
And  user selects the checkoutdate in the checkout field
And  user selects the numberofadult in the adultperroom field
And  user select the  numberofchild in the childperroom field
And  user click search button to search the hotel details
Then user validates the navigation from searchpage to select page




Scenario: verify user in the selecting hotel page
When user select the radiobutton if the detail enter is correct
And  user click the continue button for continue the booking
Then user validate the navigation from select page to roombookingpage


Scenario: Verify user in the room booking page
When user enters the firstname in the first name field
And user enters the lastname in the last name field
And user enters the address in the address field
And user enters the credit card details in the card details field
And users selects the cardtpe in the card type
And users Selects the card expiry month in the select month field
And users selects the card expiry year in the select year field
And users enters the cvv number in the cvvnumber field
And users click the booknow button to confirm the booking

Scenario: booking confiramtion
When user click myliternary to view the booking detail
Then User navigate into the book intenary page 

 Scenario: book itneary page
     When user click logut to come out of application
     Then user close the application