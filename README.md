# DBFlute Play Framework 2 Example
[DBFlute](http://dbflute.seasar.org/)を[Play Framework](https://www.playframework.com/) 2.3.x 上で 使用するサンプルです。

## Overview

* O/Rマッパーに[DBFlute](http://dbflute.seasar.org/ja/introduction/index.html)を使用
* Web Frameworkに[Play Framework](https://www.playframework.com/)を使用
* [Spring Framework](https://projects.spring.io/spring-framework/)の[Transaction Management](https://docs.spring.io/spring/docs/4.0.3.RELEASE/spring-framework-reference/html/transaction.html)を使用。例えば、メソッドに@Transactionalアノテーション([Reference](https://docs.spring.io/spring/docs/4.0.3.RELEASE/spring-framework-reference/html/transaction.html#transaction-declarative-annotations))を付加したり、TransactionTemplate([Reference](https://docs.spring.io/spring/docs/4.0.3.RELEASE/spring-framework-reference/html/transaction.html#tx-prog-template))を使用したトランザクション制御を行うことができる。混在も可能。基本的な、通常実行時にはCommit例外発生時にRollbackする動作の他、柔軟なトランザクション制御([e.g.Transaction propagation](https://docs.spring.io/spring/docs/4.0.3.RELEASE/spring-framework-reference/html/transaction.html#tx-propagation))が可能
* コネクションプールにPlay Framework組み込みのBoneCPを使用
* Dependency InjectionライブラリにGoogle Guiceを使用

## How to run
Run this using sbt. (see [Installing sbt](http://www.scala-sbt.org/1.x/docs/Setup.html))

Start the Play app:

```
sbt run
```

And open http://localhost:9000/

## How to test

テストを実行します

```
sbt test
```

`test.functional.TransactionTestService`クラスに多様なトランザクション処理の記述例があります

## その他

#### サブプロジェクト
DBFlute関係(DBFluteクライアント、エンジン、生成ソース)をサブプロジェクトとしてメインプロジェクトと分離しています (dbfluteディレクトリ)

#### ログ出力
Play Framework デフォルトのログ出力は非常にシンプルですが、このサンプルではActionやTransactionの開始・終了、実行SQLがログで確認出来るよう設定しています

#### 非同期処理
データベース処理用のカスタムExecutionContextを使用した非同期処理のサンプルがあります

#### 参考リンク
* DBFlute - Guice連携に関して -- [Google Guiceの取扱い](http://dbflute.seasar.org/ja/manual/reference/diway/guice/)
* PlayFramework使用時のDBFluteのAccessContext設定 - [複数スレッドに渡るTransactionへの対応](https://github.com/seasarorg/dbflute-play/issues/6#issuecomment-42439800)
* Springのトランザクション管理 - [(その14)トランザクション管理 - あるまに](http://d.hatena.ne.jp/arumani/20070327/1175006088)
* PlayFrameworkでGuiceを使用する - [JavaInjection](https://www.playframework.com/documentation/2.3.x/JavaInjection)

## 謝辞
サンプルの動作は [play-java-forms-example](https://github.com/playframework/play-java-forms-example) を参考にさせていただきました。
