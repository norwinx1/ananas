package ch.bbw.m151.ananas;

import javax.persistence.*;

@Entity
public class PineappleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String type;

    @ManyToOne(fetch = FetchType.EAGER)
    private FarmerEntity farmer;

    private Integer quality;

    private Integer weight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer name) {
        this.weight = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public FarmerEntity getFarmer() {
        return farmer;
    }

    public void setFarmer(FarmerEntity farmer) {
        this.farmer = farmer;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }
}
