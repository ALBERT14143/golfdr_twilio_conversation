package com.example.golfdr_twilio_conversation.app_interface;

import java.util.Map;

public interface AccessTokenInterface {
    default void onTokenStatusChange(Map status) {}
}