package org.example.iterator;

// 抽象迭代器：定义遍历的统一规范
public interface MyIterator<E> {
    // 判断是否还有下一个元素
    boolean hasNext();

    // 获取下一个元素
    E next();
}
