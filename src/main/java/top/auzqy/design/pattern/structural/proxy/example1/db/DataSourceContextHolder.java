package top.auzqy.design.pattern.structural.proxy.example1.db;

/**
 * @Description: 这个类与代理模式无关
 *              仅仅是为了将数据库的分库模拟的更加真实而已
 *
 * @Author: zqy
 * @CreateTime: 2019-07-21 23:01
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }
    public static String getDBType(){
        return (String)CONTEXT_HOLDER.get();
    }
    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }
}
