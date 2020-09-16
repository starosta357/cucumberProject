package com.cucumber.junit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber-reports/CucumberTemsts.json",
                "junit:target/cucumber-reports/CucumberTests.xml"}, //дозволяє інтегрувати сторонні плагіниб а також заміняти
        // логи під час прогону тестів і також в репортах, pretty - найбільш інформативний
        monochrome = true, //колір логів в терміналі, true - кольорові
        tags = "@smoke", //фільтр запуску тестів по тегам, якщо треба декілька тегів через ,
        glue = "com.cucumber.junit", //пакет де степи і хуки, можна вказувати декілька
        features = "classpath:com/cucumber/junit/features" //шлях до папки з фіча файлами
)
public class CucumberTestRunner {
}
