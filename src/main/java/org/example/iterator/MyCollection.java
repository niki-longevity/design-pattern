package org.example.iterator;

// 抽象聚合接口：集合的抽象接口
public interface MyCollection<E> {
    // 创建迭代器
    MyIterator<E> iterator();

    // 添加元素
    void add(E element);

    // 获取集合大小
    int size();
}
