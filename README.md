# tmall_springboot

Pojo

Dao

    interface接口
    继承 JpaRepository
    使用 内嵌hibernate

Service

    使用了缓存配置
        @CacheConfig
        @CacheConfig(cacheNames="categories")
        @CacheEvict(allEntries=true)	//@CacheEvict是清除缓存的注解，allEntries为true时，意思是说这个清除缓存是清除当前value值空间下的所有缓存数据
        @Cacheable(key="'categories-page-'+#p0+ '-' + #p1") //添加缓存。＃p0表示方法的第一个参数，＃p1表示第二个参数
Controller

View

整体框架
    spring springboot springmvc

中间件

    ElasticSearch
        Elasticsearch是一个基于Lucene的搜索服务器。
        它提供了一个分布式多用户能力的全文搜索引擎，基于RESTful web接口。
        Elasticsearch是用Java语言开发的，并作为Apache许可条款下的开放源码发布，是一种流行的企业级搜索引擎。
        Elasticsearch用于云计算中，能够达到实时搜索，稳定，可靠，快速，安装使用方便。
        官方客户端在Java、.NET（C#）、PHP、Python、Apache Groovy、Ruby和许多其他语言中都是可用的。
        根据DB-Engines的排名显示，Elasticsearch是最受欢迎的企业搜索引擎，其次是Apache Solr，也是基于Lucene。
    安全框架shiro
    缓存redis
    nginx负载均衡


前端

    html css js
    json ajax jquery bootstrap vue.js

    http://localhost:8080/tmall_springboot/home

功能：后台进行分类、用户、订单管理等；前台用于用户进行浏览、购买商品等。
环境：win10、Linux、idea、maven、MySQL
技术：Spring Boot、Spring、Spring MVC、Redis、Shiro、Elasticsearch、jQuery、bootstrap、vue.js
技术描述：
1. 基础模块的CRUD
2. 使用Shiro权限框架分配给不同登录用户的角色
3. 使用Redis对数据进行缓存处理
4. 使用Elasticsearch搜索引擎进行全文搜索
5. 使用jQuery、bootstrap、vue.js对页面进行渲染
