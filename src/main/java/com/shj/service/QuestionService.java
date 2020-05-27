package com.shj.service;

import com.shj.entity.QuestionDTO;
import com.shj.entity.Questions;

import java.util.List;

public interface QuestionService {
    List<Questions> getAll();

    List<Questions> getQuestions();
}
