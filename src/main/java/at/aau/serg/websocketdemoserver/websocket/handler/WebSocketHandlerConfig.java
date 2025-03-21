package at.aau.serg.websocketdemoserver.websocket.handler;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketHandlerConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(@NonNull WebSocketHandlerRegistry registry) {
        registry.addHandler(new WebSocketHandlerImpl(), "/websocket-example-handler")
                .setAllowedOrigins("*");
    }
}
