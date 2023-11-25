package softuni.TheChefRestaurant.TheChefRestaurant.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="comments")
public class Comment extends BaseEntity{
    private Boolean approved;
    private String textContent;
    private LocalDateTime created;
    private UserEntity author;
    private Reservation reservation;

    public Comment() {
    }
   @Column(nullable = false)
    public Boolean getApproved() {
        return approved;
    }
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
    @Column(nullable = false, columnDefinition = "TEXT")
    public String getTextContent() {
        return textContent;
    }
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
   @Column(name="created", nullable = false)
    public LocalDateTime getCreated() {
        return created;
    }
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
   @ManyToOne
    public UserEntity getAuthor() {
        return author;
    }
    public void setAuthor(UserEntity author) {
        this.author = author;
    }
   @ManyToOne
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
