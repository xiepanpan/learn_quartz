# learn_quartz
quartz的两种存储方式
RAMJobStore和JDBCJobStore

JDBCJobStore：
支持集群，因为所有的任务信息都会保存到数据库中，可以控制事物，还有就是如果应用服务器关闭或者重启，任务信息都不会丢失，并且可以恢复因服务器关闭或者重启而导致执行失败的任务

参考博客：
https://blog.csdn.net/u010648555/article/details/54863144
