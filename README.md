# 仿牛客社区

## 数据库设计



## 社区首页

1. 帖子实体类、mapper 

2. 查询帖子方法，分页

3. 查询帖子数量

4. 帖子和用户查询方式

    1. sql关联查询
    2. 先查帖子，查出userId再查用户

    使用第2种，因为这样更直观，而且之后存redis更方便、性能更好

5. 主页展示，将帖子和用户返回给前端，放在model中

    1. index.html引入th模板，相对路径
    2. 帖子循环
        1. 用户头像
        2. 帖子内容th:utext
        3. 判断帖子类型是置顶还是精华 th:if
        4. 用户名
        5. 时间格式化

### 首页，前10

### 分页

1. 获取当前页行的偏移量
2. 获得总页数
3. 获取起始页码
4. 获取结束页码
