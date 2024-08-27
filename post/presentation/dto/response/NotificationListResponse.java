package org.example.becoco.domain.post.presentation.dto.response;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class NotificationListResponse {
    private final List<NotificationListElement> notificationsList;
}
