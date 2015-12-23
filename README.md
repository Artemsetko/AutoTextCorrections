# AutoTextCorrections
Task:
"Text corrections"

Create a Spring Boot application implementing the auto-correction mechanism:
-- the application provides an auto-correction mechanism based on the https://en.wikipedia.org/wiki/Wikipedia:Lists_of_common_misspellings/For_machines
-- there is a web-page containing a text-input; a user can enter text into this input, and the text gets auto-corrected
-- the application exposes a REST interface that takes text as input, and returns corrected text with the corrections

Visual representation is not important, but it is an advantage using JavaScript and CSS.

Test scenario:
I will get your code and run 'mvn spring-boot:run'. Next, I will send a text with errors to your REST.


I built a service that accepted HTTP POST requests at: localhost:8080/corrected
and responded with a JSON representation of a corrected text: {"id":1,"content":"Abilty academy zeebra. Abondoned, turnk; substace.","correctedContent":"ability academy zebra. abandoned, turnkey, trunk; substance."}
