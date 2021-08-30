# BothCacheDemo
both cache demo

run com.supalle.bothcachedemo.BothCacheDemoApplication#main

```shell
 curl http://localhost:8080/user?username=supalle
```

logs
```shell
2021-08-30 15:38:43.634  INFO 22076 --- : find user from database:User{username='supalle', password='123', age=18, email='supalle@qq.com', firstname='Lino', lastname='Supalle'}
2021-08-30 15:38:46.035  INFO 22076 --- : cache key supalle use redis cache
2021-08-30 15:38:47.215  INFO 22076 --- : cache key supalle use local cache
2021-08-30 15:38:47.822  INFO 22076 --- : cache key supalle use local cache
2021-08-30 15:38:48.545  INFO 22076 --- : cache key supalle use local cache
2021-08-30 15:38:49.421  INFO 22076 --- : cache key supalle use local cache
2021-08-30 15:38:50.845  INFO 22076 --- : cache key supalle use local cache
2021-08-30 15:38:51.658  INFO 22076 --- : cache key supalle use redis cache
2021-08-30 15:38:52.278  INFO 22076 --- : cache key supalle use local cache
2021-08-30 15:38:52.919  INFO 22076 --- : cache key supalle use local cache
```
