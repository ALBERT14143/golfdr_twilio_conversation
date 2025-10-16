package com.example.golfdr_twilio_conversation.app_interface;

import com.twilio.conversations.Conversation;

import java.util.Map;

public interface MessageInterface {
    default void onMessageUpdate(Map message) {}
    default void onSynchronizationChanged(Map status) {}
}