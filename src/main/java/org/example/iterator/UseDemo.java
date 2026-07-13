package org.example.iterator;

import org.example.iterator.impl.StudentList;

public class UseDemo {
    public static void main(String[] args) {
        MyCollection<String> studentList = new StudentList<>();
        studentList.add("张三");
        studentList.add("李四");
        studentList.add("王五");

        // 统一用迭代器遍历，和底层存储结构无关
        MyIterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println("学生：" + iterator.next());
        }
    }
}
