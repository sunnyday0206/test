package org.example.becoco.domain.post.service;

import jdk.jshell.spi.ExecutionControl;
import lombok.RequiredArgsConstructor;
import org.example.becoco.domain.post.exception.PostInvalidRequestException;
import org.example.becoco.domain.post.presentation.dto.response.*;
import org.example.becoco.domain.post.domain.type.Type;
import org.example.becoco.domain.post.domain.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostListViewService {
    private final PostRepository postRepository;

    @Transactional(readOnly = true)
    public NotificationListResponse notificationView(Type type) {
        if (type == Type.NOTIFICATION) {
            List<NotificationListElement> postList = postRepository.findAllByType(Type.NOTIFICATION)
                    .stream()
                    .map(post -> {
                        return NotificationListElement.builder()
                                .type(post.getType())
                                .title(post.getTitle())
                                .user(post.getUser())
                                .createDate(post.getCreateDate())
                                .build();
                    })
                    .toList();

            return new NotificationListResponse(postList);
        }
        throw new PostInvalidRequestException();
    }


    @Transactional(readOnly = true)
    public ComplaintListResponse complaintView(Type type) {
        if (type == Type.COMPLAINT) {
            List<ComplaintListElement> postList = postRepository.findAllByType(type)
                    .stream()
                    .map(post -> {
                        return ComplaintListElement.builder()
                                .type(post.getType())
                                .title(post.getTitle())
                                .user(post.getUser())
                                .createDate(post.getCreateDate())
                                .build();
                    })
                    .toList();

            return new ComplaintListResponse(postList);
        }
        throw new PostInvalidRequestException();
    }




    @Transactional(readOnly = true)
    public PostAllListResponse allPostsView() {
        List<NotificationListElement> noficationsList = postRepository.findAllByType(Type.NOTIFICATION)
                .stream()
                .map(post -> {
                    return NotificationListElement.builder()
                            .type(post.getType())
                            .title(post.getTitle())
                            .user(post.getUser())
                            .createDate(post.getCreateDate())
                            .build();
                })
                .toList();

        List<ComplaintListElement> complaintsList = postRepository.findAllByType(Type.COMPLAINT)
                .stream()
                .map(post -> {
                    return ComplaintListElement.builder()
                            .type(post.getType())
                            .title(post.getTitle())
                            .user(post.getUser())
                            .createDate(post.getCreateDate())
                            .build();
                        })
                .toList();


        return new PostAllListResponse(noficationsList, complaintsList);
    }
}