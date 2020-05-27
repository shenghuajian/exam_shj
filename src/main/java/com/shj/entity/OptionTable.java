package com.shj.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (OptionTable)实体类
 *
 * @author shj
 * @since 2020-05-25 10:35:26
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)//链式编程
public class OptionTable implements Serializable {
    private static final long serialVersionUID = -90721346718182853L;
    
    private Integer oid;
    
    private Integer optionRank;
    
    private String optionText;



}