package com.shj.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (QuestionTable)实体类
 *
 * @author shj
 * @since 2020-05-25 10:35:59
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)//链式编程
public class QuestionTable implements Serializable {
    private static final long serialVersionUID = 815562441577981139L;
    
    private Integer qid;
    
    private String question;
    
    private Integer correctanswer;



}