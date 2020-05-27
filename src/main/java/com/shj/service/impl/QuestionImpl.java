package com.shj.service.impl;

import com.shj.dao.OptionTableDao;
import com.shj.dao.QuesDao;
import com.shj.entity.QuestionDTO;
import com.shj.entity.Questions;
import com.shj.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionImpl implements QuestionService {

    @Resource
    private OptionTableDao optionTableDao;


    @Resource
    private QuesDao quesDao;

    @Override
    public List<Questions> getAll() {
        List<QuestionDTO> all = optionTableDao.getAll();
        List<Questions> list = new ArrayList<>();
        W:for (QuestionDTO questionDTO : all) {

            for (Questions questions : list) {
                if (questions.getQid() == questionDTO.getQid()) {
                    continue W;
                }
            }
            Questions questions = new Questions();
            questions.setQuestion(questionDTO.getQuestion());
            questions.setCorrectAnswer(questionDTO.getCorrectanswer());
            Integer qid = questionDTO.getQid();
            questions.setQid(qid);
            List<String> option = optionTableDao.getOption(qid);
            questions.setAnswers(option);
            list.add(questions);
        }
        return list;
    }

    @Override
    public List<Questions> getQuestions() {
        return quesDao.getAll();
    }


}
