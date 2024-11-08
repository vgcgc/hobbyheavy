package com.example.hobbyheavy.dto.response;

import com.example.hobbyheavy.entity.MeetupSchedule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScheduleResponse {
    private Long scheduleId;
    private Long meetupId;
    private LocalDateTime proposalDate;
    private LocalDateTime activateTime;
    private String status;
    private String participant;
    private Integer votes;
    private String location;

    public static ScheduleResponse fromEntity(MeetupSchedule entity) {
        return ScheduleResponse.builder()
                .scheduleId(entity.getScheduleId())
                .meetupId(entity.getMeetup().getMeetupId())
                .proposalDate(entity.getProposalDate())
                .activateTime(entity.getActivateTime())
                .status(entity.getStatus())
                .participant(entity.getParticipant())
                .votes(entity.getVotes())
                .location(entity.getLocation())
                .build();
    }
}
