package com.shj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)//链式编程
public class Questions {

    private int qid;
    private String question;
    private List<String> answers;
    private Integer correctAnswer;

}
