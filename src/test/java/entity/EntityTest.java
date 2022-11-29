package entity;


import com.nhnacademy.dbapp.jpa.config.RootConfig;
import com.nhnacademy.dbapp.jpa.config.WebConfig;
import com.nhnacademy.dbapp.jpa.entity.LikeAtPost;
import com.nhnacademy.dbapp.jpa.entity.Post;
import com.nhnacademy.dbapp.jpa.entity.Reply;
import com.nhnacademy.dbapp.jpa.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@Transactional
@ContextHierarchy({
    @ContextConfiguration(classes = RootConfig.class),
    @ContextConfiguration(classes = WebConfig.class)
})
public class EntityTest {
    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testOrderEntity() {
        User user = new User();
        user.setUserId(1L);
        user.setUsername("aaa");
        user.setPassword("pass");
        user.setCreatedAt(LocalDateTime.now());

        entityManager.persist(user);

        Post post = new Post();
        post.setWriteUser(user);
        post.setTitle("title");
        post.setContent("content");
        post.setCreatedAt(LocalDateTime.now());

        entityManager.persist(post);

        Reply reply = new Reply();

        reply.setUser(user);
        reply.setPost(post);
        reply.setContent("ReplyContent");
        reply.setCreatedAt(LocalDateTime.now());

        entityManager.persist(reply);
    }

}
