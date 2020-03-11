package top.auzqy.design.pattern.creational.prototype;

import java.io.*;
import java.util.HashMap;

/**
 * 深拷贝的两种方式
 *
 * 第一种方法：
 * 递归拷贝对象、对象的引用对象以及引用对象的引用对象……
 * 直到要拷贝的对象只包含基本数据类型数据，
 * 没有引用对象为止。根据这个思路对之前的代码进行重构。
 *
 *
 * 第二种方式：
 * 先将对象序列化，然后再反序列化成新的对象
 */
public class DeepClone {

    private HashMap<String, SearchWord> currentKeywords=new HashMap<>();
    public void deepCopyWay1() {
        HashMap<String, SearchWord> newKeywords = new HashMap<>();
        for(HashMap.Entry<String, SearchWord> e : currentKeywords.entrySet())

        {
            SearchWord searchWord = e.getValue();
            SearchWord newSearchWord = new SearchWord(
                    searchWord.getKeyword(),
                    searchWord.getCount(),
                    searchWord.getLastUpdateTime());
            newKeywords.put(e.getKey(), newSearchWord);
        }
    }

    public Object deepCopy(Object object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(object);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);

        return oi.readObject();
    }

    private class SearchWord {
        private final Object keyword;
        private final Object count;
        private final Object lastUpdateTime;

        public SearchWord(Object keyword, Object count, Object lastUpdateTime) {
            this.keyword = keyword;
            this.count = keyword;
            this.lastUpdateTime = keyword;
        }

        public Object getKeyword() {
            return keyword;
        }

        public Object getCount() {
            return count;
        }

        public Object getLastUpdateTime() {
            return lastUpdateTime;
        }
    }
}
