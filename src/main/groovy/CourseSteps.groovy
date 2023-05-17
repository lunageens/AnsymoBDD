

import com.github.tanob.groobe.GrooBe

import org.jbehave.core.annotations.Given
import org.jbehave.core.annotations.When
import org.jbehave.core.annotations.Then

import org.openqa.selenium.WebElement

import pages.Courses
import pages.Home

public class CoursesSteps {

    Home home
    Courses courses

    def CoursesSteps(){
        GrooBe.activate() // nakijken wat dit doet
    }

    @Given("the user navigates to \"$url\" homepage")
    void navigateToHomePage() {
        home.go()
    }

    @When("the user clicks the \"$linkText\" link in the menu section")
    void clickCoursesLink(String linkText) {
        home.goToMenuSection(linkText)
    }

    @Then("the user should see a page with all the courses listed")
    void verifyAllCoursesDisplayed() {
        courses.verifyAllCourses()
    }

    @Then("for each course, the user should see the name of the course and the name of the professor teaching the course")
    void verifyCourseDetails() {
        List<WebElement> Courses = courses.getAllCourses()
        for (WebElement course : Courses) {
            courses.verifyNameCourse(course)
            courses.verifyProfessorCourse(course)
        }
    }

    @Given("today has a y in its name")
    def todayHasAYInItsName() {
        // all days have y in their name
    }
}
