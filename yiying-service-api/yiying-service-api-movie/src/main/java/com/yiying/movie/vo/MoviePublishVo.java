package com.yiying.movie.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MoviePublishVo {
    private String title;
    private String poster;
    private Integer runtime;
    private String subjectLevelOne;
    private String subjectLevelTwo;
    private String subjectLevelOneYear;
    private String subjectLevelTwoYear;
    private String subjectLevelOneGenres;
    private String subjectLevelTwoGenres;
    private String actors;
    private String directors;
    private String wriyer;
    private BigDecimal price;
}
