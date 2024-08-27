package org.example.becoco.domain.post.domain.repository;

import org.example.becoco.domain.post.presentation.dto.response.ComplaintListElement;
import org.example.becoco.domain.post.domain.Post;
import org.example.becoco.domain.post.domain.type.Type;
import org.example.becoco.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<ComplaintListElement> findAllByType(Type type);
    List<ComplaintListElement> findAllByTypeAndUser(Type type, User user);
}
