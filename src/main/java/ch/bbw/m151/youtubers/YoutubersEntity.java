package ch.bbw.m151.youtubers;

import javax.persistence.*;

@Entity
public class YoutubersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rank;

    private String username;

    private String youtubeUrl;

    private String name;

    private String category;

    private Long amountSubscribers;

    private String country;

    private Long avgViews;

    private Long avgLikes;

    private Long avgComments;

}
