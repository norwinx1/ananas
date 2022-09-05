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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public void setYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getAmountSubscribers() {
        return amountSubscribers;
    }

    public void setAmountSubscribers(Long amountSubscribers) {
        this.amountSubscribers = amountSubscribers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getAvgViews() {
        return avgViews;
    }

    public void setAvgViews(Long avgViews) {
        this.avgViews = avgViews;
    }

    public Long getAvgLikes() {
        return avgLikes;
    }

    public void setAvgLikes(Long avgLikes) {
        this.avgLikes = avgLikes;
    }

    public Long getAvgComments() {
        return avgComments;
    }

    public void setAvgComments(Long avgComments) {
        this.avgComments = avgComments;
    }
}
