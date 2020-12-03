package edu.nf.hw08.entity;

import lombok.Data;

/**
 * @author 天文学
 */
@Data
public class IdCard {
    private Integer cardId;
    private String cardNum;
    private Student student;
}
