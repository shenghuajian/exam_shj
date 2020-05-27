package com.shj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)//链式编程
public class QuestionDTO {
    private Integer qid;

    private String question;

    private Integer correctanswer;

    private Integer optionRank;

    private String optionText;
}
