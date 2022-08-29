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

    @Column(nullable = true)
    private long amountSubscribers;

    private String country;

    @Column(nullable = true)
    private long avgViews;

    @Column(nullable = true)
    private long avgLikes;

    @Column(nullable = true)
    private long avgComments;

}
