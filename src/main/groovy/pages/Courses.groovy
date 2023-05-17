package pages

import org.jbehave.web.selenium.GroovyGebFluentWebDriverPage
import org.jbehave.web.selenium.WebDriverProvider
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

class Courses extends GroovyGebFluentWebDriverPage {

    //nakijken wat dit is
    def Courses(WebDriverProvider webDriverProvider) {
        super(webDriverProvider)
    }

    def go() {
        get("http://ansymore.uantwerpen.be/courses")
    }

    def getAllCourses(){
        List<WebElement> courseElements = findElements(By.xpath("//div[@class='course']"))
        return courseElements
    }

    def verifyAllCourses(){
        List<WebElement> courseElements = findElements(By.xpath("//div[@class='course']"))
        assert courseElements.size() > 0: "No courses found on the page"
    }

    def goToCourse(WebElement course){
        course.click()
    }

    def verifyNameCourse(WebElement course){
        go()
        String courseTitle = course.findElement(By.xpath(".//div[@class='title']/a")).getText()
        goToCourse(course)
        WebElement courseTitleElement = course.findElement(By.xpath("//h1[text()='" + courseTitle + "']"))
        assert courseTitleElement.isDisplayed() : "Course title not displayed"
    }

    def verifyProfessorCourse(WebElement course){
        go()
        String professorName = course.findElement(By.xpath(".//div[@class='field']/a")).getText()
        goToCourse(course)
        WebElement professorNameElement = findElement(By.xpath("//div[text()='" + professorName + "']"))
        assert professorNameElement.isDisplayed(): "Professor name not displayed"
    }

}
