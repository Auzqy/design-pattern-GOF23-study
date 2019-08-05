package top.auzqy.design.pattern.behavioral.chainofresponsibility.example1;

import lombok.Data;

/**
 * description:  课程（审批的具体内容）
 * createTime: 2019-08-05 16:26
 * @author zqy
 */
@Data
public class Course {
    private String name;

    // 手记
    private String article;

    // 视频
    private String video;
}
