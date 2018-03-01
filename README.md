
Spring Boot 1.5.x から 2.0.x へのマイグレーション。

https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Migration-Guide

# application.properties の空白

プロパティの読み方が変わった。
2で新しく作られたっぽい `org.springframework.boot.env.OriginTrackedPropertiesLoader` で読んでる。

## application.properties

```
hogedriven.properties.tab=\t
hogedriven.properties.space=
hogedriven.properties.space.unicode=\u0020
```

## 実行結果

```
 :: Spring Boot ::       (v1.5.10.RELEASE)
tab   : <<<        >>>
space : <<<>>>
\u0020: <<< >>>

 :: Spring Boot ::        (v2.0.0.RELEASE)
tab   : <<<>>>
space : <<<>>>
\u0020: <<<>>>
```

