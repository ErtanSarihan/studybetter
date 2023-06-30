package com.studybetter.studybetter.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBL_USER")
public class User  {

    @Id
    private String username;
    private String password;
    private int coins;
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Session> sessions = new ArrayList<>();


    public Duration getTotalSuccessfulSessionDuration() {
        Duration totalDuration = Duration.ZERO;
        for (Session session : sessions) {
            if (session.isSuccessStatus()) {
                totalDuration = totalDuration.plus(session.getDuration());
            }
        }
        return totalDuration;
    }


}
