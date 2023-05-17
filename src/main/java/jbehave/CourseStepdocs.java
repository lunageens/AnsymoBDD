package jbehave;
import java.util.Arrays;
public class CourseStepdocs extends CourseStories {
    @Override
    public void run() throws Throwable {
        configuredEmbedder().reportStepdocsAsEmbeddables(Arrays.asList(CourseStories.class.getName()));
    }


}
