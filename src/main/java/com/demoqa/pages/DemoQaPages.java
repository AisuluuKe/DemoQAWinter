package com.demoqa.pages;
import lombok.*;
import org.testng.annotations.BeforeClass;


@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Builder
public class DemoQaPages {

    protected TextBoxPage textBoxPage;
    protected AlertPage alertPage;
    protected PracticeFormPage practiceFormPage;
    protected ButtonsPage buttonsPage;
    protected MenuPage menuPage;
    protected ProgressBarPage progressBarPage;
    protected WebTablePage webTablePage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        textBoxPage = new TextBoxPage();
        alertPage = new AlertPage();
        practiceFormPage = new PracticeFormPage();
        buttonsPage = new ButtonsPage();
        menuPage = new MenuPage();
        progressBarPage = new ProgressBarPage();
        webTablePage = new WebTablePage();

    }
}