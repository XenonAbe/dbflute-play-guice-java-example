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

* DBFlute関係をサブプロジェクトとして本体と分離しています (modules/dbflute)

## 参考

Global.java でGuice、DBFlute、Springの初期設定をしています。
以下参考リンク
* DBFlute - Guice連携に関して -- [Google Guiceの取扱い](http://dbflute.seasar.org/ja/manual/reference/diway/guice/)
* PlayFramework使用時のDBFluteのAccessContext設定 - [複数スレッドに渡るTransactionへの対応](https://github.com/seasarorg/dbflute-play/issues/6#issuecomment-42439800) ()
* PlayFrameworkでGuiceを使用する - [JavaInjection](https://www.playframework.com/documentation/2.3.x/JavaInjection)
* Springのトランザクション管理 - [(その14)トランザクション管理 - あるまに](http://d.hatena.ne.jp/arumani/20070327/1175006088)
* PlayFrameworkでモジュールを別プロジェクトにする -- [Working with sub-projects](https://www.playframework.com/documentation/2.3.x/SBTSubProjects)

## 謝辞
サンプルDBおよびそのDBからのDBFlute生成ソースは、[dbflute-guice-example](https://github.com/seasarorg/dbflute-example-container/tree/master/dbflute-guice-example) のDB及びソースを使用させていただきました。
