package top.auzqy.design.pattern.structural.flyweight.example4;
 
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
 
        WebSite fx = factory.getWebSiteCategory("产品展示");
        fx.use();
 
        WebSite fy = factory.getWebSiteCategory("产品展示");
        fy.use();
 
        WebSite fz = factory.getWebSiteCategory("产品展示");
        fz.use();
 
        WebSite fa = factory.getWebSiteCategory("博客");
        fa.use();
 
        WebSite fb = factory.getWebSiteCategory("博客");
        fb.use();
 
        WebSite fc = factory.getWebSiteCategory("博客");
        fc.use();
 
        System.out.println("网站分类总数为：" + factory.getWebSiteCount());
    }
}