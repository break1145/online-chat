package com.chat.server.common.websocket;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;

/**
 * NettyUtil 提供了一些工具方法，用于操作 Netty Channel 的属性。
 * 该类定义了一些常用的属性键，包括 TOKEN、IP、UID 和 HANDSHAKER。
 */
public class NettyUtil {

    // 用于存储身份验证令牌的属性键
    public static AttributeKey<String> TOKEN = AttributeKey.valueOf("token");
    // 用于存储客户端 IP 地址的属性键
    public static AttributeKey<String> IP = AttributeKey.valueOf("ip");
    // 用于存储用户 ID 的属性键
    public static AttributeKey<Long> UID = AttributeKey.valueOf("uid");
    // 用于存储 WebSocket 握手器的属性键
    public static AttributeKey<WebSocketServerHandshaker> HANDSHAKER_ATTR_KEY = AttributeKey.valueOf(WebSocketServerHandshaker.class, "HANDSHAKER");

    /**
     * 设置属性，将给定的键值对存入指定的 channel。
     *
     * @param channel     要设置属性的 channel
     * @param attributeKey 属性键
     * @param data        属性值
     * @param <T>        属性值类型
     */
    public static <T> void setAttr(Channel channel, AttributeKey<T> attributeKey, T data) {
        Attribute<T> attr = channel.attr(attributeKey);
        attr.set(data);
    }

    /**
     * 获取指定 channel 上的属性值。
     *
     * @param channel     要获取属性的 channel
     * @param ip 属性键
     * @param <T>        属性值类型
     * @return 属性值，如果不存在则返回 null
     */
    public static <T> T getAttr(Channel channel, AttributeKey<T> ip) {
        return channel.attr(ip).get();
    }
}
