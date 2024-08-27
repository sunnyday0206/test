package org.example.becoco.domain.post.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PostAllListResponse {
    private final List<NotificationListElement> notificationsList;
    private final List<ComplaintListElement> complaintsList;
}
