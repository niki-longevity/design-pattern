package org.example.iterator.impl;

import org.example.iterator.MyCollection;
import org.example.iterator.MyIterator;

import java.util.Arrays;

// 具体聚合：学生列表集合
public class StudentList<E> implements MyCollection<E> {
    // 内部存储：数组，外部不可访问
    private Object[] elements;
    // 实际元素个数
    private int size;
    // 默认容量
    private static final int DEFAULT_CAPACITY = 10;

    public StudentList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // 创建迭代器：返回内部迭代器实例
    @Override
    public MyIterator<E> iterator() {
        return new StudentListIterator();
    }

    @Override
    public void add(E element) {
        // 简单扩容逻辑
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    @Override
    public int size() {
        return size;
    }

    // 具体迭代器：内部类实现，可以直接访问外部类的数组数据
    private class StudentListIterator implements MyIterator<E> {
        // 当前遍历的索引位置
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        @SuppressWarnings("unchecked")
        public E next() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("已到集合末尾");
            }
            return (E) elements[index++];
        }
    }
}
