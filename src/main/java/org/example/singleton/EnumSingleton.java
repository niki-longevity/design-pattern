package org.example.singleton;

// 枚举饿汉式，唯一不会被破环的单例模式。反序列化创建对象时考虑这个
public enum EnumSingleton {
    // 唯一枚举实例，天然单例
    INSTANCE;

    public void sendMessage() {
        System.out.println("发送消息");
    }

    // 调用方式：EnumSingleton.INSTANCE.send();
}
