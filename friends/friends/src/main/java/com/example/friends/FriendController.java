package com.example.friends;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class FriendController {

	@Autowired
	private FriendsRepository friendsRepository;

	@GetMapping(path = "/saveFriends")
	public @ResponseBody String saveFriends(@RequestParam String name, @RequestParam String Job,
			@RequestParam String salary) {
		Friends friends = new Friends();
		friends.setFriendName(name);
		friends.setJob(Job);
		friends.setSalary(salary);

		friendsRepository.save(friends);
		return "savedFriends";

	}

	@GetMapping(path = "/getFriends")
	public @ResponseBody Friends getFriendsForGivenName(@RequestParam String friendName) {
		Friends f = friendsRepository.findByFriendName(friendName);
		return f;

	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Friends> getAllUsers() {
		return friendsRepository.findAll();

	}

}
