package pages

import org.jbehave.web.selenium.GroovyGebFluentWebDriverPage
import org.jbehave.web.selenium.WebDriverProvider
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

class Home extends GroovyGebFluentWebDriverPage{

    // nakijken wat dit is
    def Home(WebDriverProvider webDriverProvider){
        super(webDriverProvider)
    }

    def go() {
        get("http://ansymore.uantwerpen.be/")
    }

    def goToMenuSection(String section){
        WebElement Link = findElement(By.linkText(section))
        Link.click()
    }
}
