package org.example.becoco.domain.post.presentation.dto.response;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ComplaintListResponse {
    private final List<ComplaintListElement> complaintsList;
}
