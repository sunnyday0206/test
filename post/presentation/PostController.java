package org.example.becoco.domain.post.presentation;

import lombok.RequiredArgsConstructor;
import org.example.becoco.domain.post.presentation.dto.response.ComplaintListResponse;
import org.example.becoco.domain.post.presentation.dto.response.NotificationListResponse;
import org.example.becoco.domain.post.presentation.dto.response.PostAllListResponse;
import org.example.becoco.domain.post.domain.type.Type;
import org.example.becoco.domain.post.service.PostListViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/post")
@RestController
public class PostController {
    private final PostListViewService listViewService;

    @GetMapping("/complaints")
    public ComplaintListResponse complaintsLitView(){
            return listViewService.complaintView(Type.COMPLAINT);
    }

    @GetMapping("/notifications")
    public NotificationListResponse notificationsLitView(){
        return listViewService.notificationView(Type.NOTIFICATION);
    }

    @GetMapping("/posts")
    public PostAllListResponse postAllLitView(){
        return listViewService.allPostsView();
    }
}
