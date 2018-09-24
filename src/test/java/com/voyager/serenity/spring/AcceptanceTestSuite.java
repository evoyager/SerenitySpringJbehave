package com.voyager.serenity.spring;

import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.io.StoryFinder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static java.util.Arrays.asList;

public class AcceptanceTestSuite extends SerenityStories {

    public AcceptanceTestSuite() {

    }

    @Override
    public List<String> storyPaths() {
        FileInputStream fis;
        Properties property = new Properties();
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String codeLocation = codeLocationFromClass(this.getClass()).getFile();
        return new StoryFinder().findPaths(property.getProperty("stories.path"), asList("**/*.story"), null);
    }
}
