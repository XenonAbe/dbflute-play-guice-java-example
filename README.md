# DBFlute Play Framework 2 Example

Play Framework 2 上で DBFluteを使用するサンプルです。

## 特徴

* Spring FrameworkのTransaction Managementを使用。メソッドに@Transactionalアノテーションを付加してトランザクション管理 (例外発生時にロールバック)
* コネクションプールにはPlay組み込みのBoneCPを使用
* Dependency InjectionライブラリにGoogle Guiceを使用
* O/RマッパーにDBFluteを使用
* 設定ファイルに追加設定不要(PlayFrameworkとして必要な記述のみ)

## 動作方法

activator.bat を実行し、run コマンドで起動

TODO: 
  現在、http://localhost:9000/test_insert でDBに1件登録するのみ。2回目以降はキー違反で例外発生。

## その他

* DBFlute関係をサブプロジェクトとして本体と分離しています

## 謝辞
サンプルDBおよびそのDBからのDBFlute生成ソースは、dbflute-guice-example (https://github.com/seasarorg/dbflute-example-container/tree/master/dbflute-guice-example) の
DB及びソースを使用させていただきました。
