# Serenity BDD with Spring and JBehave

## adder.story

### Run via Maven

Command line: <i>clean verify</i>

### Run via JUnit
Class: <i>com.voyager.serenity.spring.Adder</i>

VM options: <i>-ea</i>



## google.story

### Run via Maven

Command line: <i>clean verify -DstoryFilter=google -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=chromedriver</i>


### Run via JUnit
Class: <i>com.voyager.serenity.spring.Google</i>

VM options: <i>-ea -DstoryFilter=google -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=chromedriver</i>


[Article with this code in Baeldung site](https://www.baeldung.com/serenity-spring-jbehave)
