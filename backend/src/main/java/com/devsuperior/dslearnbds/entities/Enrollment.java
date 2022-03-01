package com.devsuperior.dslearnbds.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment {

    @EmbeddedId
    private EnrollmentPK id = new EnrollmentPK();

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;

    private boolean availabe;
    private  boolean onlyUpdate;

    public Enrollment() {
    }

    public Enrollment(User user, Offer offer, Instant enrollment, Instant refundMoment, boolean availabe, boolean onlyupdate) {
        id.setUser(user);
        id.setOffer(offer);
        this.enrollMoment = enrollment;
        this.refundMoment = refundMoment;
        this.availabe = availabe;
        this.onlyUpdate = onlyupdate;
    }

    public User getStudent(){
        return id.getUser();
    }

    public void setStudent(User user) {
        id.setUser(user);
    }

    public Offer getOffer() {
        return id.getOffer();
    }

    public void setOffer(Offer offer) {
        id.setOffer(offer);
    }

    public Instant getEnrollment() {
        return enrollMoment;
    }

    public void setEnrollment(Instant enrollment) {
        this.enrollMoment = enrollment;
    }

    public Instant getRefundMoment() {
        return refundMoment;
    }

    public void setRefundMoment(Instant refundMoment) {
        this.refundMoment = refundMoment;
    }

    public boolean isAvailabe() {
        return availabe;
    }

    public void setAvailabe(boolean availabe) {
        this.availabe = availabe;
    }

    public boolean isOnlyupdate() {
        return onlyUpdate;
    }

    public void setOnlyupdate(boolean onlyupdate) {
        this.onlyUpdate = onlyupdate;
    }
}
