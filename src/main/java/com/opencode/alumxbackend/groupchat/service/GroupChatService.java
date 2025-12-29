package com.opencode.alumxbackend.groupchat.service;

import com.opencode.alumxbackend.groupchat.dto.GroupChatRequest;
import com.opencode.alumxbackend.groupchat.model.GroupChat;
import com.opencode.alumxbackend.groupchat.model.Participant;
import com.opencode.alumxbackend.groupchat.repository.GroupChatRepository;
import com.opencode.alumxbackend.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


public interface GroupChatService {

    GroupChat createGroup(GroupChatRequest request);

    GroupChat getGroupById(Long groupId);

    List<GroupChat> getGroupsForUser(String userId);


}
