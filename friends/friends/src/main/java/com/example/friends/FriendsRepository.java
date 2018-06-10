package com.example.friends;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.friends.Friends;



public interface FriendsRepository extends CrudRepository<Friends, Long> {
	Friends findByFriendName(String friendName);

}