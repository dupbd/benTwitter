package com.tts.BensTwitter.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.BensTwitter.model.Tweet;
import com.tts.BensTwitter.model.User;


@Repository
public interface TweetRepository extends CrudRepository<Tweet, Long> {
	List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);
	List<Tweet> findByTags_PhraseOrderByCreatedAtDesc(String phrase);
	List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);
	List<Tweet> findAllByOrderByCreatedAtDesc();
}