package onboarding.problem7.collections;

import onboarding.problem7.wrapper.Friend;
import onboarding.problem7.wrapper.User;

import java.util.List;
import java.util.stream.Collectors;

public class FriendList {

    private final List<Friend> friendList;

    public FriendList(List<Friend> friends) {
        validateFriendsLength(friends);
        this.friendList = friends;
    }

    private void validateFriendsLength(List<Friend> friends) {
        int friendsLength = friends.size();
        if (friendsLength > 10000 || friendsLength < 1) {
            throw new IllegalArgumentException("FriendList 길이는 1이상 10000이하여야 합니다.");
        }
    }

    public List<User> getFriendListOf(User user) {
        return friendList.stream()
                .filter(x -> x.contains(user))
                .map(x -> x.getFriendOf(user))
                .collect(Collectors.toList());
    }
}