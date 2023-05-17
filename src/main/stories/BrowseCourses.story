Browse from home page to all course pages

Meta:
@Category Exercise5

Narrative:
As a user of the ansymore.uantwerpen.be site
I want to navigate to all the courses listed in the "menu" section of the homepage
So that I can see information about each course and verify that each course has a professor.

Scenario: Verify all courses from homepages (names and professors)
Given the user navigates to "http://ansymore.uantwerpen.be/" homepage
When the user clicks the "Courses" link in the menu section
Then the user should see a page with all the courses listed
And for each course, the user should see the name of the course and the name of the professor teaching the course