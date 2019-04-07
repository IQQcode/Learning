java类集[JDK1.2]
        ---动态数组(当数组元素达到最大时，动态增加容量),解决数组定长问题


面试考点：

List接口：
1.ArrayList与Vector区别；
2.ArrayList线程不安全的List集合；了解JUC包下的线程安全List(CopyWiterArrayList)


Set:
1.Set集合与Map集合的关系
2.hashCode,equals方法关系
3.Comparable,Compartor接口的关系


Map:
1.请对比HashMap，hashtable关系
2.是否了解ConcurrentHashMap以及实现原理



********************  ArrayList 与 Vector区别  *************************

1. 历史时间:ArrayList是从JDK1.2提供的，而Vector是从JDK1.0就提供了。

2.初始化策略区别：
  Vector在无参构造时执行后将对象数组大小初始化为10
  ArrayList采用懒加载策略，在构造方法阶段并不初始化对象数组，
  在第一次添加元素时才初始化对象数组大小为10

3.ArrayList扩容时，新数组大小为原数组的1.5倍；
  Vectork扩容时，新数组大小为原数组的2倍

4. 线程安全：ArrayList是异步处理， 非线程安全，性能更高；
            Vector是在方法上加锁，性能安全同步处理，性能较低。

5.遍历区别：
                                                  
输出形式：ArrayList支持Iterator、ListIterator、foreach；
         Vector   支持Iterator、ListIterator、foreach、Enumeration。




 **** ArrayList 与 LinkedList区别 :

    LinkedList底层采用双向链表实现，ArrayList底层采用数组实现，Vector 底层采用数组实现



    Comparable接口与Compartor接口区别：

     在java中，若想实现自定义类的比较，提供了以下俩个接口：

-*- java.lang.Comparable接口(内部比较器)---排序接口：
    若一个类实现了Comparable接口，就意味着该类支持排序；

        存放该类的Conllection或数组，可以直接通过Collections.sort()或Arrays.sort进行排序

        ---实现了Comparable接口的类可以直接存放在TreeSet或TreeMap中





