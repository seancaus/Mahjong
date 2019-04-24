package com.ziv.cards.server;

import org.springframework.beans.factory.annotation.Value;

public abstract class BaseServer implements IServer{

    @Value("${server.port}")
    protected int port;

}
