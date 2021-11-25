概要
-------------------------

以下の要素を含む簡単な Spring Boot アプリケーションです。

* REST API で CRUD 操作
* Swagger UI で Open API ドキュメント（API 仕様書）作成

#### API一覧

| HTTPメソッド | エンドポイント         | 処理          |
|------------|----------------------|---------------|
| `GET`      | `/api/v1/tasks/`     | タスクを全件取得 |
| `POST`     | `/api/v1/tasks/`     | タスクを登録    |
| `GET`      | `/api/v1/tasks/{id}` | タスクを1件取得 |
| `PUT`      | `/api/v1/tasks/{id}` | タスクを更新    |
| `DELETE`   | `/api/v1/tasks/{id}` | タスクを削除    |

画面
-------------------------

実装した REST API を Swagger UI で操作します。

#### Swagger UI トップページ
<img width="600" src="https://user-images.githubusercontent.com/59589496/134793692-b45ce809-9954-4d49-b598-82e51a2d0b29.png">

#### 登録
<img width="600" src="https://user-images.githubusercontent.com/59589496/134793932-1261a5af-db03-4e93-b037-33e4a3c8d691.png">

※ 同様にタスクを3件登録  

#### 全件取得
<img width="600" src="https://user-images.githubusercontent.com/59589496/134794047-ede813f8-a930-45f2-8a1a-a3728220e4e0.png">

#### 1件取得
<img width="600" src="https://user-images.githubusercontent.com/59589496/134794144-429fa314-d7d9-46f2-95de-1350b08fac79.png">

#### 更新
<img width="600" src="https://user-images.githubusercontent.com/59589496/134794274-cd7908a9-6d79-45eb-af3b-5d059518a15b.png">

#### 削除
<img width="600" src="https://user-images.githubusercontent.com/59589496/134794349-6315a19e-026a-4ec3-b93f-0af2acd1d5bc.png">

フォルダ構成
-------------------------

<img width="320" src="https://user-images.githubusercontent.com/59589496/134794395-596542cb-95b4-4424-970a-013d28d44eb4.png">

依存関係
-------------------------

* Spring Boot DevTools
* Spring Web
* Validation
* Spring Data JPA
* H2 Database
* Lombok
* Springdoc OpenAPI UI
