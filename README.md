# SprigBootSample

## Authentication

- pom.xml の以下パッケージで BASIC 認証を追加
  - デフォルトユーザは user
  - パスワードはターミナルに出力される
  - application.properties に設定をするとそちらが優先される

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
```
