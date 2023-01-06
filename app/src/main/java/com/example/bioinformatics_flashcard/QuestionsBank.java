package com.example.bioinformatics_flashcard;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> introQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        // questions for intro
        final QuestionsList intro_question_1 = new QuestionsList("What is Bioinformatics?",
                "A field that involves lab equipments to store and analyze data",
                "A technique to store any data in the database",
                "A field that uses computer to store and analyze biological data",
                "A field that studies computer hardwares and design websites",
                "A field that uses computer to store and analyze biological data",
                "");

        final QuestionsList intro_question_2 = new QuestionsList("Bioinformatics is a _____ field?",
                "Multidisciplinary",
                "Single",
                "Lame",
                "Innovative",
                "Multidisciplinary",
                "");

        final QuestionsList intro_question_3 = new QuestionsList("What type of data do Bioinformaticians store and analyze?",
                "Business",
                "Number sequences",
                "Biological",
                "Boolean",
                "Biological",
                "");

        final QuestionsList intro_question_4 = new QuestionsList("What does Gold Biotechnology involve with?",
                "Fermentation",
                "Aquaculture",
                "Computers",
                "Bioterrorism",
                "Computers",
                "");

        final QuestionsList intro_question_5 = new QuestionsList("What do Scientists use to store biological information?",
                "Folders",
                "Containers",
                "Databases",
                "Plastics",
                "Databases",
                "");

        final QuestionsList intro_question_6 = new QuestionsList("Bioinformatics is a combination of Biology, _____, and _____?",
                "Computer Science and Statistics",
                "Computer Science and Economics",
                "Statistics and Physics",
                "Statistics and Organic Chemistry",
                "Computer Science and Statistics",
                "");

        final QuestionsList intro_question_7 = new QuestionsList("What type of analysis can be done by Bioinformatics?",
                "in cognito",
                "in vitro",
                "in vivo",
                "in silico",
                "in silico",
                "");

        final QuestionsList intro_question_8 = new QuestionsList("According to Edgar Da Silva (former Director Division of Life Sciences, UNESCO), Bioinformatics is part of ____ Biotechnology?",
                "Yellow",
                "Gold",
                "Black",
                "Red",
                "Gold",
                "");

        final QuestionsList intro_question_9 = new QuestionsList("These are the applications of Bioinformatics, except ____?",
                "Precision medicine",
                "Vaccine design",
                "Cell culture",
                "Omics analysis",
                "Cell culture",
                "");

        // add all questions from intro to the list
        questionsLists.add(intro_question_1);
        questionsLists.add(intro_question_2);
        questionsLists.add(intro_question_3);
        questionsLists.add(intro_question_4);
        questionsLists.add(intro_question_5);
        questionsLists.add(intro_question_6);
        questionsLists.add(intro_question_7);
        questionsLists.add(intro_question_8);
        questionsLists.add(intro_question_9);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(){
            return introQuestions();
        }
    }

