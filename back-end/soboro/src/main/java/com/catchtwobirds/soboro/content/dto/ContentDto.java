package com.catchtwobirds.soboro.content.dto;

import com.catchtwobirds.soboro.content.entity.Content;
import lombok.*;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ContentDto {

    private Long contentNo;
    private Integer consultingNo;
    private String contentText;
    private Boolean contentSpeaker;

    @Builder
    public ContentDto(Content content) {
        this.contentNo = content.getContentNo();
        this.consultingNo = content.getConsultingNo();
        this.contentText = content.getContentText();
        this.contentSpeaker = content.getContentSpeaker();
    }
}
