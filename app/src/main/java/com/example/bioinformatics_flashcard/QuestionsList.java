package com.example.bioinformatics_flashcard;

public class QuestionsList {

    private String question, option_1, option_2, option_3, option_4, answer;
    private String userSelectedAnswer;

    public QuestionsList(String question, String option_1, String option_2, String option_3, String option_4, String answer, String userSelectedAnswer) {
        this.question = question;
        this.option_1 = option_1;
        this.option_2 = option_2;
        this.option_3 = option_3;
        this.option_4 = option_4;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption_1() {
        return option_1;
    }

    public String getOption_2() {
        return option_2;
    }

    public String getOption_3() {
        return option_3;
    }

    public String getOption_4() {
        return option_4;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }
}
